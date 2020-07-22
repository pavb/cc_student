package ml.brainin.bauernhof.fauna;



public class Schwein extends Tier{
	
	public Schwein() {
		this("Standartname der Schwein", 50);
	}
	public Schwein(String name, int gewicht) {
		super(name, gewicht);
		System.out.println(toString());

	}

}
