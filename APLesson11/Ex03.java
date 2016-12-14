import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Ex03{
	public static void main(String[]args)
	{
		Random random = new Random();
		
		String[][] xo = new String[2][2];
		
		for(int i = 0; i < xo.length; i++)
		{
			for(int j = 0; j < xo[i].length; j++)
			{
				int pick = random.nextInt(2);
				if (pick == 1)
					xo[i][j] = "x";
				else
					xo[i][j] = "o";
				System.out.println(xo[i][j] + "\t");
			}
		}
	}
}