package ml.brainin;

import java.util.*;
import java.util.Scanner;

public class MeineAufgabe_02_2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		float price = 0;
		System.out.printf("Bitte geben die Stückzahl \t");
		count = sc.nextInt();
		System.out.printf("Bitte geben der Einzelpreis einer Ware  \t");
		price = (float)sc.nextInt();
		if (count > 50) {
			price *= 0.9f;
		}else if (count > 10) {
			price *= 0.95f;
		}
		float summ = count*price;
		System.out.print("Die Summa ist : "+summ);
		sc.close();
	}
}

