package com.enhancedchatnotifications;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OverlayPositionMode
{
	TOP_LEFT("Top left"),
	TOP("Top"),
	TOP_RIGHT("Top right"),
	CENTER_LEFT("Center left"),
	CENTER("Center"),
	CENTER_RIGHT("Center right"),
	BOTTOM_LEFT("Bottom left"),
	BOTTOM("Bottom"),
	BOTTOM_RIGHT("Bottom right");

	private final String name;

	@Override
	public String toString()
	{
		return name;
	}
}
