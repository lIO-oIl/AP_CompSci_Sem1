public class Ex08
{
	public static void main(String[]args)
	{
		Ex08 monitor = new Ex08();
		
		monitor.format("Na", 4);
		monitor.format("Na", 4);
		monitor.format("Hey", 3);
		monitor.format("Goodbye", 1);
	}
	
	public static void format(String word, int repeat)
	{
		String phrase = "";
		
		for(int i = 0; i < repeat; i++)
		{
			phrase += word + " ";
		}
		
		System.out.println(phrase);
	}
}