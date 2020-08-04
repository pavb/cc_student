package ml.brainin.calculator.gui.panel;

import javax.swing.JPanel;

import ml.brainin.calculator.gui.button.KeypadButton;
import ml.brainin.calculator.gui.label.IExpressionLabel;

public class KeypadPanelLine extends JPanel {

	private static final long serialVersionUID = 7974673493474614602L;
	
	private String[][] lables = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"0",".","+/-"}};

	public KeypadPanelLine(IExpressionLabel iLabel, int index) {
		super();
		super.setLayout(new java.awt.GridLayout(1, 3, 10, 0));
		for (String lable : lables[index]) {
			KeypadButton keyButton  = new KeypadButton(lable, iLabel);
			keyButton.setVisible(true);
			super.add(keyButton);
		}
		super.setVisible(true);
	}

}
