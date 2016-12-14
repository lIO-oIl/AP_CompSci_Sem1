import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02{
	public static void main(String[]args)
	{	
		Scanner input = new Scanner(System.in);
		String[][] words = new String[2][2];
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.println("Enter your word:");
				words[i][j] = input.next();
			}
		}
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.println(words[i][j] + "\n");
			}
		}
	}
}