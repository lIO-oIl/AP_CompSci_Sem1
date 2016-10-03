import java.util.Scanner;

public class Circle
{
	public static void main (String[]args)
	{
		Circle Class = new Circle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your radius?");
		double rad = input.nextDouble();
		
		print(Class.calcPerim(rad), rad);
		
	}
	
	public static double calcPerim(double r)
	{
		return (3.14 * Math.pow(r,2));
	}
	
	public static void print(double answer, double rad)
	{
		System.out.printf("The area of a circle with a radius of " + rad + " sides is %.5f",answer);
	}
}