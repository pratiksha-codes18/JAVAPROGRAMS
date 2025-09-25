package JAVA;
import java.util.Scanner;
public class CalculateDiscount {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the original price of the product: ");
 double originalPrice = scanner.nextDouble();
 System.out.print("Enter the discount percentage: ");
 double discountPercentage = scanner.nextDouble();
double discountAmount = (discountPercentage / 100) * originalPrice;
double finalPrice = originalPrice - discountAmount;
  System.out.println("Discount Amount: " + discountAmount);
		        System.out.println("Price after Discount: " + finalPrice);

		       
		    }
		

		}


