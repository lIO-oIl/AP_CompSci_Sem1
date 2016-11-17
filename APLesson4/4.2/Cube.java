import java.util.Scanner;

public class Cube
{
	static double side;
	static double answer;
	
	public static void main (String[]args)
	{
		Cube Class = new Cube();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your side length?");
		side = input.nextDouble();
		
		print();
		
	}
	
	public static void calcPerim()
	{
		answer = Math.pow(side,2)*6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %.5f",answer);
	}
}