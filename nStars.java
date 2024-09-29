package ex3;
import java.util.Scanner;
public class nStars {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
		}
	}
}
