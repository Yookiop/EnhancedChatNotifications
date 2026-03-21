package com.enhancedchatnotifications;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OverlayDisplayMode
{
	SOLID_TIMED("Solid for X seconds"),
	FLASH_TIMED("Flash for X seconds"),
	SOLID_UNTIL_CANCELLED("Solid until cancelled");

	private final String name;

	@Override
	public String toString()
	{
		return name;
	}
}
