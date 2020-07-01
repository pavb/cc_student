package aufgaben;

public class Sum {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Summe der bisher addierten ganzen Zahlen
		int sum;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		
		// Array von Werten, bis zu die summiert wird

		int[] bi = new int[6];
		bi[0] = 1;
		bi[1] = 2;
		bi[2] = 3;
		bi[3] = 4;
		bi[4] = 5;
		bi[5] = 10;
		for (int i = 0; i < bi.length; i++) {
			sum = 1;
			counter = 1;
			while (counter <= bi[i]) {
				sum = sum  + counter;
				counter = counter + 1;
			}
			// Ausgeben der Multiplikation, gemeinsam mit erläuterndem Text
			System.out.print("Die Summe der Zahlen von 1 bis ");
			System.out.print(bi[i]);
			System.out.print(" ist ");
			System.out.println(sum);
		}
	}
}
