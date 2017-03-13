public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation station1 = new PlayStation("A box that's not called a box");
		XBox box1 = new XBox("That one XBox");
		PlayStation station2 = new PlayStation("PlayStation dupa");
		PC computer1 = new PC("Super OP computer");
		XBox box2 = new XBox("Yet another XBox");
		PC computer2 = new PC("Best Console BTW");
		
		System.out.println(station1 + "\n\n\n" + box1 + "\n\n\n" + station2 + "\n\n\n" + computer1 + "\n\n\n" + box2 + "\n\n\n" + computer2);
	}
}