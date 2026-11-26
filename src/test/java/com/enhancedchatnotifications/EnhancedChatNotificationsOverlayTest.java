package com.enhancedchatnotifications;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnhancedChatNotificationsOverlayTest
{
	@Test
	public void testSplitLinesWithoutLineBreaks()
	{
		assertEquals(Arrays.asList("TEST DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST DROP"));
	}

	@Test
	public void testSplitLinesOnPlaceholder()
	{
		assertEquals(Arrays.asList("TEST", "DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST**enter**DROP"));
		assertEquals(Arrays.asList("TEST", "DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST**ENTER**DROP"));
	}

	@Test
	public void testSplitLinesOnRealLineBreaks()
	{
		assertEquals(Arrays.asList("TEST", "DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST\nDROP"));
		assertEquals(Arrays.asList("TEST", "DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST\r\nDROP"));
	}

	@Test
	public void testSplitLinesKeepsBlankLines()
	{
		assertEquals(Arrays.asList("TEST", "", "DROP"), EnhancedChatNotificationsOverlay.splitLines("TEST**enter****enter**DROP"));
	}
}
