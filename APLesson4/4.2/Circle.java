import java.util.Scanner;

public class Circle
{
	static double rad;
	static double answer;
	
	public static void main (String[]args)
	{
		Circle Class = new Circle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your radius?");
		rad = input.nextDouble();
		
		print();
		
	}
	
	public static void calcPerim()
	{
		answer = (3.14 * Math.pow(rad,2));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + rad + " sides is %.5f",answer);
	}
}