package ml.brainin.Aufgabe_2;

public class Konto {
	private Person person;
	private double kontostand;
	public Konto (String name, String vorname, float kontostand){
		this.kontostand = kontostand;
		person = new Person();
		person.setName(name);
		person.setVorname(vorname);
	}
	public String getName() {
		return person.getName();
	}
	public String getVorname() {
		return person.getVorname();
	}
	public double getKontostand() {
		return kontostand;
	}
}
