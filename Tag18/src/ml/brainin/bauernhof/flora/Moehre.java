package ml.brainin.bauernhof.flora;

public class Moehre extends APflanzen{

	public Moehre(String sorte, int ruebenlaenge) {
		super(sorte, ruebenlaenge);
	}
	
	@Override
	public int fressen() {
		int tmp = this.getGroesse();
		this.setGroesse(0);
		System.out.println("Die Moehre " + this.getSorte() + " wird gegessen.");
		return tmp;
	}
	
	
	
	
	
}
