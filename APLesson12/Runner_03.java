import java.util.Scanner;

public class Runner_03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_03 OOP = new OOP_03();
		
		System.out.println("What paint do you want?");
		String pt = input.nextLine();		
		
		System.out.println("What interior do you want?");
		String in = input.nextLine();		
		
		System.out.println("What engine do you want?");
		String eg = input.nextLine();		
		
		System.out.println("What tires do you want?");
		String tr = input.nextLine();
		
		OOP.setCustom(pt, in, eg, tr);
		
		System.out.println("\n\nYour vehicle is ready..." + "\nPaint:\t" + OOP.getPaint() + "\nInterior:\t" + OOP.getInterior() + "\nEngine:\t" + OOP.getEngine() + "\nTires:\t" + OOP.getTires());
	}
}