package JAVA;
import java.util.*;
public class ParallelogramArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the length of the equal sides: ");
        double height = sc.nextDouble();

       
       
        
        double area = base * height;
System.out.print("Area of Parallelogram is:"+area);
	}

}
