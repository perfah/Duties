package me.th3pf.plugins.duties;

import java.io.File;
import java.util.ArrayList;

import me.th3pf.plugins.duties.utils.ChatFormattingUtility;

public class MessageHandler
{
	private ArrayList<String> strings;
	
	public MessageHandler(String stringsDirectory, String language)
	{
		CollectStrings(stringsDirectory, language);
	}
	
	/**
	 * Searches for strings in the specified language located in a specified directory.
	 * @param directory The location of the directory containing strings.
	 * @param language The language the strings should be in.
	 */
	@SuppressWarnings("unchecked")
	public void CollectStrings(String directory, String language)
	{
		if(!new File(directory + File.separator + language).exists())
		{
			//Turn to defaults
		}
		
		this.strings = ((ArrayList<String>)Duties.Configuration.get(1).GetValue("Strings"));
	}
	
	/**
	 * Get a specified string from the language files. 
	 * @param ID The ID of the specified message.
	 * @return
	 */
	public String getString(int ID, String[] variables)
	{
		String output = this.strings.get(ID);
		
		variables[variables.length + 1] = Duties.Label;
		variables[variables.length + 1] = System.getProperty("line.separator");
		
		for(int i = 0; i < variables.length; i++)
			output.replaceAll("%" + i, variables[i]);
		
		return ChatFormattingUtility.ParseChatColors(output);
	}
}
