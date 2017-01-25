public class OOP_05
{
	private String first, last, avatar;
	private int id;
	
	public OOP_05()
	{
		first = "";
		last = "";
		avatar = "";
		id = 0;
	}
	
	public OOP_05(String f, String l, String ava)
	{
		first = f;
		last = l;
		avatar = ava;
		id = (int)(Math.random() * 1000000) + 1;
	}
	
	public OOP_05(String f, String l)
	{
		first = f;
		last = l;
		avatar = "Unidentified";
		id = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "First name: " + first + "\nLast Name:\t\t" + last + "\nAvatar:\t\t" + avatar + "\nUser ID:\t\t" + id;
	}
}