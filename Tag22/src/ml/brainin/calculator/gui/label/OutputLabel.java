package ml.brainin.calculator.gui.label;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OutputLabel extends JLabel implements IOutputLabel{
	private static final long serialVersionUID = -6375599259782809732L;

	public OutputLabel() {
		super();
		super.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		super.setHorizontalAlignment(SwingConstants.RIGHT);
		super.setPreferredSize(new java.awt.Dimension(41, 56));
		super.setVisible(true);
	}

	@Override
	public void setOutput(String output) {
		super.setText(output);
	}


}
