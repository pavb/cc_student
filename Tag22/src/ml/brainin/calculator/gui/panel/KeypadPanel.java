package ml.brainin.calculator.gui.panel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ml.brainin.calculator.gui.label.IExpressionLabel;

public class KeypadPanel extends JPanel {

	private static final long serialVersionUID = 7974673493474614602L;
	
	public KeypadPanel(IExpressionLabel iLabel) {
		super();
        super.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        super.setLayout(new java.awt.GridLayout(4, 1, 10, 10));
        for (int index = 0; index < 4;index++) {
        	KeypadPanelLine keypadPanelLine = new KeypadPanelLine(iLabel, index);
        	keypadPanelLine.setVisible(true);
        	super.add(keypadPanelLine);
        }
        super.setVisible(true);
	}

}
