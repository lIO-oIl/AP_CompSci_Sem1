/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card JoS = new Card("Jack", "Spades", 11);
		Card JoS2 = new Card("Jack", "Spades", 11);
		Card QoS = new Card("Queen", "Spades", 11);
		
		JoS.suit();
		JoS.rank();
		JoS.pointValue();
		if(JoS.matches(JoS2))
			System.out.println("matches");
		
		JoS2.suit();
		JoS2.rank();
		JoS2.pointValue();
		if(JoS2.matches(QoS))
			System.out.println("matches");
		else
			System.out.println("doesnt match");
		
		QoS.suit();
		QoS.rank();
		QoS.pointValue();
		if(QoS.matches(JoS))
			System.out.println("matches");
		else
			System.out.println("doesnt match");
	}
}
