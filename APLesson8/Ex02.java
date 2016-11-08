import java.util.Scanner;

public class Ex02
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write your first word");
		String one = input.next();
		
		System.out.println("Write your second word");
		String two = input.next();
		
		
		System.out.println("Write your third word");
		String three = input.next();
		
		System.out.println(center(one) + "\n" + center(two) + "\n" + center(three));
	}
	
	public static String center(String word)
	{
		if(word.length() < 20)
		{
			return center(" " + word + " ");
		}
		
		return word;
	}
}