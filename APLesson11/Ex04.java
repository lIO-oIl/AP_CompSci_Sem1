import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex04{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int[][] nums = new int[2][2];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = random.nextInt(100) + 1;
				System.out.println(nums[i][j] + "\t");
			}
		}
		
		System.out.println("Enter your divisor: ");
		int divide = input.nextInt();
		
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divide == 0)
					count += 1;
			}
		}
		
		System.out.println(count + " numbers are divisible by " + divide);
	}
}