package ml.brainin.calculator;

import ml.brainin.calculator.gui.CalculatorGUI;

public class SimpleCalculator {
	
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		boolean down = false;
//		Calculator calculator = new Calculator();
//		while(!down) {
//			System.out.println("----------------------");
//			System.out.println("Geben Sie einen Ausdruk ain : ");
//			String expression = scanner.nextLine();
//			if (expression.isEmpty()  || expression.trim().equals("0")) {
//				down = true;
//				continue;
//			}
//			try {
//				calculator.calculation(expression);
//			}catch(NumberFormatException ex) {
//				System.out.println("Error : "+ex.getLocalizedMessage());
//			}
//			System.out.println("----------------------");
//		}
//		scanner.close();
//		System.out.println("Bye.");
//	}
}
