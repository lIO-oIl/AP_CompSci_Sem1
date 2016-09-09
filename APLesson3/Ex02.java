import java.util.Scanner;

public class Ex02 {
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWhat is your weight, in pounds?");
		int weight = keyboard.nextInt();
		
		System.out.println("\nWhat is your height, in feet?");
		int height = keyboard.nextInt();
		
		double BMI = weight*703/(height*12)^2;
		
		System.out.println("\nYour BMI is: " + BMI);
	}
}