import java.util.Scanner;

public class Ex04{
	public static void main(String[]args)
	{
		Ex04 monitor = new Ex04();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your phrase?");
		String sentence = input.nextLine();
		monitor.replaceA(sentence);
	}
	
	public static void replaceA(String sentence)
	{
		while (sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a")+1, sentence.length());
		}
		
		System.out.println(sentence);
	}
}