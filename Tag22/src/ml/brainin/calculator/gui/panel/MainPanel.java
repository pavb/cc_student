package ml.brainin.calculator.gui.panel;


import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ml.brainin.calculator.action.Calculator;
import ml.brainin.calculator.action.ICalculator;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainPanel() {
		super();
		super.setBorder(BorderFactory.createEtchedBorder());
		super.setPreferredSize(new java.awt.Dimension(340, 306));
		super.setLayout(new java.awt.BorderLayout());
		
		DisplayPanel displayPanel = new DisplayPanel();
		super.add(displayPanel, java.awt.BorderLayout.NORTH);
        Calculator calculator  = new Calculator();
        calculator.setOutputLabel(displayPanel.getlOutput());
		
		KeypadPanel keypadPanel = new KeypadPanel(displayPanel.getlExpression());
		keypadPanel.setVisible(true);
		super.add(keypadPanel, java.awt.BorderLayout.WEST);
		
		OperationPanel operationPanel = new OperationPanel(displayPanel.getlExpression(), calculator);
		operationPanel.setVisible(true);
		super.add(operationPanel, java.awt.BorderLayout.CENTER);
		
		super.setVisible(true);
	}

}
