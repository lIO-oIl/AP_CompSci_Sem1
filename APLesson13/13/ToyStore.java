import java.util.Arrays;
import java.util.ArrayList;

public class ToyStore
{
	private static String ts;
	private static ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		ts = "";
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}	
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			Toy obj = getThatToy(name);
			if(obj == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				obj.setCount(obj.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equals(nm))
			{
				return toy;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy toy : toyList)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int car = 0;
		int figures = 0;
		int max = Integer.MIN_VALUE;
		
		for(Toy toy : toyList)
		{
			if(toy.getType().equals("Car"))
			{
				car++;
			}
			if(toy.getType().equals("Action Figure"))
			{
				figures++;
			}
		}
		
		if(figures > car)
		{
			return "There are more action figures than cars";
		}
		if(figures < car)
		{
			return "There are more cars than action figures";
		}
		return "There are equal cars and action figures";
	}
	
	public String toString()
	{		
		return "\nMost Popular Toy: " + getMostFrequentToy() + 
		"\nMost Popular Type: " + getMostFrequentType() + "\n" + toyList + "\n";
	}
}