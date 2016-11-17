import java.util.Scanner;

public class Ex04
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your starting number");
		int start = input.nextInt();
		
		System.out.println("Please enter the size of your sequence");
		int size = input.nextInt();
		
		int[] list = new int[size];
		
		fibonacci(list, start, size);
	}
	
	public static void fibonacci(int[] list, int start, int size)
	{
		String result = "";
		for(int i = 0; i < size; i++)
		{
			if(i == 0 || i == 1)
			{
				list[i] = start;
			}
			else
			{
				list[i] = list[i-2] + list[i-1];
			}
			
			result += list[i] + " ";
		}
		System.out.println(result);
	}
}