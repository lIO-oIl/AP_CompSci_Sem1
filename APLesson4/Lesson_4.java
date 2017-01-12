import java.util.Scanner;

public class Lesson_4
{
	
	public static String i1;
	public static double c1;
	public static String i2;
	public static double c2;
	public static String i3;
	public static double c3;
	
	public static String first;
	public static String last;
	public static String title;
	public static String school;
	public static String year;
	public static String subject;
	
	public static void main(String[]args)
	{
		Lesson_4 Class = new Lesson_4();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first item:");
		i1 = input.nextLine();
		
		System.out.println("Please enter cost of " + i1 + ":");
		c1 = input.nextDouble();
		
		System.out.println("Please enter your second item:");
		String clear = input.nextLine();
		i2 = input.nextLine();
		
		System.out.println("Please enter cost of " + i2 + ":");
		c2 = input.nextDouble();
		
		System.out.println("Please enter your third item:");
		String clear1 = input.nextLine();
		i3 = input.nextLine();
		
		System.out.println("Please enter cost of " + i3 + ":");
		c3 = input.nextDouble();
				
		Class.format();

//------------------------------New Code Starts here-------------------------------------//		
		System.out.println("\n\nID CARD:");
	
		System.out.println("Enter your first name:");
		String clear4 = input.nextLine();
		first = input.nextLine();
		
		System.out.println("Enter your last name:");
		last = input.nextLine();
		
		System.out.println("Enter your title:");
		title = input.nextLine();
		
		System.out.println("Enter the school location:");
		school = input.nextLine();
		
		System.out.println("Enter the school year:");
		year = input.nextLine();
		
		System.out.println("What is your subject?");
		subject = input.nextLine();
		
		Class.idFormat();
	}
	
	public void format()
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
	
	public void idFormat()
	{
		System.out.println("\n\nID CARD:");
		System.out.println("******************************"); //40 *
		System.out.printf ("*" + "%10s%19s", school, year + "  *");
		System.out.printf ("\n*" + "%10s%19s", first, last + "  *");
		System.out.printf ("\n*" + "%10s%19s", title, subject + "  *");
		System.out.println("\n******************************"); //40 *
	}
}