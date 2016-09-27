import java.util.Scanner;

public class Ex_06
{
	public static void main (String[]args)
	{
		Ex_06 Class = new Ex_06();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		double n1 = input.nextDouble();
		
		System.out.println("What is your second number?");
		double n2 = input.nextDouble();
		
		System.out.println("What is your third number?");
		double n3 = input.nextDouble();
		
		double answer = Class.calcAvg(n1, n2, n3);
		
		System.out.printf("The average of " + n1 + ", " + n2 + ", and " + n3 + " is " +"%.5f",answer);
	}
	
	public double calcAvg(double n1, double n2, double n3)
	{
		return (n1 + n2 + n3)/3;
	}
}