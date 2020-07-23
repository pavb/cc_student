package ml.brainin.bauernhof.fauna;

public abstract class Kind extends ATier {
	@Override
	public String toString() {
		return "Kind [namen="+super.getName()+",vater=" + vater.getName() + ", mutter=" + mutter.getName() + ", isMaenlich=" + isMaenlich + "]";
	}
	private ATier vater;
	private ATier mutter;
	
	public ATier getVater() {
		return vater;
	}
	public void setVater(ATier vater) {
		this.vater = vater;
	}
	public ATier getMutter() {
		return mutter;
	}
	public void setMutter(ATier mutter) {
		this.mutter = mutter;
	}
	public Kind() {
		this("Standartkindname", 10, null, null, false);
	}
	public Kind(String name, int gewicht, ATier vater, ATier mutter, boolean isMaenlich) {
		super(name, gewicht, isMaenlich);
		this.setVater(vater);
		this.setMutter(mutter);
		System.out.println(toString());
	}
	
	
	
}
