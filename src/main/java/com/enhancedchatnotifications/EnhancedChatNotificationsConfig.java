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
	String NAME_WORDS = "Notify based on words in text message";
	String NAME_REGEX = "Notify based on regex";
	String DESC_WORDS = "Notify based on the following words in chat, separated by commas.";
	String DESC_REGEX = "Use regex for more advanced notifications (separated by enter). Example to notify on all valuable drops except coins and runite ore: Valuable drop: (?!.*(x Coins|Runite ore)).";

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
}