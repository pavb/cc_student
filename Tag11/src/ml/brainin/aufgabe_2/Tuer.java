package ml.brainin.aufgabe_2;

public class Tuer {
	private int schlusselNummer;
	private boolean geschlossen;

	public Tuer( int schlusselNummer) {
		this.setSchlusselNummer(schlusselNummer);
		this.setGeschlossen(true);
	}
	
	public boolean action(int schlusselNummer, boolean mode) {
		if (this.getSchlusselNummer() == schlusselNummer) {
			this.setGeschlossen(mode);
			return true;
		}
		return false;
	}
	
	
	public int getSchlusselNummer() {
		return schlusselNummer;
	}
	public void setSchlusselNummer(int schlusselNummer) {
		this.schlusselNummer = schlusselNummer;
	}
	public boolean isGeschlossen() {
		return geschlossen;
	}
	public void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}
}
