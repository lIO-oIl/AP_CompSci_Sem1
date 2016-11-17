import java.util.Scanner;

public class Average
{
	static double n1;
	static double n2;
	static double n3;
	
	public static void main (String[]args)
	{
		Average Class = new Average();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		n1 = input.nextDouble();
		
		System.out.println("What is your second number?");
		n2 = input.nextDouble();
		
		System.out.println("What is your third number?");
		n3 = input.nextDouble();
		
		print(Class.calcAvg());
	}
	
	public double calcAvg()
	{
		return (n1 + n2 + n3)/3;
	}
	
	public static void print(double answer)
	{
		System.out.printf("The average of " + n1 + ", " + n2 + ", and " + n3 + " is " +"%.5f",answer);
	}
}