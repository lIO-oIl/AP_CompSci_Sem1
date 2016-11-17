import java.util.Scanner;

public class Circle
{
	
	static double rad;
	
	public static void main (String[]args)
	{
		Circle Class = new Circle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your radius?");
		rad = input.nextDouble();
		
		print(Class.calcPerim());
		
	}
	
	public static double calcPerim()
	{
		return (3.14 * Math.pow(rad,2));
	}
	
	public static void print(double answer)
	{
		System.out.printf("The area of a circle with a radius of " + rad + " sides is %.5f",answer);
	}
}