package ml.brainin.calculator.gui.panel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ml.brainin.calculator.action.ICalculator;
import ml.brainin.calculator.gui.label.IExpressionLabel;

public class OperationPanel extends JPanel {

	private static final long serialVersionUID = 7974673493474614602L;
	
	public OperationPanel(IExpressionLabel iLable, ICalculator iCalculator) {
		super();
        super.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        super.setLayout(new java.awt.GridLayout(4, 1, 10, 10));
        for (int index = 0; index < 4;index++) {
        	OperationPanelLine operationPanelLine = new OperationPanelLine(iLable, iCalculator, index);
        	operationPanelLine.setVisible(true);
        	super.add(operationPanelLine);
        }
        super.setVisible(true);
	}

}
