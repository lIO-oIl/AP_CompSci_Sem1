import java.util.Scanner;

public class Ex03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[10];
		
		String print = "Your numbers are:\n";
		for(int i = 0; i < list.length; i++)
		{
			list[i] = 1 + (int)((Math.random()*101));
			print += list[i] + " ";
		}
		System.out.println(print + "\n");
		
		System.out.println(average(list));
	}
	
	public static double average(int[] list)
	{
		double total = 0;
		for(int number : list)
		{
			total += number;
		}
		
		double calc = total/list.length;
		return calc;
	}
}