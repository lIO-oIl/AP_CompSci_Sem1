import java.util.Scanner;

public class Ex01
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a phrase down");
		String phrase = input.nextLine();
		
		System.out.println(checkUnderscores(phrase, 0));
	}
	
	public static String checkUnderscores(String phrase, int num)
	{
		if (num < phrase.length())
		{
			num += 1;
			if(phrase.indexOf(" ") == 0)
			{
				return phrase;
			}
			else
			{
				if(phrase.indexOf(" ") > 0)
				{
					return checkUnderscores(phrase.substring(0, phrase.indexOf(" ")) + "_" + phrase.substring(phrase.indexOf(" ")+1, phrase.length()), 0);
				}
			}
		}
		
		return phrase;
	}
}