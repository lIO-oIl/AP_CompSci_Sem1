import java.util.Scanner;

public class Ex_07
{
	static String[] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		
		System.out.println("For the following words" + printArray() + "\nThe words" + hasZ() + " have Z's");
	}
	
	public static void fillArray()
	{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++)
		{
			System.out.println("Enter word #" + (i + 1));
			words[i] = input.next();
		}
	}
	
	public static String printArray()
	{
		String output = "";
		for(int i = 0; i < words.length; i++)
		{
			output += " " + words[i];
		}
		return output;
	}
	
	public static String hasZ()
	{
		String output = "";
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].indexOf("z") >= 0 || words[i].indexOf("Z") >= 0 )
			{
				output += " " + words[i];
			}
		}
		return output;
	}
}