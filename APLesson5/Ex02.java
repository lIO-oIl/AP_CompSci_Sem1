import java.util.Random;
import java.util.Scanner;

public class Ex02
{
	public static void main(String[]args)
	{
		Ex02 Dice = new Ex02();
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What your first item?");
		String item1 = input.nextLine();
	
		System.out.println("What is the cost of you first item?");
		double cost1 = input.nextDouble();		
		
		System.out.println("What your second item?");
		String fill = input.nextLine();
		String item2 = input.nextLine();
		
		System.out.println("What is the cost of you second item?");
		double cost2 = input.nextDouble();	
		
		System.out.println("What your third item?");
		String fill2 = input.nextLine();
		String item3 = input.nextLine();
		
		System.out.println("What is the cost of you third item?");
		double cost3 = input.nextDouble();
		
		System.out.println("What your fourth item?");
		String fill3 = input.nextLine();
		String item4 = input.nextLine();
		
		System.out.println("What is the cost of you fourth item?");
		double cost4 = input.nextDouble();
		
		double discount = Dice.method(cost1, cost2, cost3, cost4);
		
		double subTotal = cost1 + cost2 + cost3 + cost4;
		
		double total = subTotal * (1 + (discount/100));
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>>>>>");
		format(item1, cost1);
		format(item2, cost2);
		format(item3, cost3);
		format(item4, cost4);
		format("Subtotal:", subTotal);
		format("(%) Discount:", discount);
		format("Total:", total);
		System.out.println("\n_________________________________________________");
		System.out.println("\n                Thank you for shopping!");
	}
	
	public static int method(double c1, double c2, double c3, double c4)
	{
		if((c1 + c2 + c3 + c4) > 2000)
		{
			return 15;
		}
		else
		{
			return 0;
		}
	}	
	
	public static void format(String one, double two)
	{
		System.out.printf("\n %15s%30.2f", one, two);
	}
}