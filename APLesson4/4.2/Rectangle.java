import java.util.Scanner;

public class Rectangle
{
	static double length;
	static double width;
	static double answer;
	
	public static void main (String[]args)
	{
		Rectangle Class = new Rectangle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length?");
		length = input.nextDouble();
		
		System.out.println("What is your width?");
		width = input.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		answer = 2 * length + 2 * width;
	}
	
	public static void print ()
	{
		
		System.out.printf("Your rectangle is %.3f%s", answer, " ft around");
	}
}