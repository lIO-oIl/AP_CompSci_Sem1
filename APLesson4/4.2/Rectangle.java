import java.util.Scanner;

public class Rectangle
{
	static double length;
	static double width;
	
	public static void main (String[]args)
	{
		Rectangle Class = new Rectangle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length?");
		length = input.nextDouble();
		
		System.out.println("What is your width?");
		width = input.nextDouble();
		
		print(Class.calcPerim());
	}
	
	public double calcPerim()
	{
		return (2 * length + 2 * width);
	}
	
	public static void print (double answer){
		
		System.out.printf("Your rectangle is %.3f%s", answer, " ft around");
	}
}