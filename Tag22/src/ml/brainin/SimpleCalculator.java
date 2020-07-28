package ml.brainin;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean down = false;
		Calculator calculator = new Calculator();
		while(!down) {
			System.out.println("----------------------");
			System.out.println("Geben Sie einen Ausdruk ain : ");
			String expression = scanner.nextLine();
			if (expression.isEmpty()  || expression.trim().equals("0")) {
				down = true;
				continue;
			}
			try {
				calculator.calculation(expression);
			}catch(NumberFormatException ex) {
				System.out.println("Error : "+ex.getLocalizedMessage());
			}
			System.out.println("----------------------");
		}
		scanner.close();
		System.out.println("Bye.");
	}
}
