import java.util.Scanner;
import java.util.Random;

public class GameGun
{	
	static int bulletCount = 0;
	static int clipSize = 16;
	static int shotCount = 0;
	static String[] clip;
	static String[] shooting = {"Engaging fire!", "Pulling Trigger!", "Firing!", "Enemy Spotted!", "Attacking!", "BOOM!", "Shots Fired!", "Roger That!", "I Copy You!"};
	static String[] ooa = {"Need to Reload!", "I'm Out of Ammo!", "I Need More Ammo!", "My Clip is Empty!", "I Have to Reload!"};
	static String[] reloading = {"Reloading!", "On it!", "Replacing Clip!", "Lock and Load!", "Roger That!", "I Copy You!"};
	static Random rand = new Random();
	
	public static void main(String[]args)
	{	
		Scanner input = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		resetClip("init");
		
		System.out.println("Project GameGun\nType \"help\" to display options");
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("\nOrders Commander?");
			String select = input.next();
			
			if(select.equals("R"))
			{
				System.out.println(reload());
			}
			
			if(select.equals("S"))
			{
				System.out.println(shoot());
			}
			
			if(select.equals("help"))
			{
				instructions();
			}
			System.out.println(printClip());
		}
	}
	
	public static void resetClip(String action)
	{
		if(action.equals("init"))
		{
			for(int i = 0; i < clip.length; i++)
			{
				clip[i] = "-";
			}
		}
		if(action.equals("reload"))
		{
			for(int i = 0; i < shotCount; i++)
			{
				clip[i] = "*";
			}
		}
	}
	
	public static String reload()
	{
		if(bulletCount >= clipSize)
		{
			bulletCount -= clipSize - shotCount;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip("reload");
		int i = rand.nextInt(reloading.length);
		return reloading[i];
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "-";
			shotCount -= 1;
			int i = rand.nextInt(shooting.length);
			return shooting[i];
		}
		else
		{
			int i = rand.nextInt(ooa.length);
			return ooa[i];
		}
	}
	
	public static void instructions()
	{
		System.out.println("Welcome to Project GameGun\n--Instructions--\nEnter R to reload\nEnter S to Shoot\n");
	}
	
	public static String printClip()
	{
		String output = "";
		output += "Bullets:\t" + bulletCount + " Remaining\nClip:\t\t";
		for(int i = 0; i < clipSize; i++)
		{
			output += clip[i];
		}
		return output;
	}
}