package me.th3pf.plugins.duties;

import java.io.File;
import java.util.ArrayList;

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
	public void CollectStrings(String directory, String language)
	{
		if(!new File(directory + File.separator + language).exists())
		{
			
		}
	}
	
	/**
	 * Get a specified string from the language files. 
	 * @param ID The ID of the specified message.
	 * @return
	 */
	public String getString(int ID)
	{
		return strings.get(ID); //parseChatColors
	}
}
