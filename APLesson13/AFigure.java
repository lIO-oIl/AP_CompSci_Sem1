public class AFigure extends Toy
{
	private static String name;
	private static int count;
	
	public AFigure()
	{
		name = "";
		count = 1;
	}
	
	public AFigure(String n)
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
		return "Action Figure";
	}
	
	public String toString()
	{
		return "Toy: " + name + " Amount: " + count;
	}
}