import java.util.Scanner;

public class Ex05
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		String answer = "";
		
		System.out.println("Select your number: ");
		int num = input.nextInt();
		
		for(int i = 0; i <= num ; i++)
		{
			if(i % 2 == 0)
			{
				answer += i + " ";
			}
		}
		
		System.out.println(answer);
	}
}