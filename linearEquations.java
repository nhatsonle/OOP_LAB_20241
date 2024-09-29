import javax.swing.JOptionPane;
public class linearEquations {


	public static void main(String[] args)
 {
//The first-degree equation (linear equation) with one variable
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first coefficient: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second coefficient: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(strNum2);
		
		if(a != 0)
		{
			double result = -b/a;
			JOptionPane.showMessageDialog(null, "x is: " + result);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem");
		}
		
		}
}
