import java.util.Scanner;

public class Cube
{
	public static void main (String[]args)
	{
		Cube Class = new Cube();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your side length?");
		double side = input.nextDouble();
		
		print(Class.calcPerim(side), side);
		
	}
	
	public double calcPerim(double s)
	{
		return Math.pow(s,2)*6;
	}
	
	public static void print(double answer, double side)
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %.5f",answer);
	}
}