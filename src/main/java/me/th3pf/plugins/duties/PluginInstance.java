package me.th3pf.plugins.duties;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import me.th3pf.plugins.duties.datacontainers.MemoryHandler;
import me.th3pf.plugins.duties.datacontainers.PlayerStatistics;

public class PluginInstance
{
	public static String Label;
	public static String Language;
	public static List<Configuration> Configuration;
	public static LinkedHashMap<UUID, MemoryHandler> Memory;
	public static LinkedHashMap<UUID, PlayerStatistics> Statistics;
	public static MessageHandler MessageHandler;
	
	public void newInstance()
	{
		Label = "Duties"; //temp
		Configuration.add(new Configuration(new File("%getDataFolder()%" + File.separator + "config.yml"), "/cfgdefaults/main"));
		
		Language = Configuration.get(0).GetValue("language").toString();
		
		Configuration.addAll (Arrays.asList(new Configuration[] {
			new Configuration(new File("%getDataFolder()%" + File.separator + "lang" + File.separator + Language), "/cgfdefaults/" + Language)
		}));
		
		Memory = new LinkedHashMap<UUID, MemoryHandler>(); 
		Statistics = new LinkedHashMap<UUID, PlayerStatistics>(); 
		MessageHandler = new MessageHandler(Configuration.get(1));
		
	}
}
