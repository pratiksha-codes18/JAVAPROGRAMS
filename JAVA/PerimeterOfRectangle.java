package JAVA;
import java.util.*;
public class PerimeterOfRectangle {
	
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the length:");
			float l=sc.nextFloat();
			System.out.print("Enter the width:");
			float w=sc.nextFloat();
			float Perimeter=2*(l+w);
			System.out.print("The perimeter of Rectangle"
					+ ""
					+ " is:"+Perimeter);
		}

	}

