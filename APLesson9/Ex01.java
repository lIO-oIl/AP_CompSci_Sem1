import java.util.Scanner;

public class Ex01
{
	//Accepted by you. << Heads up comment
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] list = new String[5];
		
		System.out.println("Enter your five words");
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.printf("Enter word number #%d: ", i+1);
			list[i] = input.next();
		}
		
		System.out.println("In Order");
		
		for(String word : list)
		{
			System.out.print(word + " ");
		}
		
		System.out.println("\n\nReversed");
		
		for(String word : list)
		{
			System.out.print(reverse(word) + " ");
		}
	}
	
	public static String reverse(String word)
	{
		String reverse = "";
		
		for(int i = word.length()-1; i >= 0; i--)
		{
			reverse += word.charAt(i);
		}
		
		return reverse;
	}
}