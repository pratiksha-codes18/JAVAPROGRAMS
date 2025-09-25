package JAVA;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the pi value");
		float pi=sc.nextFloat();
		System.out.println("Enter the radius");
		int r= sc. nextInt();
		 float area=pi*r*r;
		 System.out.println("The area of circle is:"+area);
	}

}
