package me.th3pf.plugins.duties;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MemoryHandler 
{
	UUID player;
	
	class Memory
	{
		UUID owner;
		
		public Memory(String memory, UUID ofPlayer)
		{
			this.owner = ofPlayer;
			
			//if player not exist return; memory created
			importFromPlayer(ofPlayer.toString()); //Temp fix
			
			Serialize(new File("saveFile"));
		}
		
		private void importFromPlayer(String playerObject)
		{
			//this.i = playerObject.FireTicks;
		}
		
		public void exportToPlayer(String playerObject)
		{
			//playerObject.FireTicks = thia.i;
			
			
		}
		
		//Memory space field
		int i = 0; //Data
		Object[] otherData; //Must be serializible
		//End of memory spade field
		
		public void Serialize(File file) {}//New thread
		public void Deserialize(File file) {}
	}
	
	public List<Memory> Memories = new ArrayList<Memory>();
	
	public void LoadMemory(int ID)
	{
		
	}
	
	public void SaveMemoryAs(String memoryName)
	{
		//Create & Serialize current memory of player as...
		//this.Memories.add(new Memory(memoryName, MemoryHandler.this.player));
	}
	
	public void SaveMemoryAs(int ID)
	{
		//Create & Serialize current memory of player as...
		//this.Memories.set(ID, new Memory(this.Memories.get(ID).owner, MemoryHandler.this.player));
	}
	
}
