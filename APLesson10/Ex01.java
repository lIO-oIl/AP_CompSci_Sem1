import java.util.ArrayList;
import java.util.Arrays;

public class Ex01
{
	public static void main (String[]args)
	{
		
		Integer[] list = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> result = new ArrayList<>(Arrays.asList(list));
		
		for(Integer numbers : list)
		{
			if(findPrime(numbers))
				result.remove(numbers);
		}
		
		System.out.println(result);
	}
	
	public static boolean findPrime(int num)
	{
		int count = 0;
		for(int i = 1; i < num; i++)
		{
			if(num % i == 0)
				count += 1;
		}
		
		if (count > 2)
			return false;
		else
			return true;
	}
}