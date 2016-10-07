import java.util.Random;

public class Ex01
{
	public static void main(String[]args)
	{
		Ex01 Dice = new Ex01();
		Random rand = new Random();
		
		int player = 1 + rand.nextInt(6);
		int computer = 1 + rand.nextInt(6);
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + Dice.rollDice(player, computer));
	}
	
	public static String rollDice(int p, int c)
	{
		String winner = "";
		
		boolean result = p>c;
		
		if(result == true)
		{
			winner = "Player";
		}
		
		else
		{
			winner = "Computer";
		}
		
		return winner;
	}
}