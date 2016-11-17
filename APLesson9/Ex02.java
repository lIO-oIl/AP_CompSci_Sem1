import java.util.Scanner;

public class Ex02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] list = new String[5];
		
		System.out.println("Enter your five words");
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.printf("Enter word number #%d: ", i+1);
			list[i] = input.next();
		}
		
		for(String word : list)
		{
			firstChar(word);
		}
	}
	
	public static void firstChar(String word)
	{
		System.out.println(word.charAt(0));
	}
}