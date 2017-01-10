import java.util.Scanner;

public class Runner_01
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_01 OOP = new OOP_01();
		
		System.out.println("Enter your distance");
		int d = input.nextInt(); 

		System.out.println("Enter your hours");
		int h = input.nextInt(); 
		
		System.out.println("Enter your minutes");
		int m = input.nextInt();
		
		OOP.setDistance(d);
		OOP.setHours(h);
		OOP.setMinutes(m);
		
		System.out.println("Your MPH during a " + d + " mile trip in the duration of " + h + " hours and " + m + " minutes is " + OOP.calcMPH(d, h, m));
	}
}