package me.th3pf.plugins.duties;

import java.util.LinkedHashMap;
import java.util.UUID;

public class Duties
{
	//Management of the instance
	private PluginInstance instance;
	
	public PluginInstance getInstancee()
		{return this.instance;}
		
	public LinkedHashMap<UUID, MemoryHandler> getMemory()
		{return this.instance.Memory;}
	
	private Duties()
	{
		this.instance.Label = "Duties";
		this.instance.Memory = new LinkedHashMap<UUID, MemoryHandler>();
	}
	
	
}