package ml.brainin.calculator.action;

import ml.brainin.calculator.gui.label.IExpressionLabel;
import ml.brainin.calculator.gui.label.IOutputLabel;

public class Calculator implements ICalculator{
	private IOutputLabel iOutputLabel;
	@Override
	public void calculation(IExpressionLabel iExpressionLabel) throws NumberFormatException{
		String operator = null;
		String[] split = null;
		String expression = iExpressionLabel.getLable();
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
		System.out.println("split[0].trim()="+split[0].trim()+" split[1].trim()="+split[1].trim());
		MyNumber myNumber1 = (MyNumber) new MyNumber().parser(split[0].trim());
		MyNumber myNumber2 = (MyNumber) new MyNumber().parser(split[1].trim());
		MyNumber result = null;
		System.out.println("operator="+operator);
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
		System.out.println("result.getDenumerator()="+result.getDenumerator());
		resultStr = String.valueOf(((float)result.getNumerator()/(float)result.getDenumerator()));
		iExpressionLabel.setLabel("");
		this.iOutputLabel.setOutput(expression+"="+resultStr);
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
	@Override
	public void setOutputLabel(IOutputLabel iOutputLabel) {
		this.setiOutputLabel(iOutputLabel);
		
	}
	private IOutputLabel getiOutputLabel() {
		return iOutputLabel;
	}
	private void setiOutputLabel(IOutputLabel iOutputLabel) {
		this.iOutputLabel = iOutputLabel;
	}

}
