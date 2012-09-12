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
	
	private int pos;
	private Shift[] shifts;
	
	public int getPosition()
		{return this.pos;}
	
	public void setPosition(int position)
		{this.pos = position;}
	
	public void nextPosition()
		{this.pos++;}
	
	public void previousPosition()
		{this.pos--;}
	
	
	public Shift getShift()
		{return this.shifts[this.pos];}
	
	public void setShift(int ticks, int date)
		{this.shifts[this.pos] = new Shift(ticks, date);}
	
	public int getTicks()
		{return this.shifts[this.pos].ticks;}

	public void setTicks(int ticks)
		{this.shifts[this.pos].date = ticks;}
	
	
	public int getDate()
		{return this.shifts[this.pos].date;}
	
	public void setDate(int date)
		{this.shifts[this.pos].date = date;}
	
	
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
