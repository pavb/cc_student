package ml.brainin.bauernhof;

import java.util.ArrayList;

import ml.brainin.bauernhof.fauna.Kuh;
import ml.brainin.bauernhof.fauna.Schwein;
import ml.brainin.bauernhof.fauna.Tier;

public class BauernhofMain {
	private ArrayList<Bauer> dieBauer = new ArrayList<>();
	private ArrayList<Stall> staelle = new ArrayList<>();
	private double kontostand = 0;
	
	
	public double getKontostand() {
		return kontostand;
	}


	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}


	public static void main(String[] args) {

		BauernhofMain bauernhofMain = new BauernhofMain();
		Bauer bauer = new Bauer("Tomas", 86, 180, 28, new Stall("Stall 1"));

		
		Kuh kuh1 = new Kuh("Ruddy", "schwarz", "weiss", 650);
		Kuh kuh2 = new Kuh("Sally", "weiss", "schwarz", 750);
		kuh1.setVerkaufsPreis(7.5);
		kuh2.setVerkaufsPreis(7.5);
		Schwein schwein1 = new Schwein("Marta", 70);
		Schwein schwein2 = new Schwein("Moriz", 65);
		schwein1.setVerkaufsPreis(5.5);
		schwein2.setVerkaufsPreis(5.5);
		
		bauer.getStall().addKuh(kuh1);
		bauer.getStall().addKuh(kuh2);
		bauer.getStall().addSchwein(schwein1);
		bauer.getStall().addSchwein(schwein2);
		System.out.println("\n--------------------------------------\nVermehrung\n--------------------------------------");
		
		for (int i = 0; i < 10; i++) {
			int k =(int)(Math.random()*49 +1);
			int s =(int)(Math.random()*90 +1);
			if (s%2 == 0) {
				bauer.getStall().vermehrenKuh("Kalb "+i, kuh1, kuh2, k%2 == 0);
			}else {
				bauer.getStall().vermehrenShwein("Ferkel "+i, schwein1, schwein2, k%2==0);
			}
		}
		
		System.out.println("\n\n--------------------------------------");
		Tier schw1 = bauer.getStall().verkaufenSchwein(schwein1);
		if (schw1 != null) {
			bauernhofMain.setKontostand(bauernhofMain.getKontostand() + schw1.getVerkaufsPreis()* schw1.getGewicht());
			System.out.println("Ein Schwein wurde verkauft.\n\n"+schw1.toString()+"\n\nDer Kontostand ist : "+ bauernhofMain.getKontostand());
		}
		System.out.println("\n\n--------------------------------------");
		Tier k1 = bauer.getStall().verkaufenKuh(kuh1);
		if (k1 != null) {
			bauernhofMain.setKontostand(bauernhofMain.getKontostand() + k1.getVerkaufsPreis()* k1.getGewicht());
			System.out.println("\nEine Kuh wurde verkauft.\n\n"+k1.toString()+"\n\nDer Kontostand ist : "+ bauernhofMain.getKontostand());
		}
	}
	
	
}
