import java.lang.Math.*;

public class OOP_02
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public OOP_02()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	
	public OOP_02(int x1, int y1, int x2, int y2, double d)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = d;
	}
	
	public void setxOne(int x1)
	{
		xOne = x1;
	}
	
	public void setyOne(int y1)
	{
		yOne = y1;
	}
	
	public void setxTwo(int x2)
	{
		xTwo = x2;
	}
	
	public void setyTwo(int y2)
	{
		yTwo = y2;
	}
	
	public double calcDistance(int xOne, int yOne, int xTwo, int yTwo)
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}