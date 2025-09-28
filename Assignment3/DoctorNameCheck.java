package Assignment3;
import java.util.Scanner;


//User-defined Exception
class NameInvalidException extends Exception {
 public NameInvalidException(String message) {
     super(message);
 }
}

public class DoctorNameCheck {
 // Method to validate name
 public static void validateName(String name) throws NameInvalidException {
     // Regex: only alphabets and spaces allowed
     if (!name.matches("[a-zA-Z ]+")) {
         throw new NameInvalidException("Name is Invalid");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Doctor Name: ");
     String doctorName = sc.nextLine();

     try {
         validateName(doctorName);
         System.out.println("Valid Doctor Name: " + doctorName);
     } catch (NameInvalidException e) {
         System.out.println(e.getMessage());
     }
     
     sc.close();
 }
}




