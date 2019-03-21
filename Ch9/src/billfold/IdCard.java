package billfold;

public class IdCard extends Card {
	private String idNumber;
	
	public IdCard(String n, String id) {
		super(n);
		idNumber = id;
	}
	
	public String getId() {
		return idNumber;
	}
	
	public String format() {
		return String.format("%s Id Number Number: %s", super.format(), idNumber);
	}
	
	public boolean equals(IdCard c) {
		if (c instanceof IdCard) {
			return c.getId() == this.idNumber && ((Card) c).getName() == super.getName();
		}
		return false;
	}
}