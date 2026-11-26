package com.enhancedchatnotifications;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

public class EnhancedChatNotificationsOverlay extends Overlay
{
	// Same grace period as RuneLite's own screen flash: interactions during the first two seconds are
	// ignored so the click that triggered the notification cannot dismiss it immediately.
	private static final long MINIMUM_DISPLAY_MILLIS = 2000;
	private static final int INTERACTION_IDLE_TICKS = (int) (MINIMUM_DISPLAY_MILLIS / Constants.CLIENT_TICK_LENGTH);

	// The config panel's text field cannot hold a line break reliably, so "<enter>" is used as a marker.
	private static final Pattern LINE_BREAK = Pattern.compile("<enter>", Pattern.CASE_INSENSITIVE);

	private final List<OverlayEntry> entries = new CopyOnWriteArrayList<>();

	@Inject
	private Client client;

	@Inject
	private ClientUI clientUI;

	@Inject
	private EnhancedChatNotificationsOverlay()
	{
		setPosition(OverlayPosition.TOP_LEFT);
		// Draw on top of the minimap, inventory, chatbox and right-click menu instead of behind them.
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
	}

	public void addEntry(int listIndex, String text, Color color, Color bgColor, int fontSize, OverlayDisplayMode mode, int durationSeconds, int offsetX, int offsetY)
	{
		entries.removeIf(e -> e.listIndex == listIndex);

		Instant addedAt = Instant.now();
		Instant expireTime;
		if (mode == OverlayDisplayMode.SOLID_UNTIL_CANCELLED)
		{
			expireTime = Instant.MAX;
		}
		else
		{
			expireTime = addedAt.plusSeconds(durationSeconds);
		}

		boolean flash = (mode == OverlayDisplayMode.FLASH_TIMED);
		boolean untilCancelled = (mode == OverlayDisplayMode.SOLID_UNTIL_CANCELLED);
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, fontSize);
		entries.add(new OverlayEntry(listIndex, splitLines(text), color, bgColor, font, addedAt, expireTime, flash, untilCancelled, offsetX, offsetY,
			client.getMouseLastPressedMillis()));
	}

	public void cancelEntry(int listIndex)
	{
		entries.removeIf(e -> e.listIndex == listIndex);
	}

	public void clearEntries()
	{
		entries.clear();
	}

	public boolean hasEntries()
	{
		return !entries.isEmpty();
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (entries.isEmpty())
		{
			return null;
		}

		Instant now = Instant.now();
		long currentMs = System.currentTimeMillis();
		entries.removeIf(e -> now.isAfter(e.expireTime) || isCancelled(e, now));

		int maxX = 0;
		int maxY = 0;
		boolean anyRendered = false;

		for (OverlayEntry entry : entries)
		{
			// For flashing entries, skip rendering every other 500ms cycle
			if (entry.flash && (currentMs / 500) % 2 == 0)
			{
				continue;
			}

			graphics.setFont(entry.font);
			FontMetrics fm = graphics.getFontMetrics();

			int textWidth = 0;
			for (String line : entry.lines)
			{
				textWidth = Math.max(textWidth, fm.stringWidth(line));
			}

			int lineHeight = fm.getHeight();
			int textHeight = lineHeight * entry.lines.size();
			int padding = 4;

			// Draw background
			graphics.setColor(entry.bgColor);
			graphics.fillRect(entry.offsetX - padding, entry.offsetY, textWidth + padding * 2, textHeight + 2);

			// Draw text
			graphics.setColor(entry.color);
			for (int line = 0; line < entry.lines.size(); line++)
			{
				graphics.drawString(entry.lines.get(line), entry.offsetX, entry.offsetY + fm.getAscent() + line * lineHeight);
			}

			maxX = Math.max(maxX, entry.offsetX + textWidth + padding * 2);
			maxY = Math.max(maxY, entry.offsetY + textHeight + 2);
			anyRendered = true;
		}

		if (!anyRendered)
		{
			return null;
		}

		return new Dimension(maxX, maxY);
	}

	/**
	 * Splits the configured text into the lines that are drawn. A literal {@code <enter>} is treated
	 * as a line break so multiple lines can be configured from the config panel.
	 */
	static List<String> splitLines(String text)
	{
		return Arrays.asList(LINE_BREAK.matcher(text).replaceAll("\n").split("\\R", -1));
	}

	/**
	 * Solid-until-cancelled notifications are dismissed by the first mouse movement, mouse click or key
	 * press in the client, exactly like RuneLite's own screen flash (see {@code Notifier#processFlash}).
	 */
	private boolean isCancelled(OverlayEntry entry, Instant now)
	{
		if (!entry.untilCancelled
			|| Duration.between(entry.addedAt, now).toMillis() < MINIMUM_DISPLAY_MILLIS
			|| !clientUI.isFocused())
		{
			return false;
		}

		return client.getMouseIdleTicks() < INTERACTION_IDLE_TICKS
			|| client.getKeyboardIdleTicks() < INTERACTION_IDLE_TICKS
			|| client.getMouseLastPressedMillis() > entry.mouseLastPressedMillis;
	}

	private static class OverlayEntry
	{
		final int listIndex;
		final List<String> lines;
		final Color color;
		final Color bgColor;
		final Font font;
		final Instant addedAt;
		final Instant expireTime;
		final boolean flash;
		final boolean untilCancelled;
		final int offsetX;
		final int offsetY;
		final long mouseLastPressedMillis;

		OverlayEntry(int listIndex, List<String> lines, Color color, Color bgColor, Font font, Instant addedAt, Instant expireTime, boolean flash, boolean untilCancelled, int offsetX, int offsetY, long mouseLastPressedMillis)
		{
			this.listIndex = listIndex;
			this.lines = lines;
			this.color = color;
			this.bgColor = bgColor;
			this.font = font;
			this.addedAt = addedAt;
			this.expireTime = expireTime;
			this.flash = flash;
			this.untilCancelled = untilCancelled;
			this.offsetX = offsetX;
			this.offsetY = offsetY;
			this.mouseLastPressedMillis = mouseLastPressedMillis;
		}
	}
}
