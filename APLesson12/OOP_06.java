public class OOP_06
{
	private String manufacturer, name, category, price;
	private int UPC;
	
	public OOP_06()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = "";
	}
	
	public OOP_06(String manu, String n)
	{
		manufacturer = manu;
		name = n;
		UPC = (int)(Math.random() * 100000000) + 1;
		category = "Unspecified";
		price = "Undetermined";
	}
	
	public OOP_06(String manu, String n, String cat, String cost)
	{
		manufacturer = manu;
		name = n;
		UPC = (int)(Math.random() * 100000000) + 1;
		category = cat;
		price = cost;
	}
	
	public String toString()
	{
		return "Manufacturer:\t" + manufacturer + "\nItem Name:\t\t" + name + "\nUPC #:\t\t" + UPC + "\nCategory:\t\t" + category + "\nPrice:\t\t" + price;
	}
}