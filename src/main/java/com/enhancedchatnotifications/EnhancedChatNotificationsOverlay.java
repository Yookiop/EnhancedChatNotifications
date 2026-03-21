package com.enhancedchatnotifications;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;

public class EnhancedChatNotificationsOverlay extends Overlay
{
	private final List<OverlayEntry> entries = new CopyOnWriteArrayList<>();

	@Inject
	private EnhancedChatNotificationsOverlay()
	{
		setPosition(OverlayPosition.TOP_CENTER);
	}

	public void addEntry(int listIndex, String text, Color color, Color bgColor, int fontSize, OverlayDisplayMode mode, int durationSeconds)
	{
		entries.removeIf(e -> e.listIndex == listIndex);

		Instant expireTime;
		if (mode == OverlayDisplayMode.SOLID_UNTIL_CANCELLED)
		{
			expireTime = Instant.MAX;
		}
		else
		{
			expireTime = Instant.now().plusSeconds(durationSeconds);
		}

		boolean flash = (mode == OverlayDisplayMode.FLASH_TIMED);
		boolean untilCancelled = (mode == OverlayDisplayMode.SOLID_UNTIL_CANCELLED);
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, fontSize);
		entries.add(new OverlayEntry(listIndex, text, color, bgColor, font, expireTime, flash, untilCancelled));
	}

	public void cancelEntry(int listIndex)
	{
		entries.removeIf(e -> e.listIndex == listIndex);
	}

	public void cancelUntilCancelledEntries()
	{
		Instant now = Instant.now();
		entries.removeIf(e -> e.untilCancelled && now.isAfter(e.addedAt.plusSeconds(1)));
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
		entries.removeIf(e -> now.isAfter(e.expireTime));
		int y = 0;
		int maxWidth = 0;

		for (OverlayEntry entry : entries)
		{

			// For flashing entries, skip rendering every other 500ms cycle
			if (entry.flash && (currentMs / 500) % 2 == 0)
			{
				continue;
			}

			graphics.setFont(entry.font);
			FontMetrics fm = graphics.getFontMetrics();

			int textWidth = fm.stringWidth(entry.text);
			int textHeight = fm.getHeight();
			int padding = 4;

			// Draw background
			graphics.setColor(entry.bgColor);
			graphics.fillRect(-padding, y, textWidth + padding * 2, textHeight + 2);

			// Draw text
			graphics.setColor(entry.color);
			graphics.drawString(entry.text, 0, y + fm.getAscent());

			y += textHeight + 4;
			maxWidth = Math.max(maxWidth, textWidth + padding * 2);
		}

		if (y == 0)
		{
			return null;
		}

		return new Dimension(maxWidth, y);
	}

	private static class OverlayEntry
	{
		final int listIndex;
		final String text;
		final Color color;
		final Color bgColor;
		final Font font;
		final Instant expireTime;
		final boolean flash;
		final boolean untilCancelled;
		final Instant addedAt;

		OverlayEntry(int listIndex, String text, Color color, Color bgColor, Font font, Instant expireTime, boolean flash, boolean untilCancelled)
		{
			this.listIndex = listIndex;
			this.text = text;
			this.color = color;
			this.bgColor = bgColor;
			this.font = font;
			this.expireTime = expireTime;
			this.flash = flash;
			this.untilCancelled = untilCancelled;
			this.addedAt = Instant.now();
		}
	}
}
