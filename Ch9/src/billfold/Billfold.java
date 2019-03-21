package billfold;

public class Billfold {
	private Card card1;
	private Card card2;
	
	public void addCard(Card c) {
		if (card1 == null) {
			card1 = c;
		} else if (card2 == null) {
			card2 = c;
		}
	}
	
	public String formatCards() {
		String s1 = card1 != null ? card1.format() : "(empty)";
		String s2 = card2 != null ? card2.format() : "(empty)";
		return String.format("[%s / %s]\n", s1, s2);
	}
}