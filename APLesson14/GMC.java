public class GMC implements Location
{
	double x,y;
	int id;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double xCord, double yCord)
	{
		x = xCord;
		y = yCord;
		id = (int) (Math.random() * 1000000) + 1;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double xCord, double yCord)
	{
		x += xCord;
		y += yCord;
	}
	
	public double[] getLoc()
	{
		double[] location = {x, y};
		return location;
	}
}