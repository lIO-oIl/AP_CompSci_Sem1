import java.util.Scanner;

public class Ex04_ripCode
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your starting number");
		int start = input.nextInt();
		
		System.out.println("Please enter the size of your sequence");
		int size = input.nextInt();
		
		int[] list = new int[size+1];
			
		list[0] = 0;
		list[1] = start;
		
		fibonacci(list, size);
	}
	
	public static void fibonacci(int[] list, int size)
	{
		String result = "" + list[1];
		for(int i = 1; i < size; i++)
		{
			int num = list[i-1] + list[i];
			list[1+i] = num;
			result += ", " + num;
		}
		System.out.println(result);
	}
}