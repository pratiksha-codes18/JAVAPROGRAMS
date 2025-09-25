package JAVA;
public class SwitchCase {
		    public static void main(String[] args) {
		        char operator = '-';
		        int a = 10, b = 5;
		        int result;

		        switch (operator) {
		            case '+':
		                result = a + b;
		                System.out.println("Addition: " + result);
		                break;
		            case '-':
		                result = a - b;
		                System.out.println("Subtraction: " + result);
		                break;
		            case '*':
		                result = a * b;
		                System.out.println("Multiplication: " + result);
		                break;
		            case '/':
		                if (b != 0) {
		                    result = a / b;
		                    System.out.println("Division: " + result);
		                } else {
		                    System.out.println("Division by zero is not allowed.");
		                }
		                break;
		            default:
		                System.out.println("Invalid operator.");
		        }
		    
	}

}
