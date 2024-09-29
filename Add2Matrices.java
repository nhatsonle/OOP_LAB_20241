package demo;
import java.util.Scanner;
public class Add2Matrices {
	public static void main(String args[])
	{
		
	        Scanner keyboard = new Scanner(System.in);

	     
	        System.out.print("Enter the number of rows: ");
	        int rows = keyboard.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int cols = keyboard.nextInt();

	        
	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];
	        int[][] matrix3 = new int[rows][cols];

	        System.out.println("Enter the elements of the matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix1[i][j] = keyboard.nextInt();
	            }
	        }
	        
	        System.out.println("Enter the elements of the matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix2[i][j] = keyboard.nextInt();
	            }
	        }
	        

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        
	        System.out.println("The matrix 1 is:");
	        for (int i = 0; i < rows; i++)
	        {
	        	for(int j = 0; j < cols; j++)
	        	{
	        		System.out.print(matrix1[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        
	        System.out.println("The matrix 2 is:");
	        for (int i = 0; i < rows; i++)
	        {
	        	for(int j = 0; j < cols; j++)
	        	{
	        		System.out.print(matrix2[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        
	        System.out.println("The sum of 2 matrices is:");
	        for (int i = 0; i < rows; i++)
	        {
	        	for(int j = 0; j < cols; j++)
	        	{
	        		System.out.print(matrix3[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        
	        keyboard.close();
	    }
}

