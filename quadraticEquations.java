import javax.swing.JOptionPane;
public class quadraticEquations {

	public static void main(String[] args)
 {
	

		String strNum1, strNum2,strNum3;
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first coefficient: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second coefficient: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(strNum2);
		
		strNum3 = JOptionPane.showInputDialog(null,
				"Please input the third coefficient: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double c = Double.parseDouble(strNum3);
		double result = 0;
		
		if(a == 0)
		{
			if(b == 0) {
				JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem");
				System.exit(0);
			}
			if(b != 0)
			{
				result = -c/b;
				JOptionPane.showMessageDialog(null, "x is: " + result);
				System.exit(0);
			}
			
		}
		
		double delta = b*b - 4*a*c;
		if(delta > 0) {
			double x1 =(-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			JOptionPane.showMessageDialog(null, "x1 is: " + x1);
			JOptionPane.showMessageDialog(null, "x2 is: " + x2);
			System.exit(0);
		}
		if(delta == 0)
		{
			result = -b  / (2*a);
			JOptionPane.showMessageDialog(null, "x is: " + result);
			System.exit(0);
		}
		if(delta < 0)
		{
			JOptionPane.showMessageDialog(null, "Function produces no solution");
			System.exit(0);
		}
		
		
	}		
}
