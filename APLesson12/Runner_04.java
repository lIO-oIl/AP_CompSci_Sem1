import java.util.Scanner;

public class Runner_04
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_04 OOP = new OOP_04();
		
		OOP.setFace("Black", "Dark Brown", "Tan");
		System.out.println("Your info:" + "\nHair:\t" + OOP.getHair() + "\nEyes:\t" + OOP.getEyes() + "\nSkin:\t" + OOP.getSkin());
		
		System.out.println("\nEnter your friend's hair color");
		String h = input.nextLine();
	
		System.out.println("Enter your friend's eye color");
		String e = input.nextLine();

		System.out.println("Enter your friend's skin tone");
		String s = input.nextLine();
		
		OOP.setFace(h, e, s);
		System.out.println("\n\nYour friend's info:" + "\nHair:\t" + OOP.getHair() + "\nEyes:\t" + OOP.getEyes() + "\nSkin:\t" + OOP.getSkin());
	}
}