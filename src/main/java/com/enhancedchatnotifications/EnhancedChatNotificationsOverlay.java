package com.enhancedchatnotifications;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;

public class EnhancedChatNotificationsOverlay extends Overlay
{
	private final List<OverlayEntry> entries = new CopyOnWriteArrayList<>();

	@Inject
	private Client client;

	@Inject
	private EnhancedChatNotificationsOverlay()
	{
		setPosition(OverlayPosition.TOP_LEFT);
	}

	public void addEntry(int listIndex, String text, Color color, Color bgColor, int fontSize, OverlayDisplayMode mode, int durationSeconds, OverlayPositionMode positionMode)
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
		entries.add(new OverlayEntry(listIndex, text, color, bgColor, font, expireTime, flash, untilCancelled, positionMode));
	}

	public void cancelEntry(int listIndex)
	{
		entries.removeIf(e -> e.listIndex == listIndex);
	}

	public void cancelUntilCancelledEntries()
	{
		entries.removeIf(e -> e.untilCancelled);
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

		int canvasWidth = client.getCanvasWidth();
		int canvasHeight = client.getCanvasHeight();

		// Group entries by their position mode
		Map<OverlayPositionMode, List<OverlayEntry>> grouped = new HashMap<>();
		for (OverlayEntry entry : entries)
		{
			grouped.computeIfAbsent(entry.positionMode, k -> new ArrayList<>()).add(entry);
		}

		int totalWidth = 0;
		int totalHeight = 0;

		for (Map.Entry<OverlayPositionMode, List<OverlayEntry>> group : grouped.entrySet())
		{
			OverlayPositionMode posMode = group.getKey();
			List<OverlayEntry> groupEntries = group.getValue();

			// Calculate total height for this group
			int groupHeight = 0;
			int groupMaxWidth = 0;
			for (OverlayEntry entry : groupEntries)
			{
				// Skip flashing entries in "off" phase
				if (entry.flash && (currentMs / 500) % 2 == 0)
				{
					continue;
				}

				graphics.setFont(entry.font);
				FontMetrics fm = graphics.getFontMetrics();
				int textHeight = fm.getHeight();
				groupHeight += textHeight + 4;
				groupMaxWidth = Math.max(groupMaxWidth, fm.stringWidth(entry.text) + 8);
			}

			if (groupHeight == 0)
			{
				continue;
			}

			// Calculate anchor x,y based on position mode
			int anchorX;
			int anchorY;

			switch (posMode)
			{
				case TOP_LEFT:
				case CENTER_LEFT:
				case BOTTOM_LEFT:
					anchorX = 0;
					break;
				case TOP:
				case CENTER:
				case BOTTOM:
					anchorX = canvasWidth / 2 - groupMaxWidth / 2;
					break;
				case TOP_RIGHT:
				case CENTER_RIGHT:
				case BOTTOM_RIGHT:
					anchorX = canvasWidth - groupMaxWidth;
					break;
				default:
					anchorX = 0;
					break;
			}

			switch (posMode)
			{
				case TOP_LEFT:
				case TOP:
				case TOP_RIGHT:
					anchorY = 0;
					break;
				case CENTER_LEFT:
				case CENTER:
				case CENTER_RIGHT:
					anchorY = canvasHeight / 2 - groupHeight / 2;
					break;
				case BOTTOM_LEFT:
				case BOTTOM:
				case BOTTOM_RIGHT:
					anchorY = canvasHeight - groupHeight;
					break;
				default:
					anchorY = 0;
					break;
			}

			// Render entries in this group, stacked vertically
			int yOffset = 0;
			for (OverlayEntry entry : groupEntries)
			{
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
				graphics.fillRect(anchorX - padding, anchorY + yOffset, textWidth + padding * 2, textHeight + 2);

				// Draw text
				graphics.setColor(entry.color);
				graphics.drawString(entry.text, anchorX, anchorY + yOffset + fm.getAscent());

				yOffset += textHeight + 4;
			}

			totalWidth = Math.max(totalWidth, anchorX + groupMaxWidth);
			totalHeight = Math.max(totalHeight, anchorY + groupHeight);
		}

		if (totalWidth == 0 && totalHeight == 0)
		{
			return null;
		}

		return new Dimension(totalWidth, totalHeight);
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
		final OverlayPositionMode positionMode;

		OverlayEntry(int listIndex, String text, Color color, Color bgColor, Font font, Instant expireTime, boolean flash, boolean untilCancelled, OverlayPositionMode positionMode)
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
			this.positionMode = positionMode;
		}
	}
}
