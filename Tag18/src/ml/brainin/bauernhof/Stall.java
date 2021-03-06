package ml.brainin.bauernhof;

import java.util.ArrayList;

import ml.brainin.bauernhof.fauna.Ferkel;
import ml.brainin.bauernhof.fauna.Kuh;
import ml.brainin.bauernhof.fauna.Schwein;
import ml.brainin.bauernhof.fauna.ATier;

public class Stall {
	
	private int maxAnzahl = 10;
	private ArrayList<ATier> kuehe = new ArrayList<>();
	private ArrayList<ATier> schweine = new ArrayList<>();
	private long id = System.currentTimeMillis();
	private String name;
	
	public Stall() {
		this("Standartname der Stall");
	}
	public Stall(String name) {
		this.name = name;
	}

	public void addKuh(Kuh kuh) {
		if (kuehe.size() +1 > maxAnzahl) {
			System.out.println("Der stall ist voll");
		}else {
			kuehe.add(kuh);
		}
	}
	public void addSchwein(Schwein schwein) {
		if (kuehe.size() +1 > maxAnzahl) {
			System.out.println("Der stall ist voll");
		}else {
			schweine.add(schwein);
		}
	}
	
	public void vermehrenShwein(String name, Schwein vater, Schwein mutter, boolean isMaenlich) {
		Ferkel ferkel = new Ferkel(name, 30, vater, mutter, isMaenlich);
		schweine.add(ferkel);
	}
	public void vermehrenKuh(String name, Kuh vater, Kuh mutter, boolean isMaenlich) {
		Ferkel ferkel = new Ferkel(name, 30, vater, mutter, isMaenlich);
		schweine.add(ferkel);
	}
	
	public ATier verkaufenSchwein(Schwein schwein) {
		for( int i = schweine.size()-1; i >= 0 ; i--) {
			ATier schwein1 = schweine.get(i);
			if (schwein1.equals(schwein)) {
				schweine.remove(i);
				return schwein1;
			}
		}
		return null;
	}
	
	
	public ATier verkaufenKuh(Kuh kuh) {
		for( int i = kuehe.size()-1; i >= 0 ; i--) {
			ATier kuh1 = kuehe.get(i);
			if (kuh1.equals(kuh)) {
				kuehe.remove(i);
				return kuh1;
			}
		}
		return null;
	}
	public double getKueheKontostand() {
		double sum = 0;
		for (int i = 0 ; i < kuehe.size(); i++) {
			Kuh kuh = (Kuh) kuehe.get(i);
			sum += kuh.getVerkaufsPreis();
		}
		return sum;
	}
	public double getSchweineKontostand() {
		double sum = 0;
		for (int i = 0 ; i < schweine.size(); i++) {
			Schwein schwein = (Schwein) schweine.get(i);
			sum += schwein.getVerkaufsPreis();
		}
		return sum;
	}
	
	public double getGesamtesKontostand() {
		return getKueheKontostand() + getGesamtesKontostand();
	}
	public ArrayList<ATier> getKuehe() {
		return kuehe;
	}

	public void setKuehe(ArrayList<ATier> kuehe) {
		this.kuehe = kuehe;
	}

	public ArrayList<ATier> getSchweine() {
		return schweine;
	}

	public void setSchweine(ArrayList<ATier> schweine) {
		this.schweine = schweine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
