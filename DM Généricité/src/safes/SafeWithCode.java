package safes;

import valuables.Gemstone;

public class SafeWithCode extends GenericSafe {
	
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
	if (super.isOpened())
	this.value = 0;
	for (Gemstone gem : super.getMyContent()) {
		if (gem.getValue() == -1) {
			System.err.println("Not all gems are expertized");
		}
		this.value +=gem.getValue();
	}
	return this.value;
	
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
