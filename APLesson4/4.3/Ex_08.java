import java.util.Scanner;

public class Ex_08
{
	public static void main (String[]args)
	{
		Ex_08 Class = new Ex_08();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your radius?");
		double rad = input.nextDouble();
		
		double answer = Class.calcPerim(rad);
		
		System.out.printf("The area of a circle with a radius of " + rad + " sides is %.5f",answer);
	}
	
	public static double calcPerim(double r)
	{
		return (3.14 * Math.pow(r,2));
	}
}