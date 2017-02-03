public class ToyRunner
{
	public static void main (String[]args)
	{
		AFigure afTest = new AFigure("Star Wars");
		Car carTest = new Car("Hotwheel");
		
		System.out.println(afTest.toString() + "\n" + carTest.toString());
	}
}