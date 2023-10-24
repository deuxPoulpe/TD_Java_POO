package paireObject;

public class MainPaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Paire ps = new Paire("Hello", "Bonjour");
			
			System.out.println(ps);
			String myS = (String) ps.getFirst();
			System.out.println(myS);
	
			Paire psi = new Paire("Hello", 2);		
			System.out.println(psi);
			System.out.println(psi.getSecond().getClass().getName());
			int f = (int) psi.getSecond();
			System.out.println(f);
	}

}
