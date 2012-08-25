package me.th3pf.plugins.duties;

import java.util.ArrayList;

public class MessageHandler
{
	private int language;
	private ArrayList<ArrayList<String>> messages;
	
	public MessageHandler(String langLocation)
	{
		Scan(langLocation);
	}
	
	public void Scan(String langLocation)
	{
		
	}
	
	public String getMessage(int ID)
	{
		return filterMessage(messages.get(this.language).get(ID));
	}
	
	public int SetLanguage()
	{
		return this.language;
	}
	public void SetLanguage(int language)
	{
		this.language = language;
	}
	
	private String filterMessage(String input)
	{
		return input
				.replaceAll("&1", "white");
	}
}
