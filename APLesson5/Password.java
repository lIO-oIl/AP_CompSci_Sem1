import java.util.Scanner;

//On the note of making life hard but more interesting, I modified the old password code instructions :D You can now set and change the password. After 3 failed attempts, it will lock you out.

public class Password {
	public static void main(String[]args)
	{
		Password manager = new Password();
		String password = "";
		int attempts = 0;
		
		if (password.equals(""))
		{
			password = manager.setPass();
		}
		
		manager.checkPass(password, attempts);
	}
	
	public static String setPass()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("--Password Reset--\nPlease enter your new passcode: ");
		String pass = input.next();
		System.out.println("Please reenter your new passcode: ");
		String passCheck = input.next();
		
		if (pass.equals(passCheck))
		{
			System.out.println("Your password has been changed\n");
			return pass;
		}
		else
		{
			System.out.println("Your passwords do not match, try again\n");
			return setPass();
		}
	}
	
	public static void checkPass(String p, int attempts)
	{	
		int failed = attempts;
		Scanner input = new Scanner(System.in);
		
		if (failed < 3)
		{
			System.out.println("\n--LOGIN--\nPlease enter your existing passcode: (" + failed + " tries failed)");
			String passConfirm = input.next();
			
			if (passConfirm.equals(p))
			{
				System.out.println("You are now logged in. Would you like to reset your password?");
				String redo = input.next();
				if (redo.equals("yes"))
				{
					System.out.println("");
					String newPass = setPass();
					checkPass(newPass, 0);
				}
				else
				{
					System.out.println("Thank you, you are now logged out.");
				}
			}
			else
			{
				failed += 1;
				System.out.println("Your passwords do not match.");
				checkPass(p, failed);
			}
		}
		else
		{
			System.out.println("You have been locked out. Try again later.");
		}
		
	}
}