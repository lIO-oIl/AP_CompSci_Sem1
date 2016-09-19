import java.util.Scanner;

public class Lesson_4
{
	public static void main(String[]args)
	{
		Lesson_4 Class = new Lesson_4();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first item:");
		String item1 = input.nextLine();
		
		System.out.println("Please enter cost of " + item1 + ":");
		Double cost1 = input.nextDouble();
		
		System.out.println("Please enter your second item:");
		String clear = input.nextLine();
		String item2 = input.nextLine();
		
		System.out.println("Please enter cost of " + item2 + ":");
		Double cost2 = input.nextDouble();
		
		System.out.println("Please enter your third item:");
		String clear1 = input.nextLine();
		String item3 = input.nextLine();
		
		System.out.println("Please enter cost of " + item3 + ":");
		Double cost3 = input.nextDouble();
				
		Class.format(item1, item2, item3, cost1, cost2, cost3);

//------------------------------New Code Starts here-------------------------------------//		
		System.out.println("\n\nID CARD:");
	
		System.out.println("Enter your first name:");
		String clear4 = input.nextLine();
		String first = input.nextLine();
		
		System.out.println("Enter your last name:");
		String last = input.nextLine();
		
		System.out.println("Enter your title:");
		String title = input.nextLine();
		
		System.out.println("Enter the school location:");
		String school = input.nextLine();
		
		System.out.println("Enter the school year:");
		String year = input.nextLine();
		
		System.out.println("What is your subject?");
		String subject = input.nextLine();
		
		Class.idFormat(first, last, title, school, year, subject);
	}
	
	public void format(String i1, String i2, String i3, Double c1, Double c2, Double c3)
	{
		System.out.println("\n\nReceipt:");
		System.out.printf ("*%15s ---------- %5.2f", i1, c1);
		System.out.printf ("\n*%15s ---------- %5.2f", i2, c2);
		System.out.printf ("\n*%15s ---------- %5.2f", i3, c3);
		
		Double Subtotal = c1+c2+c3;
		Double Tax = Subtotal*0.1;
		Double Total = Subtotal+Tax;
		
		System.out.printf ("\n\n*%15s ---------- %5.2f", "Subtotal:", Subtotal);
		System.out.printf ("\n*%15s ---------- %5.2f", "Tax:", Tax);
		System.out.printf ("\n*%15s ---------- %5.2f", "Total:", Total);
		System.out.println("\n______________________________________\n* Thank you for your support *");
	}
	
	public void idFormat(String first, String last, String title, String school, String year, String subject)
	{
		System.out.println("\n\nID CARD:");
		System.out.println("******************************"); //40 *
		System.out.printf ("*" + "%10s%19s", school, year + "  *");
		System.out.printf ("\n*" + "%10s%19s", first, last + "  *");
		System.out.printf ("\n*" + "%10s%19s", title, subject + "  *");
		System.out.println("\n******************************"); //40 *
	}
}