package me.th3pf.plugins.duties.utils;

import java.util.ArrayList;

public class ChatFormattingUtility
{
	public static String ParseChatColors(String source){return null;} //temp
	
	public static void WriteList(int stream, ArrayList<String> list, int rowLimit, int page)
	{
		//rowLimit = 40;
			
		for(int i = page * rowLimit; i < i + rowLimit; i++)
		{
			if(i > list.size())break;
			
			//stream.write(lines.get(i));
		}
	}
}
