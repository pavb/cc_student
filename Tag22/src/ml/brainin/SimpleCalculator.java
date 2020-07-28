package ml.brainin;

import java.util.Scanner;

class Calculator {
	public void calculation(String expression) throws NumberFormatException{
		String operator = null;
		String[] split = null;
		if (expression.contains("*")) {
			operator = "*";
			split = expression.split("\\*");
		}else if (expression.contains(":")) {
			operator = ":";
			split = expression.split("\\:");
		}else if (expression.contains("+")) {
			operator = "+";
			split = expression.split("\\+");
		}else if (expression.contains("-")) {
			operator = "-";
			split = expression.split("\\-");
		}
		if (split == null || split.length >2) {
			for (String str:split) {
				System.out.println(str);
			}
			throw new NumberFormatException("Fehler beim eingeben einen Ausdruck : "+expression);
		}
		MyNumber myNumber1 = (MyNumber) new MyNumber().parser(split[0].trim());
		MyNumber myNumber2 = (MyNumber) new MyNumber().parser(split[1].trim());
		MyNumber result = null;
		if (operator.equals("*")) {
			result = multiplication(myNumber1, myNumber2);
		}else if (operator.equals(":")) {
			result = division(myNumber1, myNumber2);
		}else if (operator.equals("+")) {
			result = addition(myNumber1, myNumber2);
		}else if (operator.equals("-")) {
			result = subtraction(myNumber1, myNumber2);
		}
		System.out.println(expression+" = "+result);
	}
	private MyNumber multiplication(MyNumber myNumber1, MyNumber myNumber2) {
		int numerator = myNumber1.getNumerator() * myNumber2.getNumerator();
		int denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber division(MyNumber myNumber1, MyNumber myNumber2) {
		int numerator = myNumber1.getNumerator() * myNumber2.getDenumerator();
		int denumerator = myNumber1.getDenumerator() * myNumber2.getNumerator();
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber addition(MyNumber myNumber1, MyNumber myNumber2) {
		int numerator = 0;
		int denumerator = 0;
		if (myNumber1.getDenumerator() != myNumber2.getDenumerator()) {
			numerator = (myNumber1.getNumerator() * myNumber2.getDenumerator()) + (myNumber2.getNumerator() * myNumber1.getDenumerator());
			denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		}else {
			denumerator = myNumber1.getDenumerator();
		}
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber subtraction(MyNumber myNumber1, MyNumber myNumber2) {
		int numerator = 0;
		int denumerator = 0;
		if (myNumber1.getDenumerator() != myNumber2.getDenumerator()) {
			numerator = (myNumber1.getNumerator() * myNumber2.getDenumerator()) - (myNumber2.getNumerator() * myNumber1.getDenumerator());
			denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		}else {
			denumerator = myNumber1.getDenumerator();
		}
		return new MyNumber(numerator, denumerator); 
	}
}
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