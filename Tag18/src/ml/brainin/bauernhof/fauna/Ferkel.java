package ml.brainin.bauernhof.fauna;

public class Ferkel extends Kind {
	public Ferkel() {
		this("Standartname der Ferkel", 60, null, null, false);
	}
	public Ferkel(String name, int gewicht, ATier vater, ATier mutter, boolean isMaenlich) {
		super(name, gewicht, vater, mutter, isMaenlich);
	}
	@Override
	public void makeGeraeusch() {
		System.out.println("Enen Ferkel "+getName()+" macht Geraeusch");
	}
	
	
}
