package me.th3pf.plugins.duties;

import java.util.ArrayList;

public class TempPlaceHolder
{
	public void WriteHelp(int page)
	{
		int max = 40;
		ArrayList<String> lines = new ArrayList<String>();
		
		lines.add("dutymode toggle <parms... - Toggle dutymode>");
		lines.add("dutymode enable/on <parms... - Toggle dutymode>");
		
		for(int i = page * max; i < i + max; i++)
		{
			if(i > lines.size())break;
			
			//write(lines.get(i));
		}
	}
}
