import java.util.Scanner;

public class Ex04
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a word down: ");
		String word = input.next();
		
		int stop = word.length();
		int start = 0;
		
		System.out.println(tree(word, start, stop));
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start < stop)
		{
			System.out.printf("\n%"+ word.length() + "s", word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
		return "\n" + word;
	}
}