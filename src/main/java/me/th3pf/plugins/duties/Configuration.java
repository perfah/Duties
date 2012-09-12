package me.th3pf.plugins.duties;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;

public class Configuration
{
	private Object yamlHandler;
	HashMap<String, HashMap<String, String>> defaults;

	public Configuration(File cfgFile)
	{
		defaults = new HashMap<String, HashMap<String, String>>();
		LoadDefaults();
		
		Upgrade();
		CollectData();
	}
	
	public Object getYamlHandler()
		{return this.yamlHandler;}
	
	public boolean LoadDefaults() //May or may not work
	{
	    try
	    {
	        for(File file : new File(new URI(this.getClass().getResource("cfgdefaults").toString())).listFiles())
	        {
	        	DataInputStream in = new DataInputStream(new FileInputStream(file));
	        	BufferedReader br = new BufferedReader(new InputStreamReader(in));
	        	
	        	HashMap<String, String> values = new HashMap<String, String>();
	        	
	        	String strLine;
	        	while ((strLine = br.readLine()) != null)
	        	{
	        		try
	        		{
	        			values.put(strLine.split(": ") [0], strLine.split(": ") [1]);
	        		} catch(Exception e){}
	        	}
	        		
	        	
	        	this.defaults.put(file.getName(), values);
	        	
	        	br.close();
	        	in.close();
	        	
	        	return true;
	        }
	    } catch (Exception e){} //Resources folder not found.
	    
	    return false; 
	}

	public void Upgrade()
	{
		for(int i = 0; i < this.defaults.size(); i++)
		{
			//if node not exists
				//SetNode(this.defaults.keySet().toArray()[i].toString(), this.defaults.entrySet().toArray()[i].toString());
			//Right type?
			
		}
	}
	
	public void CollectData(){}
}
