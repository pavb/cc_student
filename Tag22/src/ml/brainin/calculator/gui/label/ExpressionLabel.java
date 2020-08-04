package ml.brainin.calculator.gui.label;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ExpressionLabel extends JLabel implements IExpressionLabel{
	private static final long serialVersionUID = -6375599259782809397L;

	public ExpressionLabel() {
		super();
		super.setBackground(new java.awt.Color(255, 255, 255));
		super.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		super.setHorizontalAlignment(SwingConstants.RIGHT);
		super.setBorder(BorderFactory.createEtchedBorder());
		super.setPreferredSize(new java.awt.Dimension(41, 64));
		super.setVisible(true);

	}

	@Override
	public void setLabel(String label) {
		super.setText(label);
	}

	@Override
	public String getLable() {
		return super.getText();
	}

}
