import java.util.Scanner;
public class Ex_03
{
	
	public static void main(String[]args)
	{
		Ex_03 valueRet = new Ex_03();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your Principal?");
		double p = input.nextDouble();
		
		System.out.println("What is your rate, in percent?");
		double r = input.nextDouble()/100;
		
		System.out.println("How many times is this compounded, in a year?");
		double n = input.nextDouble();
		
		System.out.println("What is the duration of this loan?");
		double t = input.nextDouble();
		
		double month = valueRet.calculateMn(p, r, n, t);
		double amount = valueRet.calculateAmt(p, r, n, t);
		
		System.out.printf("Your average monthly pay is %.2f", month);
		System.out.printf("\nYour total amount is %.2f", amount);
	}
	
	public double calculateMn(double p, double r, double n, double t)
	{
		return (p * Math.pow((1+r/n),(n*t)) - p)/ 12 / t;
	}
	
	public double calculateAmt(double p, double r, double n, double t)
	{
		return p * Math.pow((1+r/n),(n*t));
	}
	
}
