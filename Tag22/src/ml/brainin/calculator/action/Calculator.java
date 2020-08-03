package ml.brainin.calculator.action;

public class Calculator {
	public String calculation(String expression) throws NumberFormatException{
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
		String resultStr = null;
		if (result.getDenumerator()%10==0) {
			resultStr = String.valueOf(((float)result.getNumerator()/(float)result.getDenumerator()));
		}else {
			resultStr = result.toString();
		}
		return resultStr;
	}
	private MyNumber multiplication(MyNumber myNumber1, MyNumber myNumber2) {
		float numerator = myNumber1.getNumerator() * myNumber2.getNumerator();
		float denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber division(MyNumber myNumber1, MyNumber myNumber2) {
		float numerator = myNumber1.getNumerator() * myNumber2.getDenumerator();
		float denumerator = myNumber1.getDenumerator() * myNumber2.getNumerator();
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber addition(MyNumber myNumber1, MyNumber myNumber2) {
		float numerator = 0;
		float denumerator = 0;
		if (myNumber1.getDenumerator() != myNumber2.getDenumerator()) {
			numerator = (myNumber1.getNumerator() * myNumber2.getDenumerator()) + (myNumber2.getNumerator() * myNumber1.getDenumerator());
			denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		}else {
			denumerator = myNumber1.getDenumerator();
		}
		return new MyNumber(numerator, denumerator); 
	}
	private MyNumber subtraction(MyNumber myNumber1, MyNumber myNumber2) {
		float numerator = 0;
		float denumerator = 0;
		if (myNumber1.getDenumerator() != myNumber2.getDenumerator()) {
			numerator = (myNumber1.getNumerator() * myNumber2.getDenumerator()) - (myNumber2.getNumerator() * myNumber1.getDenumerator());
			denumerator = myNumber1.getDenumerator() * myNumber2.getDenumerator();
		}else {
			denumerator = myNumber1.getDenumerator();
		}
		return new MyNumber(numerator, denumerator); 
	}
}
