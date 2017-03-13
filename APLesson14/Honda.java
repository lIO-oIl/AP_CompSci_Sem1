public class Honda implements Location
{
	double[] location;
	int id;
	
	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] l)
	{
		location = l;
		id = (int) (Math.random() * 1000000) + 1;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double xCord, double yCord)
	{
		location[0] += xCord;
		location[1] += yCord;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}