package me.th3pf.plugins.duties;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.UUID;

import me.th3pf.plugins.duties.datacontainers.MemoryHandler;
import me.th3pf.plugins.duties.datacontainers.PlayerStatistics;

public class PluginInstance
{
	public static String Label;
	public static LinkedHashMap<UUID, MemoryHandler> Memory;
	public static LinkedHashMap<UUID, PlayerStatistics> Statistics;
	public static MessageHandler MessageHandler;
	
	public void newInstance()
	{
		Label = "Duties"; //temp
		Memory = new LinkedHashMap<UUID, MemoryHandler>();
		Statistics = new LinkedHashMap<UUID, PlayerStatistics>();
		MessageHandler = new MessageHandler("getDataFolder()" + File.separator + "lang", "English"); //temp
		
	}
}
