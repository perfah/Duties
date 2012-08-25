package me.th3pf.plugins.duties;

import java.util.LinkedHashMap;
import java.util.UUID;

public class Duties
{
	//Management of the instance
	private DutiesImpl impl;
		public Duties getInstance()
			{return this.impl.Instance;}

	public LinkedHashMap<UUID, MemoryHandler> getMemory()
	{return this.impl.Memory;}
}
