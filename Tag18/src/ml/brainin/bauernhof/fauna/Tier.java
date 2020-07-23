package ml.brainin.bauernhof.fauna;

public class Tier {
	private String name = "";
	private int gewicht = 0;
	private double verkaufsPreis = 0;
	private long id = System.currentTimeMillis();
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
		if (gewicht <0) gewicht = 0;
		this.gewicht = gewicht;
	}
	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}
	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public boolean equals(Tier tier) {
		return this.id == tier.getId();
	}

	public Tier() {
		this("Standartname", 50);
	}
	public Tier(String name, int gewicht) {
		super();
		this.name = name;
		this.gewicht = gewicht;
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "\nName: "+ this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht()+" kg";
		ausgabe += "\nVerkaufsPreis: " + this.getVerkaufsPreis()+" euro/kg";
		return ausgabe;
	}

}