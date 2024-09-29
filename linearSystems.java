
import java.util.Scanner;
public class linearSystems {

	public static void main(String[] args) {

		
		        Scanner keyboard = new Scanner(System.in);

		        
		        System.out.println("Enter coefficients a11, a12, b1 for the first equation a11 * x1 + a12 * x2 = b1: ");
		        double a11 = keyboard.nextDouble();
		        double a12 = keyboard.nextDouble();
		        double b1 = keyboard.nextDouble();

		        System.out.println("Enter coefficients a21, a22, b2 for the second equation a21 * x1 + a22 * x2 = b2: ");
		        double a21 = keyboard.nextDouble();
		        double a22 = keyboard.nextDouble();
		        double b2 = keyboard.nextDouble();

		       
		        double D = (a11 * a22) - (a21 * a12);
		        double D1 = (b1 * a22) - (b2 * a12);
		        double D2 = (a11 * b2) - (a21 * b1);

		       
		        if (D != 0) {
		          
		            double x1 = D1 / D;
		            double x2 = D2 / D;
		            System.out.println("The system has a unique solution:");
		            System.out.println("x1 = " + x1);
		            System.out.println("x2 = " + x2);
		        } 
		        else 
		        {
		            if (D1 == 0 && D2 == 0)
		            {
		                System.out.println("The system has infinitely many solutions.");
		            } 
		            else 
		            {
		                System.out.println("The system has no solution.");
		            }
		        }

		        keyboard.close();
		    }
		}
