package me.th3pf.plugins.duties;

public class Duties extends PluginInstance
{	
	@Override
	public void onEnable()
	{
		this.setup();
		// ...
	}
	
	@Override
	public void onDisable()
	{
		// ...
		this.free();
	}
}