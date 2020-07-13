import java.util.*;
enum ttt{D1,D2}
class Calc2 {
	int r ;
	Calc2(int n) {r = n++;}
	public static void main(String[] args) {
		Calc2 cl = new Calc2(42);
		go();
	}
	static void go() {
		//System.out.println(++r);
		double d = 0_1234.5_6;
		System.out.println(d);
		List one = new ArrayList();
		one.add("acb");
		List two = new ArrayList();
		two.add("acb");
		if (one == two) {
			System.out.println("a");
		}else if (one.equals(two)) {
			System.out.println("b");
		}else {
			System.out.println("c");
		}
	}
}
