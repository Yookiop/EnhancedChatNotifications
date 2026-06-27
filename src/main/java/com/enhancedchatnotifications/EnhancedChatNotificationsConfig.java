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
	String NAME_ALIAS = "List alias";
	String DESC_ALIAS = "Give this notification list a custom name to easily identify it.";
	String NAME_POSITION = "Chat position";
	String DESC_POSITION = "Where on screen to display the overlay text for this notification.";

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

	// ========== Notification lists 1-25 ==========
	// Each list uses positions: base (section), base+1 (alias), base+2 (words),
	// base+3 (regex), base+4 (enabled), base+5 (overlayText),
	// base+6 (overlayColor), base+7 (overlaySize), base+8 (overlayPosition),
	// base+9 (overlayBgColor), where base = listNumber * 10

	// Notification list 1
	@ConfigSection(
			name = "Notification list 1",
			description = "Notification list 1 settings.",
			position = 10,
			closedByDefault = false
	)
	String notificationList1 = "notificationList1";

	@ConfigItem(position = 11, keyName = "listAlias1", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList1)
	default String listAlias1() { return ""; }

	@ConfigItem(position = 12, keyName = "notificationWords1", name = NAME_WORDS, description = DESC_WORDS, section = notificationList1)
	default String notificationWords1() { return ""; }

	@ConfigItem(position = 13, keyName = "notificationRegex1", name = NAME_REGEX, description = DESC_REGEX, section = notificationList1)
	default String notificationRegex1() { return ""; }

	@ConfigItem(position = 14, keyName = "notificationEnabled1", name = "Enable notification list 1", description = "", section = notificationList1)
	default Notification notificationEnabled1() { return Notification.OFF; }

	@ConfigItem(position = 15, keyName = "overlayText1", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList1)
	default String overlayText1() { return ""; }

	@Alpha
	@ConfigItem(position = 16, keyName = "overlayColor1", name = "Text color", description = "Color of the overlay text.", section = notificationList1)
	default Color overlayColor1() { return Color.WHITE; }

	@Range(min = 1, max = 128)
	@ConfigItem(position = 17, keyName = "overlaySize1", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList1)
	default int overlaySize1() { return 16; }

	@ConfigItem(position = 18, keyName = "overlayPosition1", name = NAME_POSITION, description = DESC_POSITION, section = notificationList1)
	default OverlayPositionMode overlayPosition1() { return OverlayPositionMode.TOP; }

	@Alpha
	@ConfigItem(position = 19, keyName = "overlayBgColor1", name = "Background color", description = "Background color behind the overlay text.", section = notificationList1)
	default Color overlayBgColor1() { return Color.BLACK; }

	// Notification list 2
	@ConfigSection(name = "Notification list 2", description = "Notification list 2 settings.", position = 20, closedByDefault = true)
	String notificationList2 = "notificationList2";

	@ConfigItem(position = 21, keyName = "listAlias2", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList2)
	default String listAlias2() { return ""; }
	@ConfigItem(position = 22, keyName = "notificationWords2", name = NAME_WORDS, description = DESC_WORDS, section = notificationList2)
	default String notificationWords2() { return ""; }
	@ConfigItem(position = 23, keyName = "notificationRegex2", name = NAME_REGEX, description = DESC_REGEX, section = notificationList2)
	default String notificationRegex2() { return ""; }
	@ConfigItem(position = 24, keyName = "notificationEnabled2", name = "Enable notification list 2", description = "", section = notificationList2)
	default Notification notificationEnabled2() { return Notification.OFF; }
	@ConfigItem(position = 25, keyName = "overlayText2", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList2)
	default String overlayText2() { return ""; }
	@Alpha @ConfigItem(position = 26, keyName = "overlayColor2", name = "Text color", description = "Color of the overlay text.", section = notificationList2)
	default Color overlayColor2() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 27, keyName = "overlaySize2", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList2)
	default int overlaySize2() { return 16; }
	@ConfigItem(position = 28, keyName = "overlayPosition2", name = NAME_POSITION, description = DESC_POSITION, section = notificationList2)
	default OverlayPositionMode overlayPosition2() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 29, keyName = "overlayBgColor2", name = "Background color", description = "Background color behind the overlay text.", section = notificationList2)
	default Color overlayBgColor2() { return Color.BLACK; }

	// Notification list 3
	@ConfigSection(name = "Notification list 3", description = "Notification list 3 settings.", position = 30, closedByDefault = true)
	String notificationList3 = "notificationList3";

	@ConfigItem(position = 31, keyName = "listAlias3", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList3)
	default String listAlias3() { return ""; }
	@ConfigItem(position = 32, keyName = "notificationWords3", name = NAME_WORDS, description = DESC_WORDS, section = notificationList3)
	default String notificationWords3() { return ""; }
	@ConfigItem(position = 33, keyName = "notificationRegex3", name = NAME_REGEX, description = DESC_REGEX, section = notificationList3)
	default String notificationRegex3() { return ""; }
	@ConfigItem(position = 34, keyName = "notificationEnabled3", name = "Enable notification list 3", description = "", section = notificationList3)
	default Notification notificationEnabled3() { return Notification.OFF; }
	@ConfigItem(position = 35, keyName = "overlayText3", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList3)
	default String overlayText3() { return ""; }
	@Alpha @ConfigItem(position = 36, keyName = "overlayColor3", name = "Text color", description = "Color of the overlay text.", section = notificationList3)
	default Color overlayColor3() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 37, keyName = "overlaySize3", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList3)
	default int overlaySize3() { return 16; }
	@ConfigItem(position = 38, keyName = "overlayPosition3", name = NAME_POSITION, description = DESC_POSITION, section = notificationList3)
	default OverlayPositionMode overlayPosition3() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 39, keyName = "overlayBgColor3", name = "Background color", description = "Background color behind the overlay text.", section = notificationList3)
	default Color overlayBgColor3() { return Color.BLACK; }

	// Notification list 4
	@ConfigSection(name = "Notification list 4", description = "Notification list 4 settings.", position = 40, closedByDefault = true)
	String notificationList4 = "notificationList4";

	@ConfigItem(position = 41, keyName = "listAlias4", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList4)
	default String listAlias4() { return ""; }
	@ConfigItem(position = 42, keyName = "notificationWords4", name = NAME_WORDS, description = DESC_WORDS, section = notificationList4)
	default String notificationWords4() { return ""; }
	@ConfigItem(position = 43, keyName = "notificationRegex4", name = NAME_REGEX, description = DESC_REGEX, section = notificationList4)
	default String notificationRegex4() { return ""; }
	@ConfigItem(position = 44, keyName = "notificationEnabled4", name = "Enable notification list 4", description = "", section = notificationList4)
	default Notification notificationEnabled4() { return Notification.OFF; }
	@ConfigItem(position = 45, keyName = "overlayText4", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList4)
	default String overlayText4() { return ""; }
	@Alpha @ConfigItem(position = 46, keyName = "overlayColor4", name = "Text color", description = "Color of the overlay text.", section = notificationList4)
	default Color overlayColor4() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 47, keyName = "overlaySize4", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList4)
	default int overlaySize4() { return 16; }
	@ConfigItem(position = 48, keyName = "overlayPosition4", name = NAME_POSITION, description = DESC_POSITION, section = notificationList4)
	default OverlayPositionMode overlayPosition4() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 49, keyName = "overlayBgColor4", name = "Background color", description = "Background color behind the overlay text.", section = notificationList4)
	default Color overlayBgColor4() { return Color.BLACK; }

	// Notification list 5
	@ConfigSection(name = "Notification list 5", description = "Notification list 5 settings.", position = 50, closedByDefault = true)
	String notificationList5 = "notificationList5";

	@ConfigItem(position = 51, keyName = "listAlias5", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList5)
	default String listAlias5() { return ""; }
	@ConfigItem(position = 52, keyName = "notificationWords5", name = NAME_WORDS, description = DESC_WORDS, section = notificationList5)
	default String notificationWords5() { return ""; }
	@ConfigItem(position = 53, keyName = "notificationRegex5", name = NAME_REGEX, description = DESC_REGEX, section = notificationList5)
	default String notificationRegex5() { return ""; }
	@ConfigItem(position = 54, keyName = "notificationEnabled5", name = "Enable notification list 5", description = "", section = notificationList5)
	default Notification notificationEnabled5() { return Notification.OFF; }
	@ConfigItem(position = 55, keyName = "overlayText5", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList5)
	default String overlayText5() { return ""; }
	@Alpha @ConfigItem(position = 56, keyName = "overlayColor5", name = "Text color", description = "Color of the overlay text.", section = notificationList5)
	default Color overlayColor5() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 57, keyName = "overlaySize5", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList5)
	default int overlaySize5() { return 16; }
	@ConfigItem(position = 58, keyName = "overlayPosition5", name = NAME_POSITION, description = DESC_POSITION, section = notificationList5)
	default OverlayPositionMode overlayPosition5() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 59, keyName = "overlayBgColor5", name = "Background color", description = "Background color behind the overlay text.", section = notificationList5)
	default Color overlayBgColor5() { return Color.BLACK; }

	// Notification list 6
	@ConfigSection(name = "Notification list 6", description = "Notification list 6 settings.", position = 60, closedByDefault = true)
	String notificationList6 = "notificationList6";

	@ConfigItem(position = 61, keyName = "listAlias6", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList6)
	default String listAlias6() { return ""; }
	@ConfigItem(position = 62, keyName = "notificationWords6", name = NAME_WORDS, description = DESC_WORDS, section = notificationList6)
	default String notificationWords6() { return ""; }
	@ConfigItem(position = 63, keyName = "notificationRegex6", name = NAME_REGEX, description = DESC_REGEX, section = notificationList6)
	default String notificationRegex6() { return ""; }
	@ConfigItem(position = 64, keyName = "notificationEnabled6", name = "Enable notification list 6", description = "", section = notificationList6)
	default Notification notificationEnabled6() { return Notification.OFF; }
	@ConfigItem(position = 65, keyName = "overlayText6", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList6)
	default String overlayText6() { return ""; }
	@Alpha @ConfigItem(position = 66, keyName = "overlayColor6", name = "Text color", description = "Color of the overlay text.", section = notificationList6)
	default Color overlayColor6() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 67, keyName = "overlaySize6", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList6)
	default int overlaySize6() { return 16; }
	@ConfigItem(position = 68, keyName = "overlayPosition6", name = NAME_POSITION, description = DESC_POSITION, section = notificationList6)
	default OverlayPositionMode overlayPosition6() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 69, keyName = "overlayBgColor6", name = "Background color", description = "Background color behind the overlay text.", section = notificationList6)
	default Color overlayBgColor6() { return Color.BLACK; }

	// Notification list 7
	@ConfigSection(name = "Notification list 7", description = "Notification list 7 settings.", position = 70, closedByDefault = true)
	String notificationList7 = "notificationList7";

	@ConfigItem(position = 71, keyName = "listAlias7", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList7)
	default String listAlias7() { return ""; }
	@ConfigItem(position = 72, keyName = "notificationWords7", name = NAME_WORDS, description = DESC_WORDS, section = notificationList7)
	default String notificationWords7() { return ""; }
	@ConfigItem(position = 73, keyName = "notificationRegex7", name = NAME_REGEX, description = DESC_REGEX, section = notificationList7)
	default String notificationRegex7() { return ""; }
	@ConfigItem(position = 74, keyName = "notificationEnabled7", name = "Enable notification list 7", description = "", section = notificationList7)
	default Notification notificationEnabled7() { return Notification.OFF; }
	@ConfigItem(position = 75, keyName = "overlayText7", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList7)
	default String overlayText7() { return ""; }
	@Alpha @ConfigItem(position = 76, keyName = "overlayColor7", name = "Text color", description = "Color of the overlay text.", section = notificationList7)
	default Color overlayColor7() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 77, keyName = "overlaySize7", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList7)
	default int overlaySize7() { return 16; }
	@ConfigItem(position = 78, keyName = "overlayPosition7", name = NAME_POSITION, description = DESC_POSITION, section = notificationList7)
	default OverlayPositionMode overlayPosition7() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 79, keyName = "overlayBgColor7", name = "Background color", description = "Background color behind the overlay text.", section = notificationList7)
	default Color overlayBgColor7() { return Color.BLACK; }

	// Notification list 8
	@ConfigSection(name = "Notification list 8", description = "Notification list 8 settings.", position = 80, closedByDefault = true)
	String notificationList8 = "notificationList8";

	@ConfigItem(position = 81, keyName = "listAlias8", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList8)
	default String listAlias8() { return ""; }
	@ConfigItem(position = 82, keyName = "notificationWords8", name = NAME_WORDS, description = DESC_WORDS, section = notificationList8)
	default String notificationWords8() { return ""; }
	@ConfigItem(position = 83, keyName = "notificationRegex8", name = NAME_REGEX, description = DESC_REGEX, section = notificationList8)
	default String notificationRegex8() { return ""; }
	@ConfigItem(position = 84, keyName = "notificationEnabled8", name = "Enable notification list 8", description = "", section = notificationList8)
	default Notification notificationEnabled8() { return Notification.OFF; }
	@ConfigItem(position = 85, keyName = "overlayText8", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList8)
	default String overlayText8() { return ""; }
	@Alpha @ConfigItem(position = 86, keyName = "overlayColor8", name = "Text color", description = "Color of the overlay text.", section = notificationList8)
	default Color overlayColor8() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 87, keyName = "overlaySize8", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList8)
	default int overlaySize8() { return 16; }
	@ConfigItem(position = 88, keyName = "overlayPosition8", name = NAME_POSITION, description = DESC_POSITION, section = notificationList8)
	default OverlayPositionMode overlayPosition8() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 89, keyName = "overlayBgColor8", name = "Background color", description = "Background color behind the overlay text.", section = notificationList8)
	default Color overlayBgColor8() { return Color.BLACK; }

	// Notification list 9
	@ConfigSection(name = "Notification list 9", description = "Notification list 9 settings.", position = 90, closedByDefault = true)
	String notificationList9 = "notificationList9";

	@ConfigItem(position = 91, keyName = "listAlias9", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList9)
	default String listAlias9() { return ""; }
	@ConfigItem(position = 92, keyName = "notificationWords9", name = NAME_WORDS, description = DESC_WORDS, section = notificationList9)
	default String notificationWords9() { return ""; }
	@ConfigItem(position = 93, keyName = "notificationRegex9", name = NAME_REGEX, description = DESC_REGEX, section = notificationList9)
	default String notificationRegex9() { return ""; }
	@ConfigItem(position = 94, keyName = "notificationEnabled9", name = "Enable notification list 9", description = "", section = notificationList9)
	default Notification notificationEnabled9() { return Notification.OFF; }
	@ConfigItem(position = 95, keyName = "overlayText9", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList9)
	default String overlayText9() { return ""; }
	@Alpha @ConfigItem(position = 96, keyName = "overlayColor9", name = "Text color", description = "Color of the overlay text.", section = notificationList9)
	default Color overlayColor9() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 97, keyName = "overlaySize9", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList9)
	default int overlaySize9() { return 16; }
	@ConfigItem(position = 98, keyName = "overlayPosition9", name = NAME_POSITION, description = DESC_POSITION, section = notificationList9)
	default OverlayPositionMode overlayPosition9() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 99, keyName = "overlayBgColor9", name = "Background color", description = "Background color behind the overlay text.", section = notificationList9)
	default Color overlayBgColor9() { return Color.BLACK; }

	// Notification list 10
	@ConfigSection(name = "Notification list 10", description = "Notification list 10 settings.", position = 100, closedByDefault = true)
	String notificationList10 = "notificationList10";

	@ConfigItem(position = 101, keyName = "listAlias10", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList10)
	default String listAlias10() { return ""; }
	@ConfigItem(position = 102, keyName = "notificationWords10", name = NAME_WORDS, description = DESC_WORDS, section = notificationList10)
	default String notificationWords10() { return ""; }
	@ConfigItem(position = 103, keyName = "notificationRegex10", name = NAME_REGEX, description = DESC_REGEX, section = notificationList10)
	default String notificationRegex10() { return ""; }
	@ConfigItem(position = 104, keyName = "notificationEnabled10", name = "Enable notification list 10", description = "", section = notificationList10)
	default Notification notificationEnabled10() { return Notification.OFF; }
	@ConfigItem(position = 105, keyName = "overlayText10", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList10)
	default String overlayText10() { return ""; }
	@Alpha @ConfigItem(position = 106, keyName = "overlayColor10", name = "Text color", description = "Color of the overlay text.", section = notificationList10)
	default Color overlayColor10() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 107, keyName = "overlaySize10", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList10)
	default int overlaySize10() { return 16; }
	@ConfigItem(position = 108, keyName = "overlayPosition10", name = NAME_POSITION, description = DESC_POSITION, section = notificationList10)
	default OverlayPositionMode overlayPosition10() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 109, keyName = "overlayBgColor10", name = "Background color", description = "Background color behind the overlay text.", section = notificationList10)
	default Color overlayBgColor10() { return Color.BLACK; }

	// ========== Lists 11-25 (new) ==========

	// Notification list 11
	@ConfigSection(name = "Notification list 11", description = "Notification list 11 settings.", position = 110, closedByDefault = true)
	String notificationList11 = "notificationList11";
	@ConfigItem(position = 111, keyName = "listAlias11", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList11)
	default String listAlias11() { return ""; }
	@ConfigItem(position = 112, keyName = "notificationWords11", name = NAME_WORDS, description = DESC_WORDS, section = notificationList11)
	default String notificationWords11() { return ""; }
	@ConfigItem(position = 113, keyName = "notificationRegex11", name = NAME_REGEX, description = DESC_REGEX, section = notificationList11)
	default String notificationRegex11() { return ""; }
	@ConfigItem(position = 114, keyName = "notificationEnabled11", name = "Enable notification list 11", description = "", section = notificationList11)
	default Notification notificationEnabled11() { return Notification.OFF; }
	@ConfigItem(position = 115, keyName = "overlayText11", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList11)
	default String overlayText11() { return ""; }
	@Alpha @ConfigItem(position = 116, keyName = "overlayColor11", name = "Text color", description = "Color of the overlay text.", section = notificationList11)
	default Color overlayColor11() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 117, keyName = "overlaySize11", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList11)
	default int overlaySize11() { return 16; }
	@ConfigItem(position = 118, keyName = "overlayPosition11", name = NAME_POSITION, description = DESC_POSITION, section = notificationList11)
	default OverlayPositionMode overlayPosition11() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 119, keyName = "overlayBgColor11", name = "Background color", description = "Background color behind the overlay text.", section = notificationList11)
	default Color overlayBgColor11() { return Color.BLACK; }

	// Notification list 12
	@ConfigSection(name = "Notification list 12", description = "Notification list 12 settings.", position = 120, closedByDefault = true)
	String notificationList12 = "notificationList12";
	@ConfigItem(position = 121, keyName = "listAlias12", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList12)
	default String listAlias12() { return ""; }
	@ConfigItem(position = 122, keyName = "notificationWords12", name = NAME_WORDS, description = DESC_WORDS, section = notificationList12)
	default String notificationWords12() { return ""; }
	@ConfigItem(position = 123, keyName = "notificationRegex12", name = NAME_REGEX, description = DESC_REGEX, section = notificationList12)
	default String notificationRegex12() { return ""; }
	@ConfigItem(position = 124, keyName = "notificationEnabled12", name = "Enable notification list 12", description = "", section = notificationList12)
	default Notification notificationEnabled12() { return Notification.OFF; }
	@ConfigItem(position = 125, keyName = "overlayText12", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList12)
	default String overlayText12() { return ""; }
	@Alpha @ConfigItem(position = 126, keyName = "overlayColor12", name = "Text color", description = "Color of the overlay text.", section = notificationList12)
	default Color overlayColor12() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 127, keyName = "overlaySize12", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList12)
	default int overlaySize12() { return 16; }
	@ConfigItem(position = 128, keyName = "overlayPosition12", name = NAME_POSITION, description = DESC_POSITION, section = notificationList12)
	default OverlayPositionMode overlayPosition12() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 129, keyName = "overlayBgColor12", name = "Background color", description = "Background color behind the overlay text.", section = notificationList12)
	default Color overlayBgColor12() { return Color.BLACK; }

	// Notification list 13
	@ConfigSection(name = "Notification list 13", description = "Notification list 13 settings.", position = 130, closedByDefault = true)
	String notificationList13 = "notificationList13";
	@ConfigItem(position = 131, keyName = "listAlias13", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList13)
	default String listAlias13() { return ""; }
	@ConfigItem(position = 132, keyName = "notificationWords13", name = NAME_WORDS, description = DESC_WORDS, section = notificationList13)
	default String notificationWords13() { return ""; }
	@ConfigItem(position = 133, keyName = "notificationRegex13", name = NAME_REGEX, description = DESC_REGEX, section = notificationList13)
	default String notificationRegex13() { return ""; }
	@ConfigItem(position = 134, keyName = "notificationEnabled13", name = "Enable notification list 13", description = "", section = notificationList13)
	default Notification notificationEnabled13() { return Notification.OFF; }
	@ConfigItem(position = 135, keyName = "overlayText13", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList13)
	default String overlayText13() { return ""; }
	@Alpha @ConfigItem(position = 136, keyName = "overlayColor13", name = "Text color", description = "Color of the overlay text.", section = notificationList13)
	default Color overlayColor13() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 137, keyName = "overlaySize13", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList13)
	default int overlaySize13() { return 16; }
	@ConfigItem(position = 138, keyName = "overlayPosition13", name = NAME_POSITION, description = DESC_POSITION, section = notificationList13)
	default OverlayPositionMode overlayPosition13() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 139, keyName = "overlayBgColor13", name = "Background color", description = "Background color behind the overlay text.", section = notificationList13)
	default Color overlayBgColor13() { return Color.BLACK; }

	// Notification list 14
	@ConfigSection(name = "Notification list 14", description = "Notification list 14 settings.", position = 140, closedByDefault = true)
	String notificationList14 = "notificationList14";
	@ConfigItem(position = 141, keyName = "listAlias14", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList14)
	default String listAlias14() { return ""; }
	@ConfigItem(position = 142, keyName = "notificationWords14", name = NAME_WORDS, description = DESC_WORDS, section = notificationList14)
	default String notificationWords14() { return ""; }
	@ConfigItem(position = 143, keyName = "notificationRegex14", name = NAME_REGEX, description = DESC_REGEX, section = notificationList14)
	default String notificationRegex14() { return ""; }
	@ConfigItem(position = 144, keyName = "notificationEnabled14", name = "Enable notification list 14", description = "", section = notificationList14)
	default Notification notificationEnabled14() { return Notification.OFF; }
	@ConfigItem(position = 145, keyName = "overlayText14", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList14)
	default String overlayText14() { return ""; }
	@Alpha @ConfigItem(position = 146, keyName = "overlayColor14", name = "Text color", description = "Color of the overlay text.", section = notificationList14)
	default Color overlayColor14() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 147, keyName = "overlaySize14", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList14)
	default int overlaySize14() { return 16; }
	@ConfigItem(position = 148, keyName = "overlayPosition14", name = NAME_POSITION, description = DESC_POSITION, section = notificationList14)
	default OverlayPositionMode overlayPosition14() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 149, keyName = "overlayBgColor14", name = "Background color", description = "Background color behind the overlay text.", section = notificationList14)
	default Color overlayBgColor14() { return Color.BLACK; }

	// Notification list 15
	@ConfigSection(name = "Notification list 15", description = "Notification list 15 settings.", position = 150, closedByDefault = true)
	String notificationList15 = "notificationList15";
	@ConfigItem(position = 151, keyName = "listAlias15", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList15)
	default String listAlias15() { return ""; }
	@ConfigItem(position = 152, keyName = "notificationWords15", name = NAME_WORDS, description = DESC_WORDS, section = notificationList15)
	default String notificationWords15() { return ""; }
	@ConfigItem(position = 153, keyName = "notificationRegex15", name = NAME_REGEX, description = DESC_REGEX, section = notificationList15)
	default String notificationRegex15() { return ""; }
	@ConfigItem(position = 154, keyName = "notificationEnabled15", name = "Enable notification list 15", description = "", section = notificationList15)
	default Notification notificationEnabled15() { return Notification.OFF; }
	@ConfigItem(position = 155, keyName = "overlayText15", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList15)
	default String overlayText15() { return ""; }
	@Alpha @ConfigItem(position = 156, keyName = "overlayColor15", name = "Text color", description = "Color of the overlay text.", section = notificationList15)
	default Color overlayColor15() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 157, keyName = "overlaySize15", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList15)
	default int overlaySize15() { return 16; }
	@ConfigItem(position = 158, keyName = "overlayPosition15", name = NAME_POSITION, description = DESC_POSITION, section = notificationList15)
	default OverlayPositionMode overlayPosition15() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 159, keyName = "overlayBgColor15", name = "Background color", description = "Background color behind the overlay text.", section = notificationList15)
	default Color overlayBgColor15() { return Color.BLACK; }

	// Notification list 16
	@ConfigSection(name = "Notification list 16", description = "Notification list 16 settings.", position = 160, closedByDefault = true)
	String notificationList16 = "notificationList16";
	@ConfigItem(position = 161, keyName = "listAlias16", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList16)
	default String listAlias16() { return ""; }
	@ConfigItem(position = 162, keyName = "notificationWords16", name = NAME_WORDS, description = DESC_WORDS, section = notificationList16)
	default String notificationWords16() { return ""; }
	@ConfigItem(position = 163, keyName = "notificationRegex16", name = NAME_REGEX, description = DESC_REGEX, section = notificationList16)
	default String notificationRegex16() { return ""; }
	@ConfigItem(position = 164, keyName = "notificationEnabled16", name = "Enable notification list 16", description = "", section = notificationList16)
	default Notification notificationEnabled16() { return Notification.OFF; }
	@ConfigItem(position = 165, keyName = "overlayText16", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList16)
	default String overlayText16() { return ""; }
	@Alpha @ConfigItem(position = 166, keyName = "overlayColor16", name = "Text color", description = "Color of the overlay text.", section = notificationList16)
	default Color overlayColor16() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 167, keyName = "overlaySize16", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList16)
	default int overlaySize16() { return 16; }
	@ConfigItem(position = 168, keyName = "overlayPosition16", name = NAME_POSITION, description = DESC_POSITION, section = notificationList16)
	default OverlayPositionMode overlayPosition16() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 169, keyName = "overlayBgColor16", name = "Background color", description = "Background color behind the overlay text.", section = notificationList16)
	default Color overlayBgColor16() { return Color.BLACK; }

	// Notification list 17
	@ConfigSection(name = "Notification list 17", description = "Notification list 17 settings.", position = 170, closedByDefault = true)
	String notificationList17 = "notificationList17";
	@ConfigItem(position = 171, keyName = "listAlias17", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList17)
	default String listAlias17() { return ""; }
	@ConfigItem(position = 172, keyName = "notificationWords17", name = NAME_WORDS, description = DESC_WORDS, section = notificationList17)
	default String notificationWords17() { return ""; }
	@ConfigItem(position = 173, keyName = "notificationRegex17", name = NAME_REGEX, description = DESC_REGEX, section = notificationList17)
	default String notificationRegex17() { return ""; }
	@ConfigItem(position = 174, keyName = "notificationEnabled17", name = "Enable notification list 17", description = "", section = notificationList17)
	default Notification notificationEnabled17() { return Notification.OFF; }
	@ConfigItem(position = 175, keyName = "overlayText17", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList17)
	default String overlayText17() { return ""; }
	@Alpha @ConfigItem(position = 176, keyName = "overlayColor17", name = "Text color", description = "Color of the overlay text.", section = notificationList17)
	default Color overlayColor17() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 177, keyName = "overlaySize17", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList17)
	default int overlaySize17() { return 16; }
	@ConfigItem(position = 178, keyName = "overlayPosition17", name = NAME_POSITION, description = DESC_POSITION, section = notificationList17)
	default OverlayPositionMode overlayPosition17() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 179, keyName = "overlayBgColor17", name = "Background color", description = "Background color behind the overlay text.", section = notificationList17)
	default Color overlayBgColor17() { return Color.BLACK; }

	// Notification list 18
	@ConfigSection(name = "Notification list 18", description = "Notification list 18 settings.", position = 180, closedByDefault = true)
	String notificationList18 = "notificationList18";
	@ConfigItem(position = 181, keyName = "listAlias18", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList18)
	default String listAlias18() { return ""; }
	@ConfigItem(position = 182, keyName = "notificationWords18", name = NAME_WORDS, description = DESC_WORDS, section = notificationList18)
	default String notificationWords18() { return ""; }
	@ConfigItem(position = 183, keyName = "notificationRegex18", name = NAME_REGEX, description = DESC_REGEX, section = notificationList18)
	default String notificationRegex18() { return ""; }
	@ConfigItem(position = 184, keyName = "notificationEnabled18", name = "Enable notification list 18", description = "", section = notificationList18)
	default Notification notificationEnabled18() { return Notification.OFF; }
	@ConfigItem(position = 185, keyName = "overlayText18", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList18)
	default String overlayText18() { return ""; }
	@Alpha @ConfigItem(position = 186, keyName = "overlayColor18", name = "Text color", description = "Color of the overlay text.", section = notificationList18)
	default Color overlayColor18() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 187, keyName = "overlaySize18", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList18)
	default int overlaySize18() { return 16; }
	@ConfigItem(position = 188, keyName = "overlayPosition18", name = NAME_POSITION, description = DESC_POSITION, section = notificationList18)
	default OverlayPositionMode overlayPosition18() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 189, keyName = "overlayBgColor18", name = "Background color", description = "Background color behind the overlay text.", section = notificationList18)
	default Color overlayBgColor18() { return Color.BLACK; }

	// Notification list 19
	@ConfigSection(name = "Notification list 19", description = "Notification list 19 settings.", position = 190, closedByDefault = true)
	String notificationList19 = "notificationList19";
	@ConfigItem(position = 191, keyName = "listAlias19", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList19)
	default String listAlias19() { return ""; }
	@ConfigItem(position = 192, keyName = "notificationWords19", name = NAME_WORDS, description = DESC_WORDS, section = notificationList19)
	default String notificationWords19() { return ""; }
	@ConfigItem(position = 193, keyName = "notificationRegex19", name = NAME_REGEX, description = DESC_REGEX, section = notificationList19)
	default String notificationRegex19() { return ""; }
	@ConfigItem(position = 194, keyName = "notificationEnabled19", name = "Enable notification list 19", description = "", section = notificationList19)
	default Notification notificationEnabled19() { return Notification.OFF; }
	@ConfigItem(position = 195, keyName = "overlayText19", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList19)
	default String overlayText19() { return ""; }
	@Alpha @ConfigItem(position = 196, keyName = "overlayColor19", name = "Text color", description = "Color of the overlay text.", section = notificationList19)
	default Color overlayColor19() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 197, keyName = "overlaySize19", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList19)
	default int overlaySize19() { return 16; }
	@ConfigItem(position = 198, keyName = "overlayPosition19", name = NAME_POSITION, description = DESC_POSITION, section = notificationList19)
	default OverlayPositionMode overlayPosition19() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 199, keyName = "overlayBgColor19", name = "Background color", description = "Background color behind the overlay text.", section = notificationList19)
	default Color overlayBgColor19() { return Color.BLACK; }

	// Notification list 20
	@ConfigSection(name = "Notification list 20", description = "Notification list 20 settings.", position = 200, closedByDefault = true)
	String notificationList20 = "notificationList20";
	@ConfigItem(position = 201, keyName = "listAlias20", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList20)
	default String listAlias20() { return ""; }
	@ConfigItem(position = 202, keyName = "notificationWords20", name = NAME_WORDS, description = DESC_WORDS, section = notificationList20)
	default String notificationWords20() { return ""; }
	@ConfigItem(position = 203, keyName = "notificationRegex20", name = NAME_REGEX, description = DESC_REGEX, section = notificationList20)
	default String notificationRegex20() { return ""; }
	@ConfigItem(position = 204, keyName = "notificationEnabled20", name = "Enable notification list 20", description = "", section = notificationList20)
	default Notification notificationEnabled20() { return Notification.OFF; }
	@ConfigItem(position = 205, keyName = "overlayText20", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList20)
	default String overlayText20() { return ""; }
	@Alpha @ConfigItem(position = 206, keyName = "overlayColor20", name = "Text color", description = "Color of the overlay text.", section = notificationList20)
	default Color overlayColor20() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 207, keyName = "overlaySize20", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList20)
	default int overlaySize20() { return 16; }
	@ConfigItem(position = 208, keyName = "overlayPosition20", name = NAME_POSITION, description = DESC_POSITION, section = notificationList20)
	default OverlayPositionMode overlayPosition20() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 209, keyName = "overlayBgColor20", name = "Background color", description = "Background color behind the overlay text.", section = notificationList20)
	default Color overlayBgColor20() { return Color.BLACK; }

	// Notification list 21
	@ConfigSection(name = "Notification list 21", description = "Notification list 21 settings.", position = 210, closedByDefault = true)
	String notificationList21 = "notificationList21";
	@ConfigItem(position = 211, keyName = "listAlias21", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList21)
	default String listAlias21() { return ""; }
	@ConfigItem(position = 212, keyName = "notificationWords21", name = NAME_WORDS, description = DESC_WORDS, section = notificationList21)
	default String notificationWords21() { return ""; }
	@ConfigItem(position = 213, keyName = "notificationRegex21", name = NAME_REGEX, description = DESC_REGEX, section = notificationList21)
	default String notificationRegex21() { return ""; }
	@ConfigItem(position = 214, keyName = "notificationEnabled21", name = "Enable notification list 21", description = "", section = notificationList21)
	default Notification notificationEnabled21() { return Notification.OFF; }
	@ConfigItem(position = 215, keyName = "overlayText21", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList21)
	default String overlayText21() { return ""; }
	@Alpha @ConfigItem(position = 216, keyName = "overlayColor21", name = "Text color", description = "Color of the overlay text.", section = notificationList21)
	default Color overlayColor21() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 217, keyName = "overlaySize21", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList21)
	default int overlaySize21() { return 16; }
	@ConfigItem(position = 218, keyName = "overlayPosition21", name = NAME_POSITION, description = DESC_POSITION, section = notificationList21)
	default OverlayPositionMode overlayPosition21() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 219, keyName = "overlayBgColor21", name = "Background color", description = "Background color behind the overlay text.", section = notificationList21)
	default Color overlayBgColor21() { return Color.BLACK; }

	// Notification list 22
	@ConfigSection(name = "Notification list 22", description = "Notification list 22 settings.", position = 220, closedByDefault = true)
	String notificationList22 = "notificationList22";
	@ConfigItem(position = 221, keyName = "listAlias22", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList22)
	default String listAlias22() { return ""; }
	@ConfigItem(position = 222, keyName = "notificationWords22", name = NAME_WORDS, description = DESC_WORDS, section = notificationList22)
	default String notificationWords22() { return ""; }
	@ConfigItem(position = 223, keyName = "notificationRegex22", name = NAME_REGEX, description = DESC_REGEX, section = notificationList22)
	default String notificationRegex22() { return ""; }
	@ConfigItem(position = 224, keyName = "notificationEnabled22", name = "Enable notification list 22", description = "", section = notificationList22)
	default Notification notificationEnabled22() { return Notification.OFF; }
	@ConfigItem(position = 225, keyName = "overlayText22", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList22)
	default String overlayText22() { return ""; }
	@Alpha @ConfigItem(position = 226, keyName = "overlayColor22", name = "Text color", description = "Color of the overlay text.", section = notificationList22)
	default Color overlayColor22() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 227, keyName = "overlaySize22", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList22)
	default int overlaySize22() { return 16; }
	@ConfigItem(position = 228, keyName = "overlayPosition22", name = NAME_POSITION, description = DESC_POSITION, section = notificationList22)
	default OverlayPositionMode overlayPosition22() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 229, keyName = "overlayBgColor22", name = "Background color", description = "Background color behind the overlay text.", section = notificationList22)
	default Color overlayBgColor22() { return Color.BLACK; }

	// Notification list 23
	@ConfigSection(name = "Notification list 23", description = "Notification list 23 settings.", position = 230, closedByDefault = true)
	String notificationList23 = "notificationList23";
	@ConfigItem(position = 231, keyName = "listAlias23", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList23)
	default String listAlias23() { return ""; }
	@ConfigItem(position = 232, keyName = "notificationWords23", name = NAME_WORDS, description = DESC_WORDS, section = notificationList23)
	default String notificationWords23() { return ""; }
	@ConfigItem(position = 233, keyName = "notificationRegex23", name = NAME_REGEX, description = DESC_REGEX, section = notificationList23)
	default String notificationRegex23() { return ""; }
	@ConfigItem(position = 234, keyName = "notificationEnabled23", name = "Enable notification list 23", description = "", section = notificationList23)
	default Notification notificationEnabled23() { return Notification.OFF; }
	@ConfigItem(position = 235, keyName = "overlayText23", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList23)
	default String overlayText23() { return ""; }
	@Alpha @ConfigItem(position = 236, keyName = "overlayColor23", name = "Text color", description = "Color of the overlay text.", section = notificationList23)
	default Color overlayColor23() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 237, keyName = "overlaySize23", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList23)
	default int overlaySize23() { return 16; }
	@ConfigItem(position = 238, keyName = "overlayPosition23", name = NAME_POSITION, description = DESC_POSITION, section = notificationList23)
	default OverlayPositionMode overlayPosition23() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 239, keyName = "overlayBgColor23", name = "Background color", description = "Background color behind the overlay text.", section = notificationList23)
	default Color overlayBgColor23() { return Color.BLACK; }

	// Notification list 24
	@ConfigSection(name = "Notification list 24", description = "Notification list 24 settings.", position = 240, closedByDefault = true)
	String notificationList24 = "notificationList24";
	@ConfigItem(position = 241, keyName = "listAlias24", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList24)
	default String listAlias24() { return ""; }
	@ConfigItem(position = 242, keyName = "notificationWords24", name = NAME_WORDS, description = DESC_WORDS, section = notificationList24)
	default String notificationWords24() { return ""; }
	@ConfigItem(position = 243, keyName = "notificationRegex24", name = NAME_REGEX, description = DESC_REGEX, section = notificationList24)
	default String notificationRegex24() { return ""; }
	@ConfigItem(position = 244, keyName = "notificationEnabled24", name = "Enable notification list 24", description = "", section = notificationList24)
	default Notification notificationEnabled24() { return Notification.OFF; }
	@ConfigItem(position = 245, keyName = "overlayText24", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList24)
	default String overlayText24() { return ""; }
	@Alpha @ConfigItem(position = 246, keyName = "overlayColor24", name = "Text color", description = "Color of the overlay text.", section = notificationList24)
	default Color overlayColor24() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 247, keyName = "overlaySize24", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList24)
	default int overlaySize24() { return 16; }
	@ConfigItem(position = 248, keyName = "overlayPosition24", name = NAME_POSITION, description = DESC_POSITION, section = notificationList24)
	default OverlayPositionMode overlayPosition24() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 249, keyName = "overlayBgColor24", name = "Background color", description = "Background color behind the overlay text.", section = notificationList24)
	default Color overlayBgColor24() { return Color.BLACK; }

	// Notification list 25
	@ConfigSection(name = "Notification list 25", description = "Notification list 25 settings.", position = 250, closedByDefault = true)
	String notificationList25 = "notificationList25";
	@ConfigItem(position = 251, keyName = "listAlias25", name = NAME_ALIAS, description = DESC_ALIAS, section = notificationList25)
	default String listAlias25() { return ""; }
	@ConfigItem(position = 252, keyName = "notificationWords25", name = NAME_WORDS, description = DESC_WORDS, section = notificationList25)
	default String notificationWords25() { return ""; }
	@ConfigItem(position = 253, keyName = "notificationRegex25", name = NAME_REGEX, description = DESC_REGEX, section = notificationList25)
	default String notificationRegex25() { return ""; }
	@ConfigItem(position = 254, keyName = "notificationEnabled25", name = "Enable notification list 25", description = "", section = notificationList25)
	default Notification notificationEnabled25() { return Notification.OFF; }
	@ConfigItem(position = 255, keyName = "overlayText25", name = "Text", description = "Text to show on screen when this notification triggers. Leave empty to disable.", section = notificationList25)
	default String overlayText25() { return ""; }
	@Alpha @ConfigItem(position = 256, keyName = "overlayColor25", name = "Text color", description = "Color of the overlay text.", section = notificationList25)
	default Color overlayColor25() { return Color.WHITE; }
	@Range(min = 1, max = 128) @ConfigItem(position = 257, keyName = "overlaySize25", name = "Text size", description = "Font size of the overlay text (between 1-128).", section = notificationList25)
	default int overlaySize25() { return 16; }
	@ConfigItem(position = 258, keyName = "overlayPosition25", name = NAME_POSITION, description = DESC_POSITION, section = notificationList25)
	default OverlayPositionMode overlayPosition25() { return OverlayPositionMode.TOP; }
	@Alpha @ConfigItem(position = 259, keyName = "overlayBgColor25", name = "Background color", description = "Background color behind the overlay text.", section = notificationList25)
	default Color overlayBgColor25() { return Color.BLACK; }
}
