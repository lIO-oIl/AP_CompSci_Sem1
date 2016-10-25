import java.util.Scanner;

public class Ex07
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select your word: ");
		String word = input.next();
		
		int len = word.length();
		
		for(int i = (len-1); i > 0; i--)
		{
			System.out.println(word.substring(i, len));
		}
	}
}