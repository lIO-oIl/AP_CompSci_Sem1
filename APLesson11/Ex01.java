import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Ex01{
	public static void main(String[]args)
	{
		Random random = new Random();
		
		int[][] nums = new int[2][2];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = random.nextInt(10);
			}
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}