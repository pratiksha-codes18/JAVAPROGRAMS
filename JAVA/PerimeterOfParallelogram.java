package JAVA;

import java.util.Scanner;

public class PerimeterOfParallelogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side:");
		float a=sc.nextFloat();
		System.out.print("Enter the base:");
		float b=sc.nextFloat();
		float Perimeter=2*(a+b);
		System.out.print("The perimeter of parallelogram is:"+Perimeter);
	}

}
