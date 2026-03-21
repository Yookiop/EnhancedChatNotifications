package com.enhancedchatnotifications;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.inject.Provides;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.Notifier;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.Notification;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;

@Slf4j
@PluginDescriptor(
		name = "Enhanced Chat Notifications",
		description = "Enable multiple custom notifications based on chat messages",
		tags = {"chat", "notifications"},
		enabledByDefault = true
)
public class EnhancedChatNotificationsPlugin extends Plugin
{
	static final int MAX_LISTS = 25;
	private static final String CONFIG_GROUP = "enhancedchatnotifications";

	@Inject
	private Client client;

	@Inject
	private EnhancedChatNotificationsConfig config;

	@Inject
	private ConfigManager configManager;

	@Inject
	private Notifier notifier;

	@Inject
	@Named("runelite.title")
	private String runeliteTitle;

	private final List<List<Pattern>> allListPatterns = new ArrayList<>();

	@Provides
	EnhancedChatNotificationsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EnhancedChatNotificationsConfig.class);
	}

	@Override
	protected void startUp()
	{
		updateNotifications();
	}

	@Override
	protected void shutDown()
	{
		allListPatterns.clear();
	}
	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals(CONFIG_GROUP))
		{
			updateNotifications();
		}
	}

	private void updateNotifications()
	{
		allListPatterns.clear();

		int listCount = MAX_LISTS;

		for (int i = 1; i <= listCount; i++)
		{
			List<Pattern> patterns = new ArrayList<>();

			String words = getNotificationWords(i);
			if (words != null && !words.trim().isEmpty())
			{
				List<String> items = Text.fromCSV(words);
				String joined = items.stream()
						.map(Text::escapeJagex)
						.map(this::quoteAndIgnoreColor)
						.collect(Collectors.joining("|"));
				Pattern p = compilePattern("(?:\\b|(?<=\\s)|\\A)(?:" + joined + ")(?:\\b|(?=\\s)|\\z)");
				if (p != null)
				{
					patterns.add(p);
				}
			}

			String regex = getNotificationRegex(i);
			if (regex != null && !regex.trim().isEmpty())
			{
				Splitter.on("\n")
						.omitEmptyStrings()
						.trimResults()
						.splitToList(regex).stream()
						.map(EnhancedChatNotificationsPlugin::compilePattern)
						.filter(Objects::nonNull)
						.forEach(patterns::add);
			}

			allListPatterns.add(patterns);
		}
	}

	private String getNotificationWords(int list)
	{
		String val = configManager.getConfiguration(CONFIG_GROUP, "notificationWords" + list);
		return val != null ? val : "";
	}

	private String getNotificationRegex(int list)
	{
		String val = configManager.getConfiguration(CONFIG_GROUP, "notificationRegex" + list);
		return val != null ? val : "";
	}

	private Notification getNotificationEnabled(int list)
	{
		Notification n = configManager.getConfiguration(CONFIG_GROUP, "notificationEnabled" + list, Notification.class);
		return n != null ? n : Notification.OFF;
	}

	private static Pattern compilePattern(String pattern)
	{
		try
		{
			return Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		}
		catch (PatternSyntaxException ex)
		{
			return null;
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		MessageNode messageNode = chatMessage.getMessageNode();
		boolean update = false;

		switch (chatMessage.getType())
		{
			case PRIVATECHATOUT:
			case DIALOG:
			case MESBOX:
				return;
			case MODCHAT:
			case PUBLICCHAT:
			case FRIENDSCHAT:
			case CLAN_CHAT:
			case CLAN_GUEST_CHAT:
			case CLAN_GIM_CHAT:
			case AUTOTYPER:
			case MODAUTOTYPER:
				if (client.getLocalPlayer() != null && Text.toJagexName(Text.removeTags(chatMessage.getName())).equals(client.getLocalPlayer().getName()))
				{
					return;
				}
				break;
			case CONSOLE:
				if (chatMessage.getName().equals(runeliteTitle))
				{
					return;
				}
				break;
		}

		String nodeValue = messageNode.getValue();

		for (int listIdx = 0; listIdx < allListPatterns.size(); listIdx++)
		{
			List<Pattern> patterns = allListPatterns.get(listIdx);
			boolean matchesThisList = false;

			for (Pattern pattern : patterns)
			{
				Matcher matcher = pattern.matcher(nodeValue);
				if (!matcher.find())
				{
					continue;
				}

				StringBuffer stringBuffer = new StringBuffer();

				do
				{
					final int end = matcher.end();
					final String closeColor = MoreObjects.firstNonNull(
							getLastColor(nodeValue.substring(0, end)),
							"<col" + ChatColorType.NORMAL + '>');
					final String value = stripColor(matcher.group());

					matcher.appendReplacement(stringBuffer, "<col" + ChatColorType.HIGHLIGHT + '>' + value + closeColor);

					update = true;
					matchesThisList = true;
				}
				while (matcher.find());

				matcher.appendTail(stringBuffer);
				nodeValue = stringBuffer.toString();
			}

			if (matchesThisList)
			{
				sendNotification(getNotificationEnabled(listIdx + 1), chatMessage);
			}
		}

		if (update)
		{
			messageNode.setValue(nodeValue);
			messageNode.setRuneLiteFormatMessage(messageNode.getValue());
		}
	}

	private void sendNotification(Notification notification, ChatMessage message)
	{
		String name = Text.removeTags(message.getName());
		String sender = message.getSender();
		StringBuilder stringBuilder = new StringBuilder();

		if (!Strings.isNullOrEmpty(sender))
		{
			stringBuilder.append('[').append(sender).append("] ");
		}

		if (!Strings.isNullOrEmpty(name))
		{
			stringBuilder.append(name).append(": ");
		}

		stringBuilder.append(Text.removeTags(message.getMessage()));
		notifier.notify(notification, stringBuilder.toString());
	}

	private String quoteAndIgnoreColor(String str)
	{
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); ++i)
		{
			char c = str.charAt(i);
			stringBuilder.append(Pattern.quote(String.valueOf(c)));
			stringBuilder.append("(?:<col=[^>]*?>)?");
		}

		return stringBuilder.toString();
	}

	private static String getLastColor(String str)
	{
		int colIdx = str.lastIndexOf("<col=");
		int colEndIdx = str.lastIndexOf("</col>");

		if (colEndIdx > colIdx)
		{
			return "<col" + ChatColorType.NORMAL + ">";
		}

		if (colIdx == -1)
		{
			return null;
		}

		int closeIdx = str.indexOf('>', colIdx);
		if (closeIdx == -1)
		{
			return null;
		}

		return str.substring(colIdx, closeIdx + 1);
	}

	@VisibleForTesting
	static String stripColor(String str)
	{
		return str.replaceAll("(<col=[0-9a-f]+>|</col>)", "");
	}
}
