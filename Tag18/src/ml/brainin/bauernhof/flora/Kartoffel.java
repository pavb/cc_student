package ml.brainin.bauernhof.flora;

public class Kartoffel extends APflanzen{

	public Kartoffel(String sorte, int knollengroesse) {
		super(sorte, knollengroesse);
	}
	
	@Override
	int fressen() {
		int tmp = this.getGroesse();
		this.setGroesse(0);
		System.out.println("Die Kartoffel " + this.getSorte() + " wird gegessen.");
		return tmp;
	}
	
	
	
}
