package GemsSafe;

public class testSafe {

	
	public static void main(String args[])   {
		
		int capacity = 10;
		Safe mysafe = new Safe(capacity);
		Gemstone gem1 = new Gemstone(10);
		Gemstone gem2 = new Gemstone(5);
		Gemstone gem3 = new Gemstone(2);
		Gemstone gem4 = new Gemstone(7);
		Gemstone gem5 = new Gemstone(8);
		
		mysafe.addGem(gem1);
		mysafe.addGem(gem2);
		mysafe.addGem(gem3);
		mysafe.addGem(gem4);
		mysafe.addGem(gem5);

		
		
		
	}
	
	
	
}
