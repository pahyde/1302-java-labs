package billfold;

public class BillFoldTester {
	public static void main(String[] args) {
		Card a = new CallingCard("cc", "34dhweys", 14325);
		Card b = new DriverLicense("id card", "id: 454323", 129437);

		Billfold bfold = new Billfold();
		
		//print empty billfold
		System.out.println(bfold.formatCards());
		
		//Add first card
		bfold.addCard(a);
		System.out.println("add card a");
		System.out.println(bfold.formatCards());
		
		//Add second card
		bfold.addCard(b);
		System.out.println("add card b");
		System.out.println(bfold.formatCards());
		
		
		//Check equality between calling cards
		CallingCard c = new CallingCard("cc 1", "34dhweys", 14325);
		CallingCard d = new CallingCard("cc 1", "34dhweys", 14325);
		
		System.out.println("calling card c == Calling card d? " + c.equals(d));
		
		
		/*code output:
		 
		  [(empty) / (empty)]

	      add card a
		  [Card holder: calling Card Number: 34dhweys Pin: 14325 / (empty)]
			
		  add card b
		  [Card holder: calling Card Number: 34dhweys Pin: 14325 / Card holder: id card Id Number Number: id: 454323 Expiration Data: 129437]
			
		  calling card c == Calling card d? true
		 
		*/
	}
}