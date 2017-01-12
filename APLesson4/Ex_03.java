import java.util.Scanner;
public class Ex_03
{
	public static double p;
	public static double r;
	public static double n;
	public static double t;
	
	public static void main(String[]args)
	{
		Ex_03 valueRet = new Ex_03();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your Principal?");
		p = input.nextDouble();
		
		System.out.println("What is your rate, in percent?");
		r = input.nextDouble()/100;
		
		System.out.println("How many times is this compounded, in a year?");
		n = input.nextDouble();
		
		System.out.println("What is the duration of this loan?");
		t = input.nextDouble();
		
		double month = valueRet.calculateMn();
		double amount = valueRet.calculateAmt();
		
		System.out.printf("Your average monthly pay is %.2f", month);
		System.out.printf("\nYour total amount is %.2f", amount);
	}
	
	public double calculateMn()
	{
		return (p * Math.pow((1+r/n),(n*t)) - p)/ 12 / t;
	}
	
	public double calculateAmt()
	{
		return p * Math.pow((1+r/n),(n*t));
	}
	
}
