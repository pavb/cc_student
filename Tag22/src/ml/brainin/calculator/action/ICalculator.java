package ml.brainin.calculator.action;

import ml.brainin.calculator.gui.label.IExpressionLabel;
import ml.brainin.calculator.gui.label.IOutputLabel;

public interface ICalculator {
	void calculation(IExpressionLabel iExpressionLabel) throws NumberFormatException;
	void setOutputLabel(IOutputLabel iOutputLabel);
}
