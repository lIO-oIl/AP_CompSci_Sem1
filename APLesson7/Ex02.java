import java.util.Scanner;

public class Ex02{
	public static void main(String[]args)
	{
		Ex02 monitor = new Ex02();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your number?");
		int number = input.nextInt();
		int num = number;
		monitor.addDigits(num, number);
	}
	
	public static void addDigits(int num, int number)
	{
		int digits = 0;
		int sum = 0;
		while (num > 0)
		{
			digits += 1;
			sum += num % 10;
			num /= 10;
		}
		
		double average = sum/digits;
		
		System.out.println("The average of the digits in " + number + " is " + average);
	}
}