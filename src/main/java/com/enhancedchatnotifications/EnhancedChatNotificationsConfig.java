package com.enhancedchatnotifications;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Notification;

@ConfigGroup("enhancedchatnotifications")
public interface EnhancedChatNotificationsConfig extends Config
{
	// Shared description and name constants
	String NAME_WORDS = "Highlight words";
	String NAME_REGEX = "Highlight regex";
	String DESC_WORDS = "Highlights the following words in chat, separated by commas.";
	String DESC_REGEX = "Highlights the following regular expressions in chat, one per line.";

	@ConfigItem(
			position = 0,
			keyName = "enableMultipleLists",
			name = "Enable multiple highlight lists",
			description = "When enabled you can customize a notification for each highlight list."
	)
	default boolean enableMultipleLists()
	{
		return false;
	}

	// ==================== Highlight list 1 ====================
	@ConfigSection(
			name = "Highlight list 1",
			description = "Highlight list 1 settings.",
			position = 10,
			closedByDefault = false
	)
	String highlightList1 = "highlightList1";

	@ConfigItem(
			position = 11,
			keyName = "highlightWords1",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList1
	)
	default String highlightWords1()
	{
		return "";
	}

	@ConfigItem(
			position = 12,
			keyName = "highlightRegex1",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList1
	)
	default String highlightRegex1()
	{
		return "";
	}

	@ConfigItem(
			position = 13,
			keyName = "notifyOnHighlight1",
			name = "Notify on highlight list 1",
			description = "Notifies you whenever a highlighted word in list 1 is matched.",
			section = highlightList1
	)
	default Notification notifyOnHighlight1()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 2 ====================
	@ConfigSection(
			name = "Highlight list 2",
			description = "Highlight list 2 settings.",
			position = 20,
			closedByDefault = true
	)
	String highlightList2 = "highlightList2";

	@ConfigItem(
			position = 21,
			keyName = "highlightWords2",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList2
	)
	default String highlightWords2()
	{
		return "";
	}

	@ConfigItem(
			position = 22,
			keyName = "highlightRegex2",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList2
	)
	default String highlightRegex2()
	{
		return "";
	}

	@ConfigItem(
			position = 23,
			keyName = "notifyOnHighlight2",
			name = "Notify on highlight list 2",
			description = "Notifies you whenever a highlighted word in list 2 is matched.",
			section = highlightList2
	)
	default Notification notifyOnHighlight2()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 3 ====================
	@ConfigSection(
			name = "Highlight list 3",
			description = "Highlight list 3 settings.",
			position = 30,
			closedByDefault = true
	)
	String highlightList3 = "highlightList3";

	@ConfigItem(
			position = 31,
			keyName = "highlightWords3",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList3
	)
	default String highlightWords3()
	{
		return "";
	}

	@ConfigItem(
			position = 32,
			keyName = "highlightRegex3",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList3
	)
	default String highlightRegex3()
	{
		return "";
	}

	@ConfigItem(
			position = 33,
			keyName = "notifyOnHighlight3",
			name = "Notify on highlight list 3",
			description = "Notifies you whenever a highlighted word in list 3 is matched.",
			section = highlightList3
	)
	default Notification notifyOnHighlight3()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 4 ====================
	@ConfigSection(
			name = "Highlight list 4",
			description = "Highlight list 4 settings.",
			position = 40,
			closedByDefault = true
	)
	String highlightList4 = "highlightList4";

	@ConfigItem(
			position = 41,
			keyName = "highlightWords4",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList4
	)
	default String highlightWords4()
	{
		return "";
	}

	@ConfigItem(
			position = 42,
			keyName = "highlightRegex4",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList4
	)
	default String highlightRegex4()
	{
		return "";
	}

	@ConfigItem(
			position = 43,
			keyName = "notifyOnHighlight4",
			name = "Notify on highlight list 4",
			description = "Notifies you whenever a highlighted word in list 4 is matched.",
			section = highlightList4
	)
	default Notification notifyOnHighlight4()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 5 ====================
	@ConfigSection(
			name = "Highlight list 5",
			description = "Highlight list 5 settings.",
			position = 50,
			closedByDefault = true
	)
	String highlightList5 = "highlightList5";

	@ConfigItem(
			position = 51,
			keyName = "highlightWords5",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList5
	)
	default String highlightWords5()
	{
		return "";
	}

	@ConfigItem(
			position = 52,
			keyName = "highlightRegex5",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList5
	)
	default String highlightRegex5()
	{
		return "";
	}

	@ConfigItem(
			position = 53,
			keyName = "notifyOnHighlight5",
			name = "Notify on highlight list 5",
			description = "Notifies you whenever a highlighted word in list 5 is matched.",
			section = highlightList5
	)
	default Notification notifyOnHighlight5()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 6 ====================
	@ConfigSection(
			name = "Highlight list 6",
			description = "Highlight list 6 settings.",
			position = 60,
			closedByDefault = true
	)
	String highlightList6 = "highlightList6";

	@ConfigItem(
			position = 61,
			keyName = "highlightWords6",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList6
	)
	default String highlightWords6()
	{
		return "";
	}

	@ConfigItem(
			position = 62,
			keyName = "highlightRegex6",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList6
	)
	default String highlightRegex6()
	{
		return "";
	}

	@ConfigItem(
			position = 63,
			keyName = "notifyOnHighlight6",
			name = "Notify on highlight list 6",
			description = "Notifies you whenever a highlighted word in list 6 is matched.",
			section = highlightList6
	)
	default Notification notifyOnHighlight6()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 7 ====================
	@ConfigSection(
			name = "Highlight list 7",
			description = "Highlight list 7 settings.",
			position = 70,
			closedByDefault = true
	)
	String highlightList7 = "highlightList7";

	@ConfigItem(
			position = 71,
			keyName = "highlightWords7",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList7
	)
	default String highlightWords7()
	{
		return "";
	}

	@ConfigItem(
			position = 72,
			keyName = "highlightRegex7",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList7
	)
	default String highlightRegex7()
	{
		return "";
	}

	@ConfigItem(
			position = 73,
			keyName = "notifyOnHighlight7",
			name = "Notify on highlight list 7",
			description = "Notifies you whenever a highlighted word in list 7 is matched.",
			section = highlightList7
	)
	default Notification notifyOnHighlight7()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 8 ====================
	@ConfigSection(
			name = "Highlight list 8",
			description = "Highlight list 8 settings.",
			position = 80,
			closedByDefault = true
	)
	String highlightList8 = "highlightList8";

	@ConfigItem(
			position = 81,
			keyName = "highlightWords8",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList8
	)
	default String highlightWords8()
	{
		return "";
	}

	@ConfigItem(
			position = 82,
			keyName = "highlightRegex8",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList8
	)
	default String highlightRegex8()
	{
		return "";
	}

	@ConfigItem(
			position = 83,
			keyName = "notifyOnHighlight8",
			name = "Notify on highlight list 8",
			description = "Notifies you whenever a highlighted word in list 8 is matched.",
			section = highlightList8
	)
	default Notification notifyOnHighlight8()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 9 ====================
	@ConfigSection(
			name = "Highlight list 9",
			description = "Highlight list 9 settings.",
			position = 90,
			closedByDefault = true
	)
	String highlightList9 = "highlightList9";

	@ConfigItem(
			position = 91,
			keyName = "highlightWords9",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList9
	)
	default String highlightWords9()
	{
		return "";
	}

	@ConfigItem(
			position = 92,
			keyName = "highlightRegex9",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList9
	)
	default String highlightRegex9()
	{
		return "";
	}

	@ConfigItem(
			position = 93,
			keyName = "notifyOnHighlight9",
			name = "Notify on highlight list 9",
			description = "Notifies you whenever a highlighted word in list 9 is matched.",
			section = highlightList9
	)
	default Notification notifyOnHighlight9()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 10 ====================
	@ConfigSection(
			name = "Highlight list 10",
			description = "Highlight list 10 settings.",
			position = 100,
			closedByDefault = true
	)
	String highlightList10 = "highlightList10";

	@ConfigItem(
			position = 101,
			keyName = "highlightWords10",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList10
	)
	default String highlightWords10()
	{
		return "";
	}

	@ConfigItem(
			position = 102,
			keyName = "highlightRegex10",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList10
	)
	default String highlightRegex10()
	{
		return "";
	}

	@ConfigItem(
			position = 103,
			keyName = "notifyOnHighlight10",
			name = "Notify on highlight list 10",
			description = "Notifies you whenever a highlighted word in list 10 is matched.",
			section = highlightList10
	)
	default Notification notifyOnHighlight10()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 11 ====================
	@ConfigSection(
			name = "Highlight list 11",
			description = "Highlight list 11 settings.",
			position = 110,
			closedByDefault = true
	)
	String highlightList11 = "highlightList11";

	@ConfigItem(
			position = 111,
			keyName = "highlightWords11",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList11
	)
	default String highlightWords11()
	{
		return "";
	}

	@ConfigItem(
			position = 112,
			keyName = "highlightRegex11",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList11
	)
	default String highlightRegex11()
	{
		return "";
	}

	@ConfigItem(
			position = 113,
			keyName = "notifyOnHighlight11",
			name = "Notify on highlight list 11",
			description = "Notifies you whenever a highlighted word in list 11 is matched.",
			section = highlightList11
	)
	default Notification notifyOnHighlight11()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 12 ====================
	@ConfigSection(
			name = "Highlight list 12",
			description = "Highlight list 12 settings.",
			position = 120,
			closedByDefault = true
	)
	String highlightList12 = "highlightList12";

	@ConfigItem(
			position = 121,
			keyName = "highlightWords12",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList12
	)
	default String highlightWords12()
	{
		return "";
	}

	@ConfigItem(
			position = 122,
			keyName = "highlightRegex12",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList12
	)
	default String highlightRegex12()
	{
		return "";
	}

	@ConfigItem(
			position = 123,
			keyName = "notifyOnHighlight12",
			name = "Notify on highlight list 12",
			description = "Notifies you whenever a highlighted word in list 12 is matched.",
			section = highlightList12
	)
	default Notification notifyOnHighlight12()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 13 ====================
	@ConfigSection(
			name = "Highlight list 13",
			description = "Highlight list 13 settings.",
			position = 130,
			closedByDefault = true
	)
	String highlightList13 = "highlightList13";

	@ConfigItem(
			position = 131,
			keyName = "highlightWords13",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList13
	)
	default String highlightWords13()
	{
		return "";
	}

	@ConfigItem(
			position = 132,
			keyName = "highlightRegex13",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList13
	)
	default String highlightRegex13()
	{
		return "";
	}

	@ConfigItem(
			position = 133,
			keyName = "notifyOnHighlight13",
			name = "Notify on highlight list 13",
			description = "Notifies you whenever a highlighted word in list 13 is matched.",
			section = highlightList13
	)
	default Notification notifyOnHighlight13()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 14 ====================
	@ConfigSection(
			name = "Highlight list 14",
			description = "Highlight list 14 settings.",
			position = 140,
			closedByDefault = true
	)
	String highlightList14 = "highlightList14";

	@ConfigItem(
			position = 141,
			keyName = "highlightWords14",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList14
	)
	default String highlightWords14()
	{
		return "";
	}

	@ConfigItem(
			position = 142,
			keyName = "highlightRegex14",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList14
	)
	default String highlightRegex14()
	{
		return "";
	}

	@ConfigItem(
			position = 143,
			keyName = "notifyOnHighlight14",
			name = "Notify on highlight list 14",
			description = "Notifies you whenever a highlighted word in list 14 is matched.",
			section = highlightList14
	)
	default Notification notifyOnHighlight14()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 15 ====================
	@ConfigSection(
			name = "Highlight list 15",
			description = "Highlight list 15 settings.",
			position = 150,
			closedByDefault = true
	)
	String highlightList15 = "highlightList15";

	@ConfigItem(
			position = 151,
			keyName = "highlightWords15",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList15
	)
	default String highlightWords15()
	{
		return "";
	}

	@ConfigItem(
			position = 152,
			keyName = "highlightRegex15",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList15
	)
	default String highlightRegex15()
	{
		return "";
	}

	@ConfigItem(
			position = 153,
			keyName = "notifyOnHighlight15",
			name = "Notify on highlight list 15",
			description = "Notifies you whenever a highlighted word in list 15 is matched.",
			section = highlightList15
	)
	default Notification notifyOnHighlight15()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 16 ====================
	@ConfigSection(
			name = "Highlight list 16",
			description = "Highlight list 16 settings.",
			position = 160,
			closedByDefault = true
	)
	String highlightList16 = "highlightList16";

	@ConfigItem(
			position = 161,
			keyName = "highlightWords16",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList16
	)
	default String highlightWords16()
	{
		return "";
	}

	@ConfigItem(
			position = 162,
			keyName = "highlightRegex16",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList16
	)
	default String highlightRegex16()
	{
		return "";
	}

	@ConfigItem(
			position = 163,
			keyName = "notifyOnHighlight16",
			name = "Notify on highlight list 16",
			description = "Notifies you whenever a highlighted word in list 16 is matched.",
			section = highlightList16
	)
	default Notification notifyOnHighlight16()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 17 ====================
	@ConfigSection(
			name = "Highlight list 17",
			description = "Highlight list 17 settings.",
			position = 170,
			closedByDefault = true
	)
	String highlightList17 = "highlightList17";

	@ConfigItem(
			position = 171,
			keyName = "highlightWords17",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList17
	)
	default String highlightWords17()
	{
		return "";
	}

	@ConfigItem(
			position = 172,
			keyName = "highlightRegex17",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList17
	)
	default String highlightRegex17()
	{
		return "";
	}

	@ConfigItem(
			position = 173,
			keyName = "notifyOnHighlight17",
			name = "Notify on highlight list 17",
			description = "Notifies you whenever a highlighted word in list 17 is matched.",
			section = highlightList17
	)
	default Notification notifyOnHighlight17()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 18 ====================
	@ConfigSection(
			name = "Highlight list 18",
			description = "Highlight list 18 settings.",
			position = 180,
			closedByDefault = true
	)
	String highlightList18 = "highlightList18";

	@ConfigItem(
			position = 181,
			keyName = "highlightWords18",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList18
	)
	default String highlightWords18()
	{
		return "";
	}

	@ConfigItem(
			position = 182,
			keyName = "highlightRegex18",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList18
	)
	default String highlightRegex18()
	{
		return "";
	}

	@ConfigItem(
			position = 183,
			keyName = "notifyOnHighlight18",
			name = "Notify on highlight list 18",
			description = "Notifies you whenever a highlighted word in list 18 is matched.",
			section = highlightList18
	)
	default Notification notifyOnHighlight18()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 19 ====================
	@ConfigSection(
			name = "Highlight list 19",
			description = "Highlight list 19 settings.",
			position = 190,
			closedByDefault = true
	)
	String highlightList19 = "highlightList19";

	@ConfigItem(
			position = 191,
			keyName = "highlightWords19",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList19
	)
	default String highlightWords19()
	{
		return "";
	}

	@ConfigItem(
			position = 192,
			keyName = "highlightRegex19",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList19
	)
	default String highlightRegex19()
	{
		return "";
	}

	@ConfigItem(
			position = 193,
			keyName = "notifyOnHighlight19",
			name = "Notify on highlight list 19",
			description = "Notifies you whenever a highlighted word in list 19 is matched.",
			section = highlightList19
	)
	default Notification notifyOnHighlight19()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 20 ====================
	@ConfigSection(
			name = "Highlight list 20",
			description = "Highlight list 20 settings.",
			position = 200,
			closedByDefault = true
	)
	String highlightList20 = "highlightList20";

	@ConfigItem(
			position = 201,
			keyName = "highlightWords20",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList20
	)
	default String highlightWords20()
	{
		return "";
	}

	@ConfigItem(
			position = 202,
			keyName = "highlightRegex20",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList20
	)
	default String highlightRegex20()
	{
		return "";
	}

	@ConfigItem(
			position = 203,
			keyName = "notifyOnHighlight20",
			name = "Notify on highlight list 20",
			description = "Notifies you whenever a highlighted word in list 20 is matched.",
			section = highlightList20
	)
	default Notification notifyOnHighlight20()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 21 ====================
	@ConfigSection(
			name = "Highlight list 21",
			description = "Highlight list 21 settings.",
			position = 210,
			closedByDefault = true
	)
	String highlightList21 = "highlightList21";

	@ConfigItem(
			position = 211,
			keyName = "highlightWords21",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList21
	)
	default String highlightWords21()
	{
		return "";
	}

	@ConfigItem(
			position = 212,
			keyName = "highlightRegex21",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList21
	)
	default String highlightRegex21()
	{
		return "";
	}

	@ConfigItem(
			position = 213,
			keyName = "notifyOnHighlight21",
			name = "Notify on highlight list 21",
			description = "Notifies you whenever a highlighted word in list 21 is matched.",
			section = highlightList21
	)
	default Notification notifyOnHighlight21()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 22 ====================
	@ConfigSection(
			name = "Highlight list 22",
			description = "Highlight list 22 settings.",
			position = 220,
			closedByDefault = true
	)
	String highlightList22 = "highlightList22";

	@ConfigItem(
			position = 221,
			keyName = "highlightWords22",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList22
	)
	default String highlightWords22()
	{
		return "";
	}

	@ConfigItem(
			position = 222,
			keyName = "highlightRegex22",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList22
	)
	default String highlightRegex22()
	{
		return "";
	}

	@ConfigItem(
			position = 223,
			keyName = "notifyOnHighlight22",
			name = "Notify on highlight list 22",
			description = "Notifies you whenever a highlighted word in list 22 is matched.",
			section = highlightList22
	)
	default Notification notifyOnHighlight22()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 23 ====================
	@ConfigSection(
			name = "Highlight list 23",
			description = "Highlight list 23 settings.",
			position = 230,
			closedByDefault = true
	)
	String highlightList23 = "highlightList23";

	@ConfigItem(
			position = 231,
			keyName = "highlightWords23",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList23
	)
	default String highlightWords23()
	{
		return "";
	}

	@ConfigItem(
			position = 232,
			keyName = "highlightRegex23",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList23
	)
	default String highlightRegex23()
	{
		return "";
	}

	@ConfigItem(
			position = 233,
			keyName = "notifyOnHighlight23",
			name = "Notify on highlight list 23",
			description = "Notifies you whenever a highlighted word in list 23 is matched.",
			section = highlightList23
	)
	default Notification notifyOnHighlight23()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 24 ====================
	@ConfigSection(
			name = "Highlight list 24",
			description = "Highlight list 24 settings.",
			position = 240,
			closedByDefault = true
	)
	String highlightList24 = "highlightList24";

	@ConfigItem(
			position = 241,
			keyName = "highlightWords24",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList24
	)
	default String highlightWords24()
	{
		return "";
	}

	@ConfigItem(
			position = 242,
			keyName = "highlightRegex24",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList24
	)
	default String highlightRegex24()
	{
		return "";
	}

	@ConfigItem(
			position = 243,
			keyName = "notifyOnHighlight24",
			name = "Notify on highlight list 24",
			description = "Notifies you whenever a highlighted word in list 24 is matched.",
			section = highlightList24
	)
	default Notification notifyOnHighlight24()
	{
		return Notification.OFF;
	}

	// ==================== Highlight list 25 ====================
	@ConfigSection(
			name = "Highlight list 25",
			description = "Highlight list 25 settings.",
			position = 250,
			closedByDefault = true
	)
	String highlightList25 = "highlightList25";

	@ConfigItem(
			position = 251,
			keyName = "highlightWords25",
			name = NAME_WORDS,
			description = DESC_WORDS,
			section = highlightList25
	)
	default String highlightWords25()
	{
		return "";
	}

	@ConfigItem(
			position = 252,
			keyName = "highlightRegex25",
			name = NAME_REGEX,
			description = DESC_REGEX,
			section = highlightList25
	)
	default String highlightRegex25()
	{
		return "";
	}

	@ConfigItem(
			position = 253,
			keyName = "notifyOnHighlight25",
			name = "Notify on highlight list 25",
			description = "Notifies you whenever a highlighted word in list 25 is matched.",
			section = highlightList25
	)
	default Notification notifyOnHighlight25()
	{
		return Notification.OFF;
	}
}