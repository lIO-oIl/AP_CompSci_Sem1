import java.util.Scanner;

public class Runner_02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_02 OOP = new OOP_02();
		
		System.out.println("Enter your first point's x (x,y)");
		int x1 = input.nextInt(); 

		System.out.println("Enter your first point's y (" + x1 + ",y)");
		int y1 = input.nextInt(); 
		
		System.out.println("Enter your second point's x (x,y)");
		int x2 = input.nextInt();
		
		System.out.println("Enter your second point's y (" + x2 + ",y)");
		int y2 = input.nextInt();
		
		OOP.setxOne(x1);
		OOP.setyOne(y1);
		OOP.setxTwo(x2);
		OOP.setyTwo(y2);
		
		System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")" + " is " + OOP.calcDistance(x1, y1, x2, y2));
	}
}