package billfold;

public class CallingCard extends Card {
	private String cardNumber;
	private int pin;
	
	public CallingCard(String n, String cn, int p) {
		super(n);
		cardNumber = cn;
		pin = p;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public String format() {
		return String.format("%s Card Number: %s Pin: %d", super.format(), cardNumber, pin);
	}
	
	public String toString() {
		return format();
	}
	
	public boolean equals(CallingCard c) {
		if (c instanceof CallingCard) {
			boolean sameCardNumber = (c.getCardNumber()).equals(this.cardNumber);
			boolean samePin        = c.getPin() == this.pin;
			boolean sameName       = ((Card) c).getName() == super.getName();
			return sameCardNumber && samePin && sameName;
		}
		return false;
	}
}
