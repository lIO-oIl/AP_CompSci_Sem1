public class Ex_05
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		
		System.out.println("For the following numbers" + printArray() + "\nThe numbers" + getOdds() + " are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static String printArray()
	{
		String output = "";
		for(int i = 0; i < numbers.length; i++)
		{
			output += " " + numbers[i];
		}
		return output;
	}
	
	public static String getOdds()
	{
		String output = "";
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] % 2 == 1)
			{
				output += " " + numbers[i];
			}
		}
		return output;
	}
}