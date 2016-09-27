import java.util.Scanner;

public class Ex_07
{
	public static void main (String[]args)
	{
		Ex_07 Class = new Ex_07();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your side length?");
		double side = input.nextDouble();
		
		double answer = Class.calcPerim(side);
		
		System.out.printf("The surface area of a cube with " + side + " sides is %.5f",answer);
	}
	
	public double calcPerim(double s)
	{
		return Math.pow(s,3);
	}
}