import java.util.Arrays;
import java.util.ArrayList;

public class ToyStore
{
	private static String ts;
	private static ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		ts = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
	}
	
	public ToyStore(String t)
	{
		ts = t;
	}
	
	public static void loadToys()
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
	}
}