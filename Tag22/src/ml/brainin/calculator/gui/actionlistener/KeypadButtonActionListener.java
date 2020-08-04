package ml.brainin.calculator.gui.actionlistener;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ml.brainin.calculator.action.ICalculator;
import ml.brainin.calculator.gui.button.IKeypadButton;
import ml.brainin.calculator.gui.label.IExpressionLabel;

public class KeypadButtonActionListener implements ActionListener {
	private IExpressionLabel iExpressionLabel;
	private ICalculator iCalculator;
	private String[] operators = {"+","-",":","*"};
	public KeypadButtonActionListener(IExpressionLabel iLabel) {
		this.setiExpressionLabel(iLabel);
	}
	public KeypadButtonActionListener(IExpressionLabel iLabel, ICalculator iCalculator) {
		this.setiExpressionLabel(iLabel);
		this.setiCalculator(iCalculator);
	}

	private void setiCalculator(ICalculator iCalculator) {
		this.iCalculator = iCalculator;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String chr = ((IKeypadButton)e.getSource()).getLabel();
		if (iCalculator == null) {
			this.getiExpressionLabel().setLabel(this.getiExpressionLabel().getLable()+chr);
		}else {
			if("=".equals(chr)) {
				calculation();
			}else if("AC".equals(chr)) {
				this.getiExpressionLabel().setLabel("");
			}else if("ABS".equals(chr)) {
				String expression = this.getiExpressionLabel().getLable();
				if (expression.length()-1>0) {
					this.getiExpressionLabel().setLabel(expression.substring(0, expression.length()-1));
				}
			}else {
            	if (isHasOperator(chr)) {
            		calculation();
            	}
            	this.getiExpressionLabel().setLabel(this.getiExpressionLabel().getLable()+chr);    

			}
		}
	}
	private void calculation() {
		try {
			iCalculator.calculation(this.getiExpressionLabel());
		}catch(NumberFormatException nfe) {
			showInputError(nfe.getLocalizedMessage());
		}
	}
	
	private void showInputError(String message){
        JOptionPane.showInputDialog(new Frame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
    }

    private boolean isHasOperator(String chr) {
    	String expression = this.getiExpressionLabel().getLable();
    	boolean has = false;
    	for (int i = 0; i < operators.length; i++) {
    		if (expression.contains(operators[i])) {
    			has = true;
    			break;
    		}
    	}
    	return has;
    }

	private IExpressionLabel getiExpressionLabel() {
		return iExpressionLabel;
	}

	private void setiExpressionLabel(IExpressionLabel iLabel) {
		this.iExpressionLabel = iLabel;
	}

}
