package com.enhancedchatnotifications;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Notification;

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

	@ConfigItem(
			position = 16,
			keyName = "overlaySize1",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 26,
			keyName = "overlaySize2",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 36,
			keyName = "overlaySize3",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 46,
			keyName = "overlaySize4",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 56,
			keyName = "overlaySize5",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 66,
			keyName = "overlaySize6",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 76,
			keyName = "overlaySize7",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 86,
			keyName = "overlaySize8",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 96,
			keyName = "overlaySize9",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	@ConfigItem(
			position = 106,
			keyName = "overlaySize10",
			name = "Text size",
			description = "Font size of the overlay text.",
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

	// Notification list 11
	@ConfigSection(
			name = "Notification list 11",
			description = "Notification list 11 settings.",
			position = 110,
			closedByDefault = true
	)
	String notificationList11 = "notificationList11";

	@ConfigItem(
			position = 111,
			keyName = "notificationWords11",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList11
	)
	default String notificationWords11()
	{
		return "";
	}

	@ConfigItem(
			position = 112,
			keyName = "notificationRegex11",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList11
	)
	default String notificationRegex11()
	{
		return "";
	}

	@ConfigItem(
			position = 113,
			keyName = "notificationEnabled11",
			name = "Enable notification list 11",
			description = "",
			section = notificationList11
	)
	default Notification notificationEnabled11()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 114,
			keyName = "overlayText11",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList11
	)
	default String overlayText11()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 115,
			keyName = "overlayColor11",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList11
	)
	default Color overlayColor11()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 116,
			keyName = "overlaySize11",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList11
	)
	default int overlaySize11()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 117,
			keyName = "overlayBgColor11",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList11
	)
	default Color overlayBgColor11()
	{
		return Color.BLACK;
	}

	// Notification list 12
	@ConfigSection(
			name = "Notification list 12",
			description = "Notification list 12 settings.",
			position = 120,
			closedByDefault = true
	)
	String notificationList12 = "notificationList12";

	@ConfigItem(
			position = 121,
			keyName = "notificationWords12",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList12
	)
	default String notificationWords12()
	{
		return "";
	}

	@ConfigItem(
			position = 122,
			keyName = "notificationRegex12",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList12
	)
	default String notificationRegex12()
	{
		return "";
	}

	@ConfigItem(
			position = 123,
			keyName = "notificationEnabled12",
			name = "Enable notification list 12",
			description = "",
			section = notificationList12
	)
	default Notification notificationEnabled12()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 124,
			keyName = "overlayText12",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList12
	)
	default String overlayText12()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 125,
			keyName = "overlayColor12",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList12
	)
	default Color overlayColor12()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 126,
			keyName = "overlaySize12",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList12
	)
	default int overlaySize12()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 127,
			keyName = "overlayBgColor12",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList12
	)
	default Color overlayBgColor12()
	{
		return Color.BLACK;
	}

	// Notification list 13
	@ConfigSection(
			name = "Notification list 13",
			description = "Notification list 13 settings.",
			position = 130,
			closedByDefault = true
	)
	String notificationList13 = "notificationList13";

	@ConfigItem(
			position = 131,
			keyName = "notificationWords13",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList13
	)
	default String notificationWords13()
	{
		return "";
	}

	@ConfigItem(
			position = 132,
			keyName = "notificationRegex13",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList13
	)
	default String notificationRegex13()
	{
		return "";
	}

	@ConfigItem(
			position = 133,
			keyName = "notificationEnabled13",
			name = "Enable notification list 13",
			description = "",
			section = notificationList13
	)
	default Notification notificationEnabled13()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 134,
			keyName = "overlayText13",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList13
	)
	default String overlayText13()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 135,
			keyName = "overlayColor13",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList13
	)
	default Color overlayColor13()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 136,
			keyName = "overlaySize13",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList13
	)
	default int overlaySize13()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 137,
			keyName = "overlayBgColor13",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList13
	)
	default Color overlayBgColor13()
	{
		return Color.BLACK;
	}

	// Notification list 14
	@ConfigSection(
			name = "Notification list 14",
			description = "Notification list 14 settings.",
			position = 140,
			closedByDefault = true
	)
	String notificationList14 = "notificationList14";

	@ConfigItem(
			position = 141,
			keyName = "notificationWords14",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList14
	)
	default String notificationWords14()
	{
		return "";
	}

	@ConfigItem(
			position = 142,
			keyName = "notificationRegex14",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList14
	)
	default String notificationRegex14()
	{
		return "";
	}

	@ConfigItem(
			position = 143,
			keyName = "notificationEnabled14",
			name = "Enable notification list 14",
			description = "",
			section = notificationList14
	)
	default Notification notificationEnabled14()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 144,
			keyName = "overlayText14",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList14
	)
	default String overlayText14()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 145,
			keyName = "overlayColor14",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList14
	)
	default Color overlayColor14()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 146,
			keyName = "overlaySize14",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList14
	)
	default int overlaySize14()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 147,
			keyName = "overlayBgColor14",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList14
	)
	default Color overlayBgColor14()
	{
		return Color.BLACK;
	}

	// Notification list 15
	@ConfigSection(
			name = "Notification list 15",
			description = "Notification list 15 settings.",
			position = 150,
			closedByDefault = true
	)
	String notificationList15 = "notificationList15";

	@ConfigItem(
			position = 151,
			keyName = "notificationWords15",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList15
	)
	default String notificationWords15()
	{
		return "";
	}

	@ConfigItem(
			position = 152,
			keyName = "notificationRegex15",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList15
	)
	default String notificationRegex15()
	{
		return "";
	}

	@ConfigItem(
			position = 153,
			keyName = "notificationEnabled15",
			name = "Enable notification list 15",
			description = "",
			section = notificationList15
	)
	default Notification notificationEnabled15()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 154,
			keyName = "overlayText15",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList15
	)
	default String overlayText15()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 155,
			keyName = "overlayColor15",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList15
	)
	default Color overlayColor15()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 156,
			keyName = "overlaySize15",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList15
	)
	default int overlaySize15()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 157,
			keyName = "overlayBgColor15",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList15
	)
	default Color overlayBgColor15()
	{
		return Color.BLACK;
	}

	// Notification list 16
	@ConfigSection(
			name = "Notification list 16",
			description = "Notification list 16 settings.",
			position = 160,
			closedByDefault = true
	)
	String notificationList16 = "notificationList16";

	@ConfigItem(
			position = 161,
			keyName = "notificationWords16",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList16
	)
	default String notificationWords16()
	{
		return "";
	}

	@ConfigItem(
			position = 162,
			keyName = "notificationRegex16",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList16
	)
	default String notificationRegex16()
	{
		return "";
	}

	@ConfigItem(
			position = 163,
			keyName = "notificationEnabled16",
			name = "Enable notification list 16",
			description = "",
			section = notificationList16
	)
	default Notification notificationEnabled16()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 164,
			keyName = "overlayText16",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList16
	)
	default String overlayText16()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 165,
			keyName = "overlayColor16",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList16
	)
	default Color overlayColor16()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 166,
			keyName = "overlaySize16",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList16
	)
	default int overlaySize16()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 167,
			keyName = "overlayBgColor16",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList16
	)
	default Color overlayBgColor16()
	{
		return Color.BLACK;
	}

	// Notification list 17
	@ConfigSection(
			name = "Notification list 17",
			description = "Notification list 17 settings.",
			position = 170,
			closedByDefault = true
	)
	String notificationList17 = "notificationList17";

	@ConfigItem(
			position = 171,
			keyName = "notificationWords17",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList17
	)
	default String notificationWords17()
	{
		return "";
	}

	@ConfigItem(
			position = 172,
			keyName = "notificationRegex17",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList17
	)
	default String notificationRegex17()
	{
		return "";
	}

	@ConfigItem(
			position = 173,
			keyName = "notificationEnabled17",
			name = "Enable notification list 17",
			description = "",
			section = notificationList17
	)
	default Notification notificationEnabled17()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 174,
			keyName = "overlayText17",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList17
	)
	default String overlayText17()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 175,
			keyName = "overlayColor17",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList17
	)
	default Color overlayColor17()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 176,
			keyName = "overlaySize17",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList17
	)
	default int overlaySize17()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 177,
			keyName = "overlayBgColor17",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList17
	)
	default Color overlayBgColor17()
	{
		return Color.BLACK;
	}

	// Notification list 18
	@ConfigSection(
			name = "Notification list 18",
			description = "Notification list 18 settings.",
			position = 180,
			closedByDefault = true
	)
	String notificationList18 = "notificationList18";

	@ConfigItem(
			position = 181,
			keyName = "notificationWords18",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList18
	)
	default String notificationWords18()
	{
		return "";
	}

	@ConfigItem(
			position = 182,
			keyName = "notificationRegex18",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList18
	)
	default String notificationRegex18()
	{
		return "";
	}

	@ConfigItem(
			position = 183,
			keyName = "notificationEnabled18",
			name = "Enable notification list 18",
			description = "",
			section = notificationList18
	)
	default Notification notificationEnabled18()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 184,
			keyName = "overlayText18",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList18
	)
	default String overlayText18()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 185,
			keyName = "overlayColor18",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList18
	)
	default Color overlayColor18()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 186,
			keyName = "overlaySize18",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList18
	)
	default int overlaySize18()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 187,
			keyName = "overlayBgColor18",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList18
	)
	default Color overlayBgColor18()
	{
		return Color.BLACK;
	}

	// Notification list 19
	@ConfigSection(
			name = "Notification list 19",
			description = "Notification list 19 settings.",
			position = 190,
			closedByDefault = true
	)
	String notificationList19 = "notificationList19";

	@ConfigItem(
			position = 191,
			keyName = "notificationWords19",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList19
	)
	default String notificationWords19()
	{
		return "";
	}

	@ConfigItem(
			position = 192,
			keyName = "notificationRegex19",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList19
	)
	default String notificationRegex19()
	{
		return "";
	}

	@ConfigItem(
			position = 193,
			keyName = "notificationEnabled19",
			name = "Enable notification list 19",
			description = "",
			section = notificationList19
	)
	default Notification notificationEnabled19()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 194,
			keyName = "overlayText19",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList19
	)
	default String overlayText19()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 195,
			keyName = "overlayColor19",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList19
	)
	default Color overlayColor19()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 196,
			keyName = "overlaySize19",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList19
	)
	default int overlaySize19()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 197,
			keyName = "overlayBgColor19",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList19
	)
	default Color overlayBgColor19()
	{
		return Color.BLACK;
	}

	// Notification list 20
	@ConfigSection(
			name = "Notification list 20",
			description = "Notification list 20 settings.",
			position = 200,
			closedByDefault = true
	)
	String notificationList20 = "notificationList20";

	@ConfigItem(
			position = 201,
			keyName = "notificationWords20",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList20
	)
	default String notificationWords20()
	{
		return "";
	}

	@ConfigItem(
			position = 202,
			keyName = "notificationRegex20",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList20
	)
	default String notificationRegex20()
	{
		return "";
	}

	@ConfigItem(
			position = 203,
			keyName = "notificationEnabled20",
			name = "Enable notification list 20",
			description = "",
			section = notificationList20
	)
	default Notification notificationEnabled20()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 204,
			keyName = "overlayText20",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList20
	)
	default String overlayText20()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 205,
			keyName = "overlayColor20",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList20
	)
	default Color overlayColor20()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 206,
			keyName = "overlaySize20",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList20
	)
	default int overlaySize20()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 207,
			keyName = "overlayBgColor20",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList20
	)
	default Color overlayBgColor20()
	{
		return Color.BLACK;
	}

	// Notification list 21
	@ConfigSection(
			name = "Notification list 21",
			description = "Notification list 21 settings.",
			position = 210,
			closedByDefault = true
	)
	String notificationList21 = "notificationList21";

	@ConfigItem(
			position = 211,
			keyName = "notificationWords21",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList21
	)
	default String notificationWords21()
	{
		return "";
	}

	@ConfigItem(
			position = 212,
			keyName = "notificationRegex21",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList21
	)
	default String notificationRegex21()
	{
		return "";
	}

	@ConfigItem(
			position = 213,
			keyName = "notificationEnabled21",
			name = "Enable notification list 21",
			description = "",
			section = notificationList21
	)
	default Notification notificationEnabled21()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 214,
			keyName = "overlayText21",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList21
	)
	default String overlayText21()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 215,
			keyName = "overlayColor21",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList21
	)
	default Color overlayColor21()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 216,
			keyName = "overlaySize21",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList21
	)
	default int overlaySize21()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 217,
			keyName = "overlayBgColor21",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList21
	)
	default Color overlayBgColor21()
	{
		return Color.BLACK;
	}

	// Notification list 22
	@ConfigSection(
			name = "Notification list 22",
			description = "Notification list 22 settings.",
			position = 220,
			closedByDefault = true
	)
	String notificationList22 = "notificationList22";

	@ConfigItem(
			position = 221,
			keyName = "notificationWords22",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList22
	)
	default String notificationWords22()
	{
		return "";
	}

	@ConfigItem(
			position = 222,
			keyName = "notificationRegex22",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList22
	)
	default String notificationRegex22()
	{
		return "";
	}

	@ConfigItem(
			position = 223,
			keyName = "notificationEnabled22",
			name = "Enable notification list 22",
			description = "",
			section = notificationList22
	)
	default Notification notificationEnabled22()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 224,
			keyName = "overlayText22",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList22
	)
	default String overlayText22()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 225,
			keyName = "overlayColor22",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList22
	)
	default Color overlayColor22()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 226,
			keyName = "overlaySize22",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList22
	)
	default int overlaySize22()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 227,
			keyName = "overlayBgColor22",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList22
	)
	default Color overlayBgColor22()
	{
		return Color.BLACK;
	}

	// Notification list 23
	@ConfigSection(
			name = "Notification list 23",
			description = "Notification list 23 settings.",
			position = 230,
			closedByDefault = true
	)
	String notificationList23 = "notificationList23";

	@ConfigItem(
			position = 231,
			keyName = "notificationWords23",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList23
	)
	default String notificationWords23()
	{
		return "";
	}

	@ConfigItem(
			position = 232,
			keyName = "notificationRegex23",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList23
	)
	default String notificationRegex23()
	{
		return "";
	}

	@ConfigItem(
			position = 233,
			keyName = "notificationEnabled23",
			name = "Enable notification list 23",
			description = "",
			section = notificationList23
	)
	default Notification notificationEnabled23()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 234,
			keyName = "overlayText23",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList23
	)
	default String overlayText23()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 235,
			keyName = "overlayColor23",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList23
	)
	default Color overlayColor23()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 236,
			keyName = "overlaySize23",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList23
	)
	default int overlaySize23()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 237,
			keyName = "overlayBgColor23",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList23
	)
	default Color overlayBgColor23()
	{
		return Color.BLACK;
	}

	// Notification list 24
	@ConfigSection(
			name = "Notification list 24",
			description = "Notification list 24 settings.",
			position = 240,
			closedByDefault = true
	)
	String notificationList24 = "notificationList24";

	@ConfigItem(
			position = 241,
			keyName = "notificationWords24",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList24
	)
	default String notificationWords24()
	{
		return "";
	}

	@ConfigItem(
			position = 242,
			keyName = "notificationRegex24",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList24
	)
	default String notificationRegex24()
	{
		return "";
	}

	@ConfigItem(
			position = 243,
			keyName = "notificationEnabled24",
			name = "Enable notification list 24",
			description = "",
			section = notificationList24
	)
	default Notification notificationEnabled24()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 244,
			keyName = "overlayText24",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList24
	)
	default String overlayText24()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 245,
			keyName = "overlayColor24",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList24
	)
	default Color overlayColor24()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 246,
			keyName = "overlaySize24",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList24
	)
	default int overlaySize24()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 247,
			keyName = "overlayBgColor24",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList24
	)
	default Color overlayBgColor24()
	{
		return Color.BLACK;
	}

	// Notification list 25
	@ConfigSection(
			name = "Notification list 25",
			description = "Notification list 25 settings.",
			position = 250,
			closedByDefault = true
	)
	String notificationList25 = "notificationList25";

	@ConfigItem(
			position = 251,
			keyName = "notificationWords25",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = notificationList25
	)
	default String notificationWords25()
	{
		return "";
	}

	@ConfigItem(
			position = 252,
			keyName = "notificationRegex25",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = notificationList25
	)
	default String notificationRegex25()
	{
		return "";
	}

	@ConfigItem(
			position = 253,
			keyName = "notificationEnabled25",
			name = "Enable notification list 25",
			description = "",
			section = notificationList25
	)
	default Notification notificationEnabled25()
	{
		return Notification.OFF;
	}

	@ConfigItem(
			position = 254,
			keyName = "overlayText25",
			name = "Text",
			description = "Text to show on screen when this notification triggers. Leave empty to disable.",
			section = notificationList25
	)
	default String overlayText25()
	{
		return "";
	}

	@Alpha
	@ConfigItem(
			position = 255,
			keyName = "overlayColor25",
			name = "Text color",
			description = "Color of the overlay text.",
			section = notificationList25
	)
	default Color overlayColor25()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			position = 256,
			keyName = "overlaySize25",
			name = "Text size",
			description = "Font size of the overlay text.",
			section = notificationList25
	)
	default int overlaySize25()
	{
		return 16;
	}


	@Alpha
	@ConfigItem(
			position = 257,
			keyName = "overlayBgColor25",
			name = "Background color",
			description = "Background color behind the overlay text.",
			section = notificationList25
	)
	default Color overlayBgColor25()
	{
		return Color.BLACK;
	}
}