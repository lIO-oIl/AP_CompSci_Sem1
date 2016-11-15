import java.util.Scanner;

public class Ex03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide a number: ");
		int num = input.nextInt();
		System.out.println(run(num));
	}
	
	public static int run(int n)
	{
		if (n > 0)
		{
			if(n % 10 == 7)
			{
				return 1 + run(n/10);
			}
			else
			{
				return 0 + run(n/10);
			}
		}
		
		return n;
	}
}
