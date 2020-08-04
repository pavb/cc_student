package ml.brainin.calculator.gui.panel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ml.brainin.calculator.gui.label.ExpressionLabel;
import ml.brainin.calculator.gui.label.OutputLabel;

public class DisplayPanel extends JPanel {

	private static final long serialVersionUID = 2813757829833502405L;
    private ExpressionLabel lExpression;
	private OutputLabel lOutput;

	public DisplayPanel() {
		super();
		super.setBackground(new java.awt.Color(255, 255, 255));
		super.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		super.setLayout(new java.awt.BorderLayout());
		lExpression = new ExpressionLabel();
		lOutput = new OutputLabel();
        super.add(lOutput, java.awt.BorderLayout.PAGE_START);
        super.add(lExpression, java.awt.BorderLayout.CENTER);
        super.setVisible(true);
	}
    public ExpressionLabel getlExpression() {
		return lExpression;
	}
	public OutputLabel getlOutput() {
		return lOutput;
	}
}
