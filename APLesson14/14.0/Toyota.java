public class Toyota implements Location
{
	double[] location;
	int id;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String loc)
	{
		location = new double[2];
		
		location[0] = Double.parseDouble(loc.substring(0, loc.indexOf(", ")));
		location[1] = Double.parseDouble(loc.substring(loc.indexOf(", ") + 2));
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