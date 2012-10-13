package me.th3pf.plugins.duties;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import me.th3pf.plugins.duties.datacontainers.MemoryHandler;
import me.th3pf.plugins.duties.datacontainers.PlayerStatistics;
import me.th3pf.plugins.duties.tmp.JavaPlugin;

public class PluginInstance extends JavaPlugin
{
	public static String Label;
	public static String Language;
	public static List<Configuration> Configuration;
	public static LinkedHashMap<UUID, MemoryHandler> Memory;
	public static LinkedHashMap<UUID, PlayerStatistics> Statistics;
	public static MessageHandler MessageHandler;
	
	protected void setup()
	{
		Label = "Duties"; //temp
		Configuration.add(new Configuration(new File(getDataFolder().getAbsolutePath() + File.separator + "config.yml"), "/cfgdefaults/main"));
		
		Language = Configuration.get(0).GetValue("language").toString();
		
		Configuration.addAll (Arrays.asList(new Configuration[] {
			new Configuration(new File(getDataFolder().getAbsolutePath() + File.separator + "lang" + File.separator + Language), File.separator + "cgfdefaults" + File.separator + Language)
		}));
		
		Memory = new LinkedHashMap<UUID, MemoryHandler>(); 
		Statistics = new LinkedHashMap<UUID, PlayerStatistics>(); 
		MessageHandler = new MessageHandler(Configuration.get(1), new String[] {
			Label,
			Language,
			System.getProperty("line.separator")
		});
		
	}
	
	protected void free()
	{
		Label = "";
		Language = "";
		Configuration.clear();
		Memory.clear();
		Statistics.clear();
		MessageHandler = null;
	}
}
