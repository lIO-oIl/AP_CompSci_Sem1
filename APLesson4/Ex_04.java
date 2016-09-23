import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 valueCall = new Ex_04();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length, in inches?");
		int length = input.nextInt();
		
		System.out.println("What is your width, in inches?");
		int width = input.nextInt();
		
		System.out.println("What is your height, in inches?");
		int height = input.nextInt();
		
		double answer = valueCall.calcVol(length, width, height);
		System.out.println("Your box is " + answer + " cubic feet");
	}
	
	public double calcVol(int l, int w, int h)
	{
		double fT3 = (l * w * h)/1728;
		return fT3;
	}
	
}