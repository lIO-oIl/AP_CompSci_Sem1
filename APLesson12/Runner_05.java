import java.util.Scanner;

public class Runner_05
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_05 profile = new OOP_05();
		
		System.out.println("What is your first name?");
		String first = input.next();
		System.out.println("What is your last name?");
		String last = input.next();
		System.out.println("Would you like an Avatar?");
		String choice = input.next();
		
		if(choice.equals("Y"))
		{
			System.out.println("What do you like your avatar to be called?");
			String ava = input.next();
			profile = new OOP_05(first, last, ava);
		}
		else
		{
			profile = new OOP_05(first, last);
		}
		
		System.out.println("\n" + profile);
	}
}