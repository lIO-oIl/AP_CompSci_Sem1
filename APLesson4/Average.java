import java.util.Scanner;

public class Average
{
	public static void main (String[]args)
	{
		Average Class = new Average();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		double n1 = input.nextDouble();
		
		System.out.println("What is your second number?");
		double n2 = input.nextDouble();
		
		System.out.println("What is your third number?");
		double n3 = input.nextDouble();
		
		print(Class.calcAvg(n1, n2, n3), n1, n2, n3);
	}
	
	public double calcAvg(double n1, double n2, double n3)
	{
		return (n1 + n2 + n3)/3;
	}
	
	public static void print(double answer, double n1, double n2, double n3)
	{
		System.out.printf("The average of " + n1 + ", " + n2 + ", and " + n3 + " is " +"%.5f",answer);
	}
}