import java.util.Scanner;

public class TicketDriver
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many days remaining?");
		int d = input.nextInt();
		
		Walkup wu = new Walkup();
		Advance a = new Advance(d);
		StudentAdvance sa = new StudentAdvance(d);
		
		System.out.println(wu + "\n\n\n" + a + "\n\n\n" + sa);
	}
}