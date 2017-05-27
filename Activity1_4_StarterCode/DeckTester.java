/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		/*String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Spades", "Diamonds"};
		int[] pointValues = {11, 12, 13};*/
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
		int[] pointValues = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d);
	}
}
