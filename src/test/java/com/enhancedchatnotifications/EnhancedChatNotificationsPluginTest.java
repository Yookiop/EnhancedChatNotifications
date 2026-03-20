package com.enhancedchatnotifications;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EnhancedChatNotificationsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EnhancedChatNotificationsPlugin.class);
		RuneLite.main(args);
	}
}