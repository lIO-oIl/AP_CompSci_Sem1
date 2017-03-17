public class Toyota extends Car
{
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String loc)
	{
		location = new double[2];
		
		location[0] = Double.parseDouble(loc.substring(0, loc.indexOf(", ")));
		location[1] = Double.parseDouble(loc.substring(loc.indexOf(", ") + 2));
	}
}