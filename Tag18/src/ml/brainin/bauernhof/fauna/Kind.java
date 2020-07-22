package ml.brainin.bauernhof.fauna;

public class Kind extends Tier {
	@Override
	public String toString() {
		return "Kind [namen="+super.getName()+",vater=" + vater.getName() + ", mutter=" + mutter.getName() + ", isMaenlich=" + isMaenlich + "]";
	}
	private Tier vater;
	private Tier mutter;
	boolean isMaenlich;
	
	public Tier getVater() {
		return vater;
	}
	public void setVater(Tier vater) {
		this.vater = vater;
	}
	public Tier getMutter() {
		return mutter;
	}
	public void setMutter(Tier mutter) {
		this.mutter = mutter;
	}
	public boolean isMaenlich() {
		return isMaenlich;
	}
	public void setMaenlich(boolean isMaenlich) {
		this.isMaenlich = isMaenlich;
	}
	public Kind() {
		this("Standartkindname", 10, new Tier(), new Tier(), false);
	}
	public Kind(String name, int gewicht, Tier vater, Tier mutter, boolean isMaenlich) {
		super(name, gewicht);
		this.setVater(vater);
		this.setMutter(mutter);
		this.setMaenlich(isMaenlich);
		System.out.println(toString());
	}
	
	
	
}
