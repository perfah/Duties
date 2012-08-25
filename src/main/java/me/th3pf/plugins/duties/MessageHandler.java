package me.th3pf.plugins.duties;

import java.io.File;
import java.util.ArrayList;

public class MessageHandler
{
	private ArrayList<String> strings;
	
	public MessageHandler(String stringsDirectory, String language, String fileExts)
	{
		Scan(stringsDirectory, language, fileExts);
	}
	
	/**
	 * Scans for strings in the specified language.
	 * @param directory The location of the folder 'strings'
	 * @param language The name of language container.
	 */
	public void Scan(String directory, String language, String fileExts)
	{
		if(!new File(directory + File.separator + language).exists())
		{
			//file extractor...?
		}
	}
	
	/**
	 * Get a specified string from the language files. 
	 * @param ID The ID of the specified message.
	 * @return
	 */
	public String getString(int ID)
	{
		return formatString(strings.get(ID));
	}
	
	private String formatString(String input)
	{
		return input
				.replaceAll("&0", "§0")
				.replaceAll("&1", "§1")
				.replaceAll("&2", "§2")
				.replaceAll("&3", "§3")
				.replaceAll("&4", "§4")
				.replaceAll("&5", "§5")
				.replaceAll("&6", "§6")
				.replaceAll("&7", "§7")
				.replaceAll("&8", "§8")
				.replaceAll("&9", "§9")
				.replaceAll("&a", "§a")
				.replaceAll("&b", "§b")
				.replaceAll("&c", "§c")
				.replaceAll("&d", "§d")
				.replaceAll("&e", "§e")
				.replaceAll("&f", "§f")
				.replaceAll("&k", "§k")
				.replaceAll("&l", "§l")
				.replaceAll("&m", "§m")
				.replaceAll("&n", "§n")
				.replaceAll("&o", "§o")
				.replaceAll("&r", "§p");
	}
}
