package me.th3pf.plugins.duties.datacontainers;

import java.util.ArrayList;

public class PlayerStatistics
{
	class Shift
	{
		public int ticks;
		public int date; //Date format: 120909
		
		public Shift(int ticks, int date)
		{	
			this.ticks = ticks;
			this.date = date;
		}
	}
	private Shift[] shifts;
	
	public Shift getShift(int pos)
		{return this.shifts[pos];}
	
	public void setShift(int pos, int ticks, int date)
		{this.shifts[pos] = new Shift(ticks, date);}
	
	public void addShift(int ticks, int date)
		{this.shifts[this.shifts.length] = new Shift(ticks, date);}
	
	
	public ArrayList<Integer> matchDate(int date)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int pos = 0; pos < shifts.length; pos++)
		{
			if(this.shifts[pos].date == date)
				output.add(pos);
		}
		
		return output;
	}
	
	public ArrayList<Integer> matchTicks(int ticks)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int pos = 0; pos < shifts.length; pos++)
		{
			if(this.shifts[pos].ticks == ticks)
				output.add(pos);
		}
		
		return output;
	}
}
