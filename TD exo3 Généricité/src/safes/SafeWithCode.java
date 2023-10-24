package safes;

import valuables.Gemstone;
import valuables.Valuable;
import valuables.Storable;

public class SafeWithCode<T extends Valuable &Storable<GenericSafe<T>>> extends GenericSafe<T> {
	

	private String code = "password";
	private double value;

	public SafeWithCode() {
	}

	public SafeWithCode(int capac) {
		super(capac);
	}
	
	public SafeWithCode(int capac, String c) {
		super(capac);
		this.code = c;
	}
	
	public SafeWithCode(String c) {
		//super();
		this.code = c;
	}
	
	public double getValue() {
		if (super.isOpened()) {
			value = super.getValue();
		}
		else { 
			System.err.println("Safe is closed");
			value = -1;
		}
		return value;
	}

	public void addGem(T g) {
		if (super.isOpened()) {
			super.addGem((g));
		}
		else System.err.println("Safe is closed");
	}

	
	public void changeCode(String newCode, String code) {
		if(this.code.contentEquals(code)) this.code = newCode;
		else System.err.println("Mauvais code, sale hacker");
	}
	
	public void open(String code) {
		if(this.code.contentEquals(code)) super.open();
		else System.err.println("Mauvais code, sale hacker");
	}

	@Override
	public void open() {
		System.err.println("Wrong usage: please provide a code");
	}
}
