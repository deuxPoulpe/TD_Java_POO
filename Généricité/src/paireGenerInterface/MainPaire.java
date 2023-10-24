package paireGenerInterface;

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
		
		Paire<String, Integer> psi = new Paire<String, Integer>(one, 1);
		if(pss.sameFirst(psi))
			System.out.println("Mêmes premiers éléments");
		else
			System.out.println("Pemiers éléments différents");
		
		
		psi = new Paire<String, Integer>(two, 1);
		if(pss.sameFirst(psi))
			System.out.println("Mêmes premiers éléments");
		else
			System.out.println("Premiers éléments différents");	
		
		System.out.println(psi.getValue());
	}

}
