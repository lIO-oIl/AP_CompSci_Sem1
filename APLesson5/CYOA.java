import java.util.Scanner;
import java.util.Random;

public class CYOA {
	public static void main(String[]args)
	{
		CYOA manager = new CYOA();
		manager.runGame();
	}
	
	public static void runGame()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("You woke up in an abandoned mine. There are two corridors, left and right. Do you proceed left?");
		String c = input.next();
		if (c.equals("y"))
		{
			System.out.println("You see a hatchet. Do you pick it up?");
			c = input.next();	
			if (c.equals("y"))
			{
				System.out.println("There is a clank from behind you, and you realize the handle was a lever. It was a trap! As you jump to your side, you hear the whoosh of an axe from behind you. You were too late. A sickening crunch of your bones can be heard as your vision fades to black.");
				System.out.println("Dead End");	
			}
			else
			{
				System.out.println("You continue to move forward, and you realize you are back where you started...");
				runGame();
			}
		}
		else
		{
			System.out.println("You chose not to go left. Do you want to proceed right?");
			c = input.next();
			if (c.equals("y"))
			{
				System.out.println("You continue start moving right.");
				System.out.println("There seems like a figure to the left of you. Do you approach it?.");
				c = input.next();
				if (c.equals("y"))
				{
					System.out.println("It is a carcass... No, it is alive! You start to run.");
					System.out.println("Press ENTER to continue.");
					c = input.nextLine();
					c = input.nextLine();	
					System.out.println("You continue moving forward. There is a light from the distance. It is the exit! As you rush towards it, you hear the footsteps behind you. You turn around and catch the glimpse of the hideous smile of the distorted man");
					System.out.println("There is no Happy Ending");
				}
				else
				{
					System.out.println("You continue moving forward. There is a light from the distance. It is the exit! As you rush towards it, you hear the footsteps behind you. You turn around and catch the glimpse of the hideous smile of a distorted man");
					System.out.println("There is no Happy Ending");
				}
			}
			else
			{
				System.out.println("You will die if you continue staying still...");
				runGame();
			}
		}	
	}
}