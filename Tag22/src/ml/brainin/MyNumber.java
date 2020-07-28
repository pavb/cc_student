package ml.brainin;

public class MyNumber {
	private int numerator; // Zähler
	private int denumerator; //  Nenner
	private boolean hasPoint; // Dezimalzahl 
	private boolean hasSlash;
	public MyNumber() {}
	public MyNumber(int numerator, int denumerator ) {
		this.setNumerator(numerator);
		this.setDenumerator(denumerator);
	}
	
	public MyNumber parser(String number) throws NumberFormatException{
		try {
			int num = Integer.parseInt(number); // ganze Zahl
			this.setNumerator(num);
			this.setDenumerator(1);
			return this;
		}catch(NumberFormatException en) {
		}
		if ((!number.contains("/") && !number.contains(".")) || (number.contains("/") && number.contains("."))) {
			throw new NumberFormatException("Fehler beim eingeben einer Zahl : "+number);
		}
		if (number.contains("_")) {
			number = number.replace("_", "");
		}
		char[] chrs = number.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = chrs.length-1; i>=0; i--) {
			char c = chrs[i];
			if (Character.isDigit(c)) {
				sb.insert(0, c);
			}else if (c == '.' || c == '/') {
				if (hasPoint() || hasSlash()) {
					throw new NumberFormatException("Fehler beim eingeben einer Zahl : "+number);
				}
				if (c == '.') {
					setHasPoint();
					setNumerator(Integer.parseInt(sb.toString()));
					setDenumerator((int)Math.pow(10,sb.length()));
					sb.setLength(0);
				}else {
					setHasSlash();
					setDenumerator(Integer.parseInt(sb.toString()));
					sb.setLength(0);
				}
			}else {
				throw new NumberFormatException("Fehler beim eingeben einer Zahl : "+number);
			}
		}
		if (sb.length() != 0) {
			int num = Integer.parseInt(sb.toString());
			if (hasPoint()) {
				setNumerator((num* getDenumerator()+getNumerator()));
			}else {
				setNumerator(num);
			}
		}
		return this;
	}
	public String toString() {
		return getNumerator()+(getDenumerator()>1?"/":"")+ getDenumerator();
	}
	
	private boolean hasSlash() {
		return hasSlash;
	}
	private void setHasSlash() {
		this.hasSlash = true;
	}
	private boolean hasPoint() {
		return hasPoint;
	}
	private void setHasPoint() {
		this.hasPoint = true;
	}
	private void setNumerator(int n) {
		this.numerator = n;
	}
	private void setDenumerator(int d) {
		if (d == 0) {
			throw new NumberFormatException("Fehler beim denumerator : 0");
		}
		this.denumerator = d;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenumerator() {
		return denumerator;
	}
	
	
}
