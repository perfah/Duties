package me.th3pf.plugins.duties.datacontainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class MemoryHandler 
{
	public String CfgFileStorage;
	UUID player;
	
	public MemoryHandler(String CfgFileStorage)
	{
		this.CfgFileStorage = CfgFileStorage;
		this.Memories = new HashMap<Integer, MemoryHandler.Memory>();
	}
	
	class Memory
	{	
		public Memory(UUID entityValueSource)
		{
			//if player not exist return; memory created
			importValues(entityValueSource); //Temp fix
			
			Serialize();
		}
		
		public void importValues(UUID entityID) {} //this.FireTicks = playerObject.FireTicks;
		
		public void exportValues(UUID entityID) {} //playerObject.FireTicks = thia.FireTicks;
		
		//Memory space field // >>Everything in here must be serializable<<
		
	  //FireTicks FireTicks; ...
		ArrayList<Object> etcData; 
		
		//End of memory spade field
		
		public void Serialize() {}//New thread
		public void Deserialize() {}
	}
	
	public HashMap<Integer, MemoryHandler.Memory> Memories;
	
	public void LoadMemory(Integer MemoryID) {}
	
	public void SaveMemoryAs(Integer MemoryID)
	{
		//Create & Serialize current memory of player as...
		this.Memories.put(MemoryID, new MemoryHandler.Memory(this.player));
	}
	
}
