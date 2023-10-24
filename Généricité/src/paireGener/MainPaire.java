package paireGener;

import other.Complex;

public class MainPaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paire<String, String> pss = new Paire<String, String>("Hello", "Bonjour");
		System.out.println(pss);
		
		String one = pss.getFirst();
		String two = pss.getSecond();
		System.out.println(one + " " + two);
		
		Paire<Integer, String> pis = new Paire<Integer, String>(10, "Dix");
		System.out.println(pis);
		
		Paire<Paire<String, String>, Paire<Integer, String>> ppsspis = new Paire<Paire<String,String>, Paire<Integer,String>>(pss, pis);
		System.out.println(ppsspis);
		
		/* Paire<String, Integer> psi = new Paire<String, Integer>(one, 1);
		if(pss.sameFirst(psi))
			System.out.println("Mêmes premiers éléments");
		else
			System.out.println("Pemiers éléments différents");
		
		
		psi = new Paire<String, Integer>(two, 1);
		if(pss.sameFirst(psi))
			System.out.println("Mêmes premiers éléments");
		else
			System.out.println("Premiers éléments différents");		
		
		
		Paire<String,String> pssd = new PaireDerivee<String, String>();
		//Paire<Object, Object> poo = new Paire<String, String>(null, null);
		Paire<Object, Object> poo = new Paire<Object, Object>(one, two);
		System.out.println(poo);
		
		MinMax<String> mms = new MinMax<String>(one, two);
		System.out.println(mms);
		MinMax<String> mms2 = new MinMax<String>(two, one);
		System.out.println(mms2);
		
//		MinMax<Complex> mmc = new MinMax<Complex>(new Complex(10), new Complex(5, 10));
		
		MinMax<MinMax<String>> mmmms =  new MinMax<MinMax<String>>(mms, mms2);
		System.out.println(mmmms);
		*/
	}

}
