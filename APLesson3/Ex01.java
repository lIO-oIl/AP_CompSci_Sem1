import java.util.Scanner;

public class Ex01 {
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + ". Hmmm. Sounds like a name I'd give to my dog, if dogs existed in virtual reality.");
		
		System.out.println("\nHow old are you?");
		int age = keyboard.nextInt();	
		System.out.println("You're only " + age + "? Well, I guess it explains your intelligence level.");
		String fill = keyboard.nextLine();

		System.out.println("\nWhat do you do for fun?");
		String hobby = keyboard.nextLine();
		System.out.println(hobby + " is positively the most boring thing I ever heard of. You're wasting your life.");

		System.out.println("\nWhat kind of music you like?");
		String music = keyboard.nextLine();
		System.out.println("What? " + music + " sounds like farting babies in a mental asylum.");
		
		System.out.println("\nHow many siblings you have?");
		int num = keyboard.nextInt();
		System.out.println(num + ". That means you have more siblings than your IQ level.");
		String fill2 = keyboard.nextLine();
		
		System.out.println("\nWhat do you want to be once you grow up?");
		String dream = keyboard.nextLine();
		System.out.println("You know, I heard that " + dream + " would go broke soon... Oh wait, that's just you.");
		
		System.out.println("\n\nOk, so your name is " + name + " and you are " + age +". You like to " + hobby + " and listen to " + music + ". You have " + num + " siblings, and you intend to become " + dream + ".\nThank you for your personal information. I will now proceed to track your IP and home address...");
	}
}