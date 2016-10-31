import java.util.Scanner;

public class Ex01{
	public static void main(String[]args)
	{
		Ex01 monitor = new Ex01();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your number?");
		int number = input.nextInt();
		int num = number;
		monitor.sumDigits(num, number);
	}
	
	public static void sumDigits(int num, int number)
	{
		int sum = 0;
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}