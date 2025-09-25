package JAVA;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		        
		        System.out.print("Enter the number of units consumed: ");
		        int units = scanner.nextInt();

		        double billAmount = 0;

		        
		        if (units <= 100) {
		            billAmount = units * 10; 
		        } else if (units <= 200) {
		            billAmount = (100 * 10) + ((units - 100) * 15); 
		        } else if (units <= 300) {
		            billAmount = (100 * 10) + (100 * 15) + ((units - 200) * 20); 
		        } else {
		            billAmount = (100 * 10) + (100 * 15) + (100 * 20) + ((units - 300) * 25); 
		        }

		        
		        System.out.println("Electricity Bill Amount: Rs. " + billAmount);

		        
		    }
		}
	


