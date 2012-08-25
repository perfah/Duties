package me.th3pf.plugins.duties;

import java.util.LinkedHashMap;
import java.util.UUID;

public abstract class PluginInstance
{
	public String Label;
	public LinkedHashMap<UUID, MemoryHandler> Memory;
}
