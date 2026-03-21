package com.enhancedchatnotifications;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Notification;
import net.runelite.client.config.Range;

@ConfigGroup("enhancedchatnotifications")
public interface EnhancedChatNotificationsConfig extends Config
{
	// Shared description and name constants
	String NAME_WORDS = "Notify based on words in text message";
	String NAME_REGEX = "Notify based on regex";
	String DESC_WORDS = "Notify based on the following words in chat, separated by commas.";
	String DESC_REGEX = "More advanced notifications (separated by enter). Example to notify on all valuable drops except runite ore: Valuable drop: (?!.*Runite ore).";

	// Text overlay settings
	@ConfigSection(
			name = "Text overlay settings",
			description = "Settings for on-screen text overlay. Hold ALT and move the text box to the position you want.",
			position = 1,
			closedByDefault = false
	)
	String overlaySettings = "overlaySettings";

	@ConfigItem(
			position = 2,
			keyName = "overlayDisplayMode",
			name = "Text mode",
			description = "How the overlay text is displayed.",
			section = overlaySettings
	)
	default OverlayDisplayMode overlayDisplayMode()
	{
		return OverlayDisplayMode.SOLID_TIMED;
	}

	@Range(min = 1, max = 120)
	@ConfigItem(
			position = 3,
			keyName = "overlayDuration",
			name = "Duration (seconds)",
			description = "How long overlay text stays on screen (only for timed modes).",
			section = overlaySettings
	)
	default int overlayDuration()
	{
		return 5;
	}

	// Notification list 1
	@ConfigSection(
			name = "Notification list 1",
			description = "Notification list 1 settings.",
			position = 10,
			closedByDefault = false
	)
	String notificationList1 = "notificationList1";

	@ConfigItem(
			position = 11,
			keyName = "notificationWords1",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList1
	)
	default String notificationWords1()
	{
		return "";
	}

	@ConfigItem(
			position = 12,
			keyName = "notificationRegex1",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList1
	)
	default String notificationRegex1()
	{
		return "";
	}

	@ConfigItem(
			position = 13,
			keyName = "notificationEnabled1",
			name = "Enable notification list 1",
			description = "",
			section = notificationList1
	)
	default Notification notificationEnabled1()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 14,
			keyName = "overlayText1",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList1
	)
	default String overlayText1()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 15,
			keyName = "overlayColor1",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList1
	)
	default Color overlayColor1()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 16,
			keyName = "overlaySize1",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList1
	)
	default int overlaySize1()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 17,
			keyName = "overlayBgColor1",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList1
	)
	default Color overlayBgColor1()
	{
		return Color.BLACK;
	}

	// Notification list 2
	@ConfigSection(
			name = "Notification list 2",
			description = "Notification list 2 settings.",
			position = 20,
			closedByDefault = true
	)
	String notificationList2 = "notificationList2";

	@ConfigItem(
			position = 21,
			keyName = "notificationWords2",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList2
	)
	default String notificationWords2()
	{
		return "";
	}

	@ConfigItem(
			position = 22,
			keyName = "notificationRegex2",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList2
	)
	default String notificationRegex2()
	{
		return "";
	}

	@ConfigItem(
			position = 23,
			keyName = "notificationEnabled2",
			name = "Enable notification list 2",
			description = "",
			section = notificationList2
	)
	default Notification notificationEnabled2()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 24,
			keyName = "overlayText2",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList2
	)
	default String overlayText2()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 25,
			keyName = "overlayColor2",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList2
	)
	default Color overlayColor2()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 26,
			keyName = "overlaySize2",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList2
	)
	default int overlaySize2()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 27,
			keyName = "overlayBgColor2",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList2
	)
	default Color overlayBgColor2()
	{
		return Color.BLACK;
	}

	// Notification list 3
	@ConfigSection(
			name = "Notification list 3",
			description = "Notification list 3 settings.",
			position = 30,
			closedByDefault = true
	)
	String notificationList3 = "notificationList3";

	@ConfigItem(
			position = 31,
			keyName = "notificationWords3",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList3
	)
	default String notificationWords3()
	{
		return "";
	}

	@ConfigItem(
			position = 32,
			keyName = "notificationRegex3",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList3
	)
	default String notificationRegex3()
	{
		return "";
	}

	@ConfigItem(
			position = 33,
			keyName = "notificationEnabled3",
			name = "Enable notification list 3",
			description = "",
			section = notificationList3
	)
	default Notification notificationEnabled3()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 34,
			keyName = "overlayText3",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList3
	)
	default String overlayText3()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 35,
			keyName = "overlayColor3",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList3
	)
	default Color overlayColor3()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 36,
			keyName = "overlaySize3",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList3
	)
	default int overlaySize3()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 37,
			keyName = "overlayBgColor3",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList3
	)
	default Color overlayBgColor3()
	{
		return Color.BLACK;
	}

	// Notification list 4
	@ConfigSection(
			name = "Notification list 4",
			description = "Notification list 4 settings.",
			position = 40,
			closedByDefault = true
	)
	String notificationList4 = "notificationList4";

	@ConfigItem(
			position = 41,
			keyName = "notificationWords4",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList4
	)
	default String notificationWords4()
	{
		return "";
	}

	@ConfigItem(
			position = 42,
			keyName = "notificationRegex4",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList4
	)
	default String notificationRegex4()
	{
		return "";
	}

	@ConfigItem(
			position = 43,
			keyName = "notificationEnabled4",
			name = "Enable notification list 4",
			description = "",
			section = notificationList4
	)
	default Notification notificationEnabled4()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 44,
			keyName = "overlayText4",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList4
	)
	default String overlayText4()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 45,
			keyName = "overlayColor4",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList4
	)
	default Color overlayColor4()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 46,
			keyName = "overlaySize4",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList4
	)
	default int overlaySize4()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 47,
			keyName = "overlayBgColor4",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList4
	)
	default Color overlayBgColor4()
	{
		return Color.BLACK;
	}

	// Notification list 5
	@ConfigSection(
			name = "Notification list 5",
			description = "Notification list 5 settings.",
			position = 50,
			closedByDefault = true
	)
	String notificationList5 = "notificationList5";

	@ConfigItem(
			position = 51,
			keyName = "notificationWords5",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList5
	)
	default String notificationWords5()
	{
		return "";
	}

	@ConfigItem(
			position = 52,
			keyName = "notificationRegex5",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList5
	)
	default String notificationRegex5()
	{
		return "";
	}

	@ConfigItem(
			position = 53,
			keyName = "notificationEnabled5",
			name = "Enable notification list 5",
			description = "",
			section = notificationList5
	)
	default Notification notificationEnabled5()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 54,
			keyName = "overlayText5",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList5
	)
	default String overlayText5()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 55,
			keyName = "overlayColor5",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList5
	)
	default Color overlayColor5()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 56,
			keyName = "overlaySize5",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList5
	)
	default int overlaySize5()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 57,
			keyName = "overlayBgColor5",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList5
	)
	default Color overlayBgColor5()
	{
		return Color.BLACK;
	}

	// Notification list 6
	@ConfigSection(
			name = "Notification list 6",
			description = "Notification list 6 settings.",
			position = 60,
			closedByDefault = true
	)
	String notificationList6 = "notificationList6";

	@ConfigItem(
			position = 61,
			keyName = "notificationWords6",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList6
	)
	default String notificationWords6()
	{
		return "";
	}

	@ConfigItem(
			position = 62,
			keyName = "notificationRegex6",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList6
	)
	default String notificationRegex6()
	{
		return "";
	}

	@ConfigItem(
			position = 63,
			keyName = "notificationEnabled6",
			name = "Enable notification list 6",
			description = "",
			section = notificationList6
	)
	default Notification notificationEnabled6()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 64,
			keyName = "overlayText6",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList6
	)
	default String overlayText6()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 65,
			keyName = "overlayColor6",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList6
	)
	default Color overlayColor6()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 66,
			keyName = "overlaySize6",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList6
	)
	default int overlaySize6()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 67,
			keyName = "overlayBgColor6",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList6
	)
	default Color overlayBgColor6()
	{
		return Color.BLACK;
	}

	// Notification list 7
	@ConfigSection(
			name = "Notification list 7",
			description = "Notification list 7 settings.",
			position = 70,
			closedByDefault = true
	)
	String notificationList7 = "notificationList7";

	@ConfigItem(
			position = 71,
			keyName = "notificationWords7",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList7
	)
	default String notificationWords7()
	{
		return "";
	}

	@ConfigItem(
			position = 72,
			keyName = "notificationRegex7",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList7
	)
	default String notificationRegex7()
	{
		return "";
	}

	@ConfigItem(
			position = 73,
			keyName = "notificationEnabled7",
			name = "Enable notification list 7",
			description = "",
			section = notificationList7
	)
	default Notification notificationEnabled7()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 74,
			keyName = "overlayText7",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList7
	)
	default String overlayText7()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 75,
			keyName = "overlayColor7",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList7
	)
	default Color overlayColor7()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 76,
			keyName = "overlaySize7",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList7
	)
	default int overlaySize7()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 77,
			keyName = "overlayBgColor7",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList7
	)
	default Color overlayBgColor7()
	{
		return Color.BLACK;
	}

	// Notification list 8
	@ConfigSection(
			name = "Notification list 8",
			description = "Notification list 8 settings.",
			position = 80,
			closedByDefault = true
	)
	String notificationList8 = "notificationList8";

	@ConfigItem(
			position = 81,
			keyName = "notificationWords8",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList8
	)
	default String notificationWords8()
	{
		return "";
	}

	@ConfigItem(
			position = 82,
			keyName = "notificationRegex8",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList8
	)
	default String notificationRegex8()
	{
		return "";
	}

	@ConfigItem(
			position = 83,
			keyName = "notificationEnabled8",
			name = "Enable notification list 8",
			description = "",
			section = notificationList8
	)
	default Notification notificationEnabled8()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 84,
			keyName = "overlayText8",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList8
	)
	default String overlayText8()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 85,
			keyName = "overlayColor8",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList8
	)
	default Color overlayColor8()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 86,
			keyName = "overlaySize8",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList8
	)
	default int overlaySize8()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 87,
			keyName = "overlayBgColor8",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList8
	)
	default Color overlayBgColor8()
	{
		return Color.BLACK;
	}

	// Notification list 9
	@ConfigSection(
			name = "Notification list 9",
			description = "Notification list 9 settings.",
			position = 90,
			closedByDefault = true
	)
	String notificationList9 = "notificationList9";

	@ConfigItem(
			position = 91,
			keyName = "notificationWords9",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList9
	)
	default String notificationWords9()
	{
		return "";
	}

	@ConfigItem(
			position = 92,
			keyName = "notificationRegex9",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList9
	)
	default String notificationRegex9()
	{
		return "";
	}

	@ConfigItem(
			position = 93,
			keyName = "notificationEnabled9",
			name = "Enable notification list 9",
			description = "",
			section = notificationList9
	)
	default Notification notificationEnabled9()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 94,
			keyName = "overlayText9",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList9
	)
	default String overlayText9()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 95,
			keyName = "overlayColor9",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList9
	)
	default Color overlayColor9()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 96,
			keyName = "overlaySize9",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList9
	)
	default int overlaySize9()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 97,
			keyName = "overlayBgColor9",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList9
	)
	default Color overlayBgColor9()
	{
		return Color.BLACK;
	}

	// Notification list 10
	@ConfigSection(
			name = "Notification list 10",
			description = "Notification list 10 settings.",
			position = 100,
			closedByDefault = true
	)
	String notificationList10 = "notificationList10";

	@ConfigItem(
			position = 101,
			keyName = "notificationWords10",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList10
	)
	default String notificationWords10()
	{
		return "";
	}

	@ConfigItem(
			position = 102,
			keyName = "notificationRegex10",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList10
	)
	default String notificationRegex10()
	{
		return "";
	}

	@ConfigItem(
			position = 103,
			keyName = "notificationEnabled10",
			name = "Enable notification list 10",
			description = "",
			section = notificationList10
	)
	default Notification notificationEnabled10()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 104,
			keyName = "overlayText10",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList10
	)
	default String overlayText10()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 105,
			keyName = "overlayColor10",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList10
	)
	default Color overlayColor10()
	{
		return Color.WHITE;
	}

	@Range(min = 1, max = 128)
	@ConfigItem(
			position = 106,
			keyName = "overlaySize10",
			name = "Text size",
			description = "Font size of the overlay text (between 1-128).",
			section = notificationList10
	)
	default int overlaySize10()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 107,
			keyName = "overlayBgColor10",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList10
	)
	default Color overlayBgColor10()
	{
		return Color.BLACK;
	}
}
