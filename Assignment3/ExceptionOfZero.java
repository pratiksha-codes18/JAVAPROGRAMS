package Assignment3;
import java.util.Scanner;
class NumberIsZeroException extends Exception {
    NumberIsZeroException(String msg) { super(msg); }
}

public class ExceptionOfZero {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

		        try {
		            System.out.print("Enter a number: ");
		            int num = sc.nextInt();

		            if (num == 0) throw new NumberIsZeroException("Number is 0");

		            if (num == 1) {
		                System.out.println("1 is Not Prime");
		            } else {
		                int i;
		                for (i = 2; i <= num / 2; i++) {
		                    if (num % i == 0) break; // not prime
		                }

		                if (i > num / 2) {
		                    System.out.println(num + " is Prime");
		                } else {
		                    System.out.println(num + " is Not Prime");
		                }
		            }

		        } catch (NumberIsZeroException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }
		

		
		
		
		
		
		

	
	
	
	}

