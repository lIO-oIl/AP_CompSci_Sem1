public class Car implements Location
{
	double[] location;
	int id;
	
	public Car()
	{
		location = new double[2];
		id = (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return id;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}