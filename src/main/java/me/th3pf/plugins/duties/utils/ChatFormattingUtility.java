package me.th3pf.plugins.duties.utils;

import java.util.ArrayList;

public class ChatFormattingUtility
{
	public static String ParseChatColors(String source){return null;} //temp
	
	public static String GetPageOfList(ArrayList<String> list, int page)
	{
		String output = "";
		Integer rowLimit = 40;
			
		for(int i = page * rowLimit; i < i + rowLimit; i++)
		{	
			output += list.get(i);
			
			if(i < list.size())
				output += System.getProperty("line.separator");
			else break;
		}
		
		return output;
	}
}
