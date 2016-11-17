import java.util.Scanner;

public class GPA {
	public static void main (String[]args)
	{		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWhat is your first period?");
		String first = keyboard.next();
		
		System.out.println("\nWhat is your second period?");
		String second = keyboard.next();
		
		System.out.println("\nWhat is your third period?");
		String third = keyboard.next();
		
		System.out.println("\nWhat is your fourth period?");
		String fourth = keyboard.next();
	
		System.out.println("\nWhat is your fifth period?");
		String fifth = keyboard.next();
		
		System.out.println("\nWhat is your sixth period?");
		String sixth = keyboard.next();
		
		System.out.println("\nWhat is your seventh period?");
		String seventh = keyboard.next();
		
		calcGrades(first, second, third, fourth, fifth, sixth, seventh);
	}
	public static void calcGrades(String p1, String p2, String p3, String p4, String p5, String p6, String p7)
	{
		double total = 0;
		double GPA = 0;
		
		total = changeGrade(p1)+ changeGrade(p2) + changeGrade(p3) + changeGrade(p4) + changeGrade(p5) + changeGrade(p6) + changeGrade(p7);
		
		GPA = total/7;
		System.out.printf("Your GPA is %.2f", GPA);
	}
	
	public static int changeGrade(String grade)
	{
		int g = 0;
		if (grade.equals("A"))
		{
			g = 4;
		}
		if (grade.equals("B"))
		{
			g = 3;
		}
		if (grade.equals("C"))
		{
			g = 2;
		}
		if (grade.equals("D"))
		{
			g = 1;
		}
		if (grade.equals("F"))
		{
			g = 0;
		}
		return g;
	}
}