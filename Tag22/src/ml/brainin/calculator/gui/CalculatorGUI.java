package ml.brainin.calculator.gui;

import java.awt.Toolkit;

import javax.swing.*;

import javax.swing.JOptionPane;

import ml.brainin.calculator.action.Calculator;

/**
 *
 * @author deb@ck
 */
public class CalculatorGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6911467069854673724L;
	private String[] operators = {"+","-",":","*"};
	private Calculator calculator;

	public CalculatorGUI() {
        initComponents();
        Toolkit myToolKit =Toolkit.getDefaultToolkit();
        int screenWidth=myToolKit.getScreenSize().width;
        int screenHeight=myToolKit.getScreenSize().height;
        int frameWidth = 426;
        int frameHeight = 396;
        setBounds((screenWidth-frameWidth)/2, (screenHeight-frameHeight)/2, frameWidth, frameHeight);
        calculator  = new Calculator();
    }
    
    private void calculation() {
    	try {
    		String expression = lExpression.getText();
    		if (!expression.isEmpty()) {
    			String result = calculator.calculation(expression);
    			if (result == null) {
    				lResult.setText("");
    			}else {
    				lResult.setText(expression+" = "+result);
    			}
    			lExpression.setText(result);
    		}
		}catch(NumberFormatException ex) {
			showInputError("Error : "+ex.getLocalizedMessage());
		}
    }
    private boolean isHasOperator(String chr) {
    	String expression = lExpression.getText();
    	boolean has = false;
    	for (int i = 0; i < operators.length; i++) {
    		if (expression.contains(operators[i])) {
    			has = true;
    			break;
    		}
    	}
    	return has;
    }
    private void showInputError(String message){
        JOptionPane.showMessageDialog(this, message, "Error",
        JOptionPane.ERROR_MESSAGE);
    }
    private void addChar(String chr) {
        lExpression.setText(lExpression.getText()+ chr);        
	}
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

    	JPanel jPanel1 = new JPanel();
    	JPanel jPanel13 = new JPanel();
        lResult = new JLabel();
        lExpression = new JLabel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel5 = new JPanel();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        JPanel jPanel6 = new JPanel();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JPanel jPanel7 = new JPanel();
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JPanel jPanel8 = new JPanel();
        JButton b0 = new JButton();
        JButton bPoint = new JButton();
        JButton bPlusMinus = new JButton();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel9 = new JPanel();
        JButton bBS = new JButton();
        JButton bAC = new JButton();
        JPanel jPanel10 = new JPanel();
        JButton bMultiplication = new JButton();
        JButton bDivision = new JButton();
        JPanel jPanel11 = new JPanel();
        JButton bAddition = new JButton();
        JButton bSubstraction = new JButton();
        JPanel jPanel12 = new JPanel();
        JButton bCalculation = new JButton();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(326, 396));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel13.setLayout(new java.awt.BorderLayout());

        lResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lResult.setHorizontalAlignment(SwingConstants.RIGHT);
        lResult.setPreferredSize(new java.awt.Dimension(41, 56));
        jPanel13.add(lResult, java.awt.BorderLayout.PAGE_START);

        lExpression.setBackground(new java.awt.Color(255, 255, 255));
        lExpression.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lExpression.setHorizontalAlignment(SwingConstants.RIGHT);
        lExpression.setBorder(BorderFactory.createEtchedBorder());
        lExpression.setPreferredSize(new java.awt.Dimension(41, 64));
        jPanel13.add(lExpression, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 306));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 10, 10));

        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("7");        
            }
        });
        jPanel5.add(b7);

        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("8");        
            }
        });
        jPanel5.add(b8);

        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("8");        
            }
        });
        jPanel5.add(b9);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("4");        
            }
        });
        jPanel6.add(b4);

        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("5");        
            }
        });
        jPanel6.add(b5);

        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("6");        
            }
        });
        jPanel6.add(b6);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("1");        
            }
        });
        jPanel7.add(b1);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("2");        
            }
        });
        jPanel7.add(b2);

        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("3");        
            }
        });
        jPanel7.add(b3);

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        b0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChar("8");        
            }
        });
        jPanel8.add(b0);

        bPoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPoint.setText(".");
        bPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPointActionPerformed(evt);
            }
        });
        jPanel8.add(bPoint);

        bPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPlusMinus.setText("+/-");
        bPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusMinusActionPerformed(evt);
            }
        });
        jPanel8.add(bPlusMinus);

        jPanel3.add(jPanel8);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jPanel9.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        bBS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bBS.setText("BS");
        bBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String number = lExpression.getText();
                number = number.length()-1 > 0? number.substring(0, number.length()-1):"";
                lExpression.setText(number);        
            }
        });
        jPanel9.add(bBS);

        bAC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAC.setText("AC");
        bAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lExpression.setText("");        
            }
        });
        jPanel9.add(bAC);

        jPanel4.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        bMultiplication.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMultiplication.setText("*");
        bMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (isHasOperator("*")) {
            		calculation();
            	}
                lExpression.setText(lExpression.getText()+"*");    
            }
        });
        jPanel10.add(bMultiplication);

        bDivision.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDivision.setText(":");
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (isHasOperator(":")) {
            		calculation();
            	}
                lExpression.setText(lExpression.getText()+":");    
            }
        });
        jPanel10.add(bDivision);

        jPanel4.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        bAddition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAddition.setText("+");
        bAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (isHasOperator("+")) {
            		calculation();
            	}
                lExpression.setText(lExpression.getText()+"+");    
            }
        });
        jPanel11.add(bAddition);

        bSubstraction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSubstraction.setText("-");
        bSubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (isHasOperator("-")) {
            		calculation();
            	}
                lExpression.setText(lExpression.getText()+"-");    
            }
        });
        jPanel11.add(bSubstraction);

        jPanel4.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        bCalculation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCalculation.setText("=");
        bCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculation();
            }
        });
        jPanel12.add(bCalculation);

        jPanel4.add(jPanel12);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        super.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    }                  

    private void bPointActionPerformed(java.awt.event.ActionEvent evt) {                                       
        lExpression.setText(lExpression.getText()+ ".");        
    }                                      

    private void bPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String number = lExpression.getText();
        lExpression.setText(number);        
    }                                          



    private JLabel lExpression;
    private JLabel lResult;
}
