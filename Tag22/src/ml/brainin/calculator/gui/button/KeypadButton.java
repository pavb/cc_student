package ml.brainin.calculator.gui.button;

import javax.swing.JButton;

import ml.brainin.calculator.gui.actionlistener.KeypadButtonActionListener;
import ml.brainin.calculator.gui.label.IExpressionLabel;

public class KeypadButton extends JButton implements IKeypadButton{

	private static final long serialVersionUID = -2778024226899655117L;

	public KeypadButton(String text, IExpressionLabel iExpressionLabel) {
		super(text);
		super.addActionListener(new KeypadButtonActionListener(iExpressionLabel));
		super.setFont(new java.awt.Font("Tahoma", 1, 18)); 
		super.setVisible(true);
	}
	@Override
	public String getLabel() {
		return this.getText();
	}

}
