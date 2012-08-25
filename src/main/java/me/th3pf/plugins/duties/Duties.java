package me.th3pf.plugins.duties;

import java.util.UUID;
import java.util.LinkedHashMap;

public class Duties
{
	
	//Management of the instance
	private PluginInstance instance;
	
	/**
	 * Get the runtime instance of Duties.
	 */
	public PluginInstance getInstance()
		{return this.instance;}
	
	/**
	 * Get the memory of all users and their cache.
	 */
	public LinkedHashMap<UUID, MemoryHandler> getMemory()
		{return this.instance.Memory;}
	
	private Duties()
	{
		this.instance.Label = "Duties";
		this.instance.Memory = new LinkedHashMap<UUID, MemoryHandler>();
	}
	
	
}