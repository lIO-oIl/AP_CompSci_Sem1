public abstract class Toy
{
	private static String name;
	private static int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy (String n)
	{
		name = n;
		count = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public static void setName(String n)
	{
		name = n;
	}
	
	public static void setCount(int c)
	{
		count = c;
	}
	
	public String getType()
	{
		return "";
	}
	
	public String toString()
	{
		return "Toy: " + name + " Amount: " + count;
	}
}
