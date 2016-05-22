package igre;

import java.util.Vector;

public class Spil {
	Vector<Karta> karte;
	
	public void dodajKartu(Karta karta){
		karte.add(karta);
	}
	
	public void ukloniKartu(Karta karta){
		karte.remove(karta);
	}
}
