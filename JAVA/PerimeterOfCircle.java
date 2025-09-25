package JAVA;
import java.util.*;
public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of pi:");
		float pi=sc.nextFloat();
		System.out.print("Enter the radius:");
		float r=sc.nextFloat();
		float Perimeter=2*pi*r;
		System.out.print("The perimeter of circle is:"+Perimeter);
	}

}