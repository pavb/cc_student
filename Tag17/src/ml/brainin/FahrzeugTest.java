package ml.brainin;

import java.util.ArrayList;

public class FahrzeugTest{
	public static void main (String args[]){
		System.out.println ("Start des Programms");
		// Anlegen eines Arrays aus 6 Fahrzeugen
		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
		// Die ersten 3 Elemente des Arrays sollen mit Pkws gef�llt werden
		System.out.println();
		System.out.println ("3 Pkws");
		fahrzeuge.add(new Pkw());
		fahrzeuge.add(new Pkw());
		fahrzeuge.add(new Pkw());
		// Die drei letzten Elemente mit Motorr�dern f�llen
		System.out.println();
		System.out.println ("3 Motorr�der");
		fahrzeuge.add(new Motorrad());
		fahrzeuge.add(new Motorrad());
		fahrzeuge.add(new Motorrad());
		// Geben Sie in einer Schleife f�r alle Array-Elemente die
		// entsprechenden Datenfelder aus
		for (Fahrzeug fahrzeug : fahrzeuge) {
			fahrzeug.print();
		}
		// Ermittlung des Gesamtwerts aller Fahrzeuge
		int summe = 0;
		for (Fahrzeug fahrzeug : fahrzeuge) {
			summe += fahrzeug.getPreis();
		}
		System.out.println ("\n\nGesamtwert aller Fahrzeuge: " + summe);
	}
}