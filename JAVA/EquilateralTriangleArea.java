package JAVA;
import java.util.*;
public class EquilateralTriangleArea {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side:");
	double side=sc.nextDouble();
	double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
	System.out.println("The area of Equilateral triangle is:"+area);
	
	}

}
