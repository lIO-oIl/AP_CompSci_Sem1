import java.util.Scanner;

public class Ex03{
	public static void main(String[]args)
	{
		Ex03 monitor = new Ex03();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your number?");
		int number = input.nextInt();
		int num = number;
		monitor.reverseNum(num, number);
	}
	
	public static void reverseNum(int num, int number)
	{
		int rev = 0;
		while (num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		
		System.out.println("The reverse of the digits in " + number + " is " + rev);
	}
}