import java.util.Scanner;
import java.util.Random;

public class GameHealth
{
	static String[] health;
	static int healthLoad = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String turn = "";
		int damage = 0;
		int amount = 0; 
		healthCount = 6;
		health = new String[healthLoad];
		
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn, hit enter when READY!");
			turn = input.nextLine();
			damage = 1 + rand.nextInt(2);
			amount = 1 + rand.nextInt(6);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount -= amt;
			return "Taking " + amt + " damage.";
		}
		else
		{
			if(healthCount + amt < healthLoad)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = healthLoad;
			}
			return "Powered Up " + amt + "!";
		}
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i < healthLoad; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[] ";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}