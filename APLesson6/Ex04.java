import java.util.Scanner;

public class Ex04
{
	public static void main(String[]args)
	{
		Ex04 monitor = new Ex04();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide your multiplier: ");
		double mult = input.nextDouble();
		
		System.out.println("Provide the size of your table: ");
		double size = input.nextDouble();
		
		System.out.printf("%2s%6s%6s", "x", "|", "y");
		System.out.println("\n---------------");
		
		for(double i = 1; i <= size; i++)
		{
			double result = i * mult;
			monitor.format(i, result);
			result = i;
		}
	}
	
	public static void format(double one, double two)
	{
		System.out.printf("%2.0f%6s%6.0f\n", one, "|", two);
	}
}