package ml.brainin.aufgabe_1;

import java.awt.List;
import java.util.ArrayList;

public class Bauer {
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Eimer eimer;
	private ArrayList<Integer> schlusselBunt = new ArrayList<>();
	
	public Bauer() {
		this("Klaus Gruber", 90, 180, 35);
	}
	public Bauer(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		eimer = new Eimer();
}
	
	public void wirdGemolken(Kuh kuh) {
		eimer.setFuellmenge(kuh.milken());
		
	}
	public void addSchlussel(int zahl) {
		schlusselBunt.add(zahl);
	}
	public ArrayList<Integer> getSchlusselBunt() {
		return schlusselBunt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
}
