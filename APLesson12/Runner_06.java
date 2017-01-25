import java.util.Scanner;

public class Runner_06
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		OOP_06 user = new OOP_06();
		
		System.out.println("Enter the Item Manufacturer:");
		String manu = input.nextLine();
		System.out.println("Enter the Item Name");
		String item = input.nextLine();
		System.out.println("Do you plan on modifying the price or category?");
		String choice = input.next();
		
		if(choice.equals("Y"))
		{
			String category = "";
			String price = "";
			
			System.out.println("Do you plan on modifying the category?");	
			String cchoice = input.next();
			if(cchoice.equals("Y"))
			{
				String clear = input.nextLine();
				System.out.println("Enter the category");
				category = input.nextLine();
			}
			else
				category = "Unspecified";
			System.out.println("Do you plan on modifying the price?");	
			String pchoice = input.next();
			if(pchoice.equals("Y"))
			{
				String clear1 = input.nextLine();
				System.out.println("Enter the price");
				price = input.nextLine();
			}
			else
				price = "Undetermined";
			user = new OOP_06(manu, item, category, price);
		}
		else
		{
			user = new OOP_06(manu, item);
		}
		
		System.out.println("\n" + user);
	}
}