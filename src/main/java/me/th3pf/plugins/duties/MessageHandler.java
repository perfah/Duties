package me.th3pf.plugins.duties;

import me.th3pf.plugins.duties.utils.ChatFormattingUtility;

public class MessageHandler
{
	private String[] strings;
	private String[] envVariables;
	
	public MessageHandler(Configuration configuration, String[] envVariables)
	{
		this.strings = (String[]) configuration.GetValue("Strings");
		this.envVariables = envVariables;
	}
	
	/**
	 * Get a specified string from the language files. 
	 * @param ID The ID of the requested message.
	 * @param variables Insert optional variables in to message. Using the slots 0-9 is recommended.
	 * @return the requested string
	 */
	public String getString(int ID, String[] variables)
	{
		String output = this.strings[ID];
		
		for(int i = 0; i < this.envVariables.length; i++)
			variables[variables.length + 1] = envVariables[i];
		
		for(int i = 0; i < variables.length; i++)
			output.replaceAll("%" + i, variables[i]);
		
		return ChatFormattingUtility.ParseChatColors(output); //return output.replaceAll("m/0x[0-9a-f]+/", arg1)
	}
}
