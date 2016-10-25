import java.util.Scanner;

public class Ex03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide a word: ");
		String word = input.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}