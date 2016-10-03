import java.util.Scanner;

public class Rectangle
{
	public static void main (String[]args)
	{
		Rectangle Class = new Rectangle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length?");
		double length = input.nextDouble();
		
		System.out.println("What is your width?");
		double width = input.nextDouble();
		
		print(Class.calcPerim(length, width));
	}
	
	public double calcPerim(double l, double w)
	{
		return (2 * l + 2 * w);
	}
	
	public static void print (double answer){
		
		System.out.printf("Your rectangle is %.3f%s", answer, " ft around");
	}
}