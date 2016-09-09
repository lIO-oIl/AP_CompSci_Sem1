import java.util.Scanner;

public class Ex03 {
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Provide your primary number: ");
		int num1 = keyboard.nextInt();
		System.out.println("Provide your secondary number: ");
		int num2 = keyboard.nextInt();
		
		int add = num1+num2;
		int sub = num1-num2;
		int mult = num1*num2;
		float div = num1/num2;
		int rem = num1%num2;
		int exp = num1^num2;		
		
		System.out.println("Addition: " + add + "\nSubtraction: " + sub + "\nMultiplication: " + mult + "\nDivision: ~" + div + "\nRemainder: " + rem + "\nExponent: " + exp);
	}
}