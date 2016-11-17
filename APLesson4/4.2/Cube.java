import java.util.Scanner;

public class Cube
{
	static double side;
	
	public static void main (String[]args)
	{
		Cube Class = new Cube();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your side length?");
		side = input.nextDouble();
		
		print(Class.calcPerim());
		
	}
	
	public double calcPerim()
	{
		return Math.pow(side,2)*6;
	}
	
	public static void print(double answer)
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %.5f",answer);
	}
}