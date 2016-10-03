import java.util.Scanner;

public class Ex_05
{
	public static void main (String[]args)
	{
		Ex_05 Class = new Ex_05();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length?");
		double length = input.nextDouble();
		
		System.out.println("What is your width?");
		double width = input.nextDouble();
		
		double answer = Class.calcPerim(length, width);
		
		System.out.printf("Your rectangle is %.3f%s", answer, " ft around");
	}
	
	public double calcPerim(double l, double w)
	{
		return (2 * l + 2 * w);
	}
}