package example;
import javax.swing.JOptionPane;
public class basicCalculation {
	public static void main(String[] args) {
//A program to calculate sum, difference, product, and quotient of 2 double numbers which
//are entered by users.
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		double diff = num1 - num2;
		double product = num1 * num2;
		double quot = 0;
       if(num2 != 0){
           quot = num1 / num2;
           JOptionPane.showMessageDialog(null, "Quotient is: " + quot);           
       }
       else
       {
       	JOptionPane.showMessageDialog(null, "Divisor = 0. Errow when perform division");
       }
		
		JOptionPane.showMessageDialog(null, "Sum is: " + sum);
		JOptionPane.showMessageDialog(null, "Difference is: " + diff);
		JOptionPane.showMessageDialog(null, "Product is: " + product);
		}
}
