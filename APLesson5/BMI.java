import java.util.Scanner;

public class BMI {
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWhat is your weight, in pounds?");
		int weight = keyboard.nextInt();
		
		System.out.println("\nWhat is your height, in feet?");
		int height = keyboard.nextInt();
		
		double BMI = weight*703/Math.pow((height*12),2);
		
		System.out.println("\nYour BMI is: " + BMI);
		System.out.println("You are " + condition(BMI));
	}
	
	public static String condition(double n)
	{
		if (n <= 18.5)
		{
			return "Underweight";
		}
		if (18.5 < n && n < 24.9)
		{
			return "Normal";
		}
		if (25 < n && n < 29.9)
		{
			return "Overweight";
		}
		if (30 < n && n < 34.9)
		{
			return "Obese";
		}
		if (35 < n && n < 39.9)
		{
			return "Very Obese";
		}
		else
		{
			return "Morbidly Obese";
		}
	}
}