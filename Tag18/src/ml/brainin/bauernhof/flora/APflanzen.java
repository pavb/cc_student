package ml.brainin.bauernhof.flora;

public abstract class APflanzen {
	
	abstract int fressen();
	
	private String sorte;
	private int groesse;


	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public String getSorte() {
		return sorte;
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public APflanzen() {
		this("Standardsorte",10);
	}
	
	public APflanzen(String sorte, int knollengroesse) {
		this.setSorte(sorte);
		this.setGroesse(knollengroesse);
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n"+getClass().getSimpleName();
		ausgabe += "\nSorte: " + this.getSorte();
		ausgabe += "\nGroesse: " + this.getGroesse();
		return ausgabe;
	}
	


	
}
