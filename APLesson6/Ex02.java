import java.util.Scanner;

public class Ex02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();

		int result = 1;
		for(int i = 1; i <= num; i++)
		{
			result *= i;
		}
		
		System.out.println(result);
	}
}