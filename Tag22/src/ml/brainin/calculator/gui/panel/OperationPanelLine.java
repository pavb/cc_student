package ml.brainin.calculator.gui.panel;

import javax.swing.JPanel;

import ml.brainin.calculator.action.ICalculator;
import ml.brainin.calculator.gui.button.KeypadButton;
import ml.brainin.calculator.gui.button.OperationButton;
import ml.brainin.calculator.gui.label.IExpressionLabel;

public class OperationPanelLine extends JPanel {

	private static final long serialVersionUID = 7974673493474614602L;
	
	private String[][] lables = {{"ABS","AC"},{"*",":"},{"+","-"},{"="}};

	public OperationPanelLine(IExpressionLabel iLable, ICalculator iCalculator, int index) {
		super();
		super.setLayout(new java.awt.GridLayout(1, 3, 10, 0));
		for (String lable : lables[index]) {
			OperationButton keyButton  = new OperationButton(lable, iLable, iCalculator);
			keyButton.setVisible(true);
			super.add(keyButton);
		}
		super.setVisible(true);
	}

}
