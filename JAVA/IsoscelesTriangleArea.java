package JAVA;
import java.util.Scanner;

public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the length of the equal sides: ");
        double side = scanner.nextDouble();

       
        double height = Math.sqrt(side * side - (base / 2) * (base / 2));

        
        double area = 0.5 * base * height;

        
        System.out.printf("The area of the isosceles triangle is: %.2f\n", area);

       
    }
}

