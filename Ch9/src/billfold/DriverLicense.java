package billfold;

public class DriverLicense extends IdCard {
	private int expiration;
	
	public DriverLicense(String n, String id, int e) {
		super(n, id);
		expiration = e;
	}
	
	public int getExpir() {
		return expiration;
	}
	
	public String format() {
		return String.format("%s Expiration Data: %d", super.format(), expiration);
	}
	
	public boolean equals(DriverLicense c) {
		if (c instanceof DriverLicense) {
			return c.getExpir() == this.expiration && ((Card) c).getName() == super.getName();
		}
		return false;
	}
}

