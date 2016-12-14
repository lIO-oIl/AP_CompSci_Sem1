import java.util.Scanner;

public class Ex05
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		String answer = "";
		
		System.out.println("Select your start number: ");
		int start = input.nextInt();
		
		System.out.println("Select your end number: ");
		int num = input.nextInt();
		
		for(int i = start; i <= num ; i++)
		{
			if(i % 2 == 0)
			{
				answer += i + " ";
			}
		}
		
		System.out.println(answer);
	}
}