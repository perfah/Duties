package me.th3pf.plugins.duties;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;

import me.th3pf.plugins.duties.tmp.YamlConfiguration;

public class Configuration
{
	private String cfgDefaultsFilePath;
	public YamlConfiguration yamlHandler;
	private LinkedHashMap<String, String> defaults;

	public Configuration(File cfgFile, String cfgDefaultsFilePath)
	{
		this.cfgDefaultsFilePath = cfgDefaultsFilePath;
		this.yamlHandler = new YamlConfiguration(cfgFile);
		this.defaults = getDefaults();
		
		Upgrade();
	}
	
	public Object GetValue(String node)
	{
		return this.yamlHandler.Get(node);
	}
	
	public void SetValue(String node, String value)
	{
		this.yamlHandler.Set(node, value);
	}
	
	public void Upgrade()
	{
		//header = ...version... info... unused
		
		for(int i = 0; i < this.defaults.size(); i++)
		{
			if (GetValue(this.defaults.get(i)).equals(""))
				SetValue(this.defaults.keySet().toArray()[i].toString(), this.defaults.entrySet().toArray()[i].toString());
			
		}
	}
	
	private LinkedHashMap<String, String> getDefaults()
	{
		LinkedHashMap<String, String> output = new LinkedHashMap<String, String>();
		
		File file; try
		{file = new File(new URI(this.getClass().getResource(this.cfgDefaultsFilePath).toString()));} catch (URISyntaxException e1){return null;}
		
		DataInputStream in; try
		{in = new DataInputStream(new FileInputStream(file));} catch (FileNotFoundException e1){return null;}
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(in));
    	
    	String strLine;
    	try
		{
			while ((strLine = br.readLine()) != null)
			{
				try
				{
					output.put(strLine.split(": ") [0], strLine.split(": ") [1]);
				} catch(Exception e){continue;}			
			}
		} catch (IOException e){return null;}
    	
    	return output;
	}
}
