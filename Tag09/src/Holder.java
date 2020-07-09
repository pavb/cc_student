

public class Holder {
	int value = 1;
	Holder link;
	public Holder(int val) {this.value = val;}
	
	public static void main(String[] args) {
		final Holder a = new Holder(5);
		System.out.println(" Holder a "+a);
		Holder b = new Holder(10);
		System.out.println(" Holder b "+b);
		a.link = b;
		System.out.println(" Holder a.link "+a.link);
		b.link = setInt(a,b);
		System.out.println(" Holder b.link "+b.link);
		System.out.println(a.link.value+" "+b.link.value);
	}
	public static Holder setInt(final Holder x, final Holder y) {
		System.out.println(" Holder x "+x);
		System.out.println(" Holder x.link "+x.link);
		System.out.println(" Holder y "+y);
		System.out.println(" Holder y.link "+y.link);
		x.link = y.link;
		System.out.println(" Holder x.link "+x.link);
		return x;
	}
}
