package BoiteGener;

import paireGener.Paire;
import other.Gemstone;
import other.Ruby;;

public class TestsBoite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paire<String, String> passe = new Paire<String, String>("premier","deuxième");
		RedefBoite<Gemstone> Abc = new GemBoite();
		Gemstone Rub = new Ruby(54.5);
		Rub.appraisal();
		Abc.addElement(Rub);
		System.out.println(Abc.getValue());
		RedefBoite<Gemstone> a = new RedefBoite<Gemstone>(new Ruby(4.5));
	}
}
