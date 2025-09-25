package JAVA;
import java.util.Scanner;
public class AcendingDescending {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter starting number: ");
	        int start = sc.nextInt();

	        System.out.print("Enter ending number: ");
	        int end = sc.nextInt();

	        System.out.println("\nAscending Order:");
	        for (int i = start; i <= end; i++) {
	            System.out.print(i + " ");
	        }

	        System.out.println("\n\nDescending Order:");
	        for (int i = end; i >= start; i--) {
	            System.out.print(i + " ");
	        }

	       
	    }
	}


