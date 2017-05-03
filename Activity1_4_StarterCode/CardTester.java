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
		JoS.matches(JoS2);
		
		JoS2.suit();
		JoS2.rank();
		JoS2.pointValue();
		JoS2.matches(QoS);
		
		QoS.suit();
		QoS.rank();
		QoS.pointValue();
		QoS.matches(JoS);
	}
}
