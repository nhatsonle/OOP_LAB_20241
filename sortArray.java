package demo;
import java.util.Arrays;
import java.util.Scanner;
public class sortArray {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Nhập kích thước của mảng: ");
	        int size = scanner.nextInt();

	     
	        int[] array = new int[size];

	        
	        System.out.println("Nhập các phần tử của mảng:");
	        for (int i = 0; i < size; i++) {
	            
	            array[i] = scanner.nextInt();
	        }
        
        Arrays.sort(array);
        
        double sum = 0;
        for (int i : array)
        {
        	sum += i;
        }
        double avg = sum / size;
        System.out.println("Sum is "+ (int)sum);
        System.out.println("Average value is "+ avg);
        
        System.out.println(Arrays.toString(array));
    }
}
