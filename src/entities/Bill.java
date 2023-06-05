package entities;

public class Bill {

	public char gender;
	
	public int beer;
	
	public int barbecue;
	
	public int softDrink;
	
	
	public double ticket() {
		if (gender == 'f') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}
	
	public double feeding() {
		return beer * (double)5.00 + barbecue * (double)7.00 + softDrink * (double)3.00;
	}
	
	public double cover() {
		
		if ( feeding() > 30.00) {
			return 0;
		}
		else
			return 4.00;
	}
	
	public double total() {
		return ticket() + feeding() + cover(); 
	}
}
