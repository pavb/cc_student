package ml.brainin.aufgabe_2;

import java.util.ArrayList;

import ml.brainin.aufgabe_1.Bauer;
import ml.brainin.aufgabe_1.Eimer;
import ml.brainin.aufgabe_1.Kuh;

public class Stall {

	
	public Stall() {
		
	}
	
	public static void main(String[] args) {
		Kuh kuh = new Kuh("Ruddy", "schwarz", "weiss");
		kuh.setGewicht(650);
		Bauer bauer = new Bauer("Tomas", 86, 180, 28);
		bauer.addSchlussel(90888);
		bauer.addSchlussel(90887);
		bauer.addSchlussel(90889);
		bauer.wirdGemolken(kuh);
		
		int schlusselNummer = 90887;
		Tuer tuer = new Tuer(schlusselNummer);
		ArrayList<Integer> schl = bauer.getSchlusselBunt();
		for (int i = 0; i < 2; i++) {
			System.out.println("------------------------------------------");
			for(Integer schlussel : schl) {
				if (tuer.action(schlussel, !tuer.isGeschlossen())) {
					System.out.println("Der Schlüssel mit der Nummer : "+ schlussel+" passt zum Schloss ."
							+ "\nDer Tuer ist "+ (tuer.isGeschlossen()?"getschlossen":"geoffnet"));
				}else {
					System.out.println("Der Schlüssel mit der Nummer : "+ schlussel+" passt nicht zum Schloss");
				}
			}
		}
		System.out.println("------------------------------------------");
	}
	
}
