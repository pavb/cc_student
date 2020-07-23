package ml.brainin.bauernhof.fauna;

public class Kalb extends Kind {
	public Kalb() {
		this("Standartname der Kalb", 60, null, null, false);
	}
	public Kalb(String name, int gewicht, ATier vater, ATier mutter, boolean isMaenlich) {
		super(name, gewicht, vater, mutter, isMaenlich);
	}
	@Override
	public void makeGeraeusch() {
		System.out.println("Enen Kalb  "+getName()+"  macht Geraeusch");
	}
	
	
}
