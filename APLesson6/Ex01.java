import java.util.Scanner;

public class Ex01
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide your word: ");
		String str = input.next();
		
		for(int i = 1; i <= str.length(); i++)
		{
			System.out.println(str);
		}
	}
}