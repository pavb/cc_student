package ml.brainin.calculator.gui.frame;

import java.awt.Toolkit;

import javax.swing.*;

import javax.swing.JOptionPane;

import ml.brainin.calculator.action.Calculator;
import ml.brainin.calculator.action.ICalculator;
import ml.brainin.calculator.gui.panel.MainPanel;

/**
 *
 * @author deb@ck
 */
public class CalculatorMainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6911467069854673724L;

	public CalculatorMainFrame() {
        initComponents();
        Toolkit myToolKit =Toolkit.getDefaultToolkit();
        int screenWidth=myToolKit.getScreenSize().width;
        int screenHeight=myToolKit.getScreenSize().height;
        int frameWidth = 426;
        int frameHeight = 396;
        setBounds((screenWidth-frameWidth)/2, (screenHeight-frameHeight)/2, frameWidth, frameHeight);
    }
    
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(326, 396));
        MainPanel mainPanel = new MainPanel();
        mainPanel.setVisible(true);
        super.getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);
    }                  

}
