import java.util.Scanner;

public class Ex_04
{
	
	public static int length;
	public static int width;
	public static int height;
	
	public static void main(String[]args)
	{
		Ex_04 valueCall = new Ex_04();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length, in inches?");
		length = input.nextInt();
		
		System.out.println("What is your width, in inches?");
		width = input.nextInt();
		
		System.out.println("What is your height, in inches?");
		height = input.nextInt();
		
		double answer = valueCall.calcVol();
		System.out.println("Your box is " + answer + " cubic feet");
	}
	
	public double calcVol()
	{
		double fT3 = (length * width * height)/1728;
		return fT3;
	}
	
}