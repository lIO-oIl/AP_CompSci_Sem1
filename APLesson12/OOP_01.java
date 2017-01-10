import java.lang.Math.*;

public class OOP_01
{
	private int distance, hours, minutes;
	private double mph;
	
	public OOP_01()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	
	public OOP_01(int d, int h, int m, double r)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = r;
	}
	
	public void setDistance(int d)
	{
		distance = d;
	}
	
	public void setHours(int h)
	{
		hours = h;
	}
	
	public void setMinutes(int m)
	{
		minutes = m;
	}
	
	public double calcMPH(int distance, int hours, int minutes)
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}