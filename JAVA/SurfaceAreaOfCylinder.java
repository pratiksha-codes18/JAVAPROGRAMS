package JAVA;

import java.util.Scanner;

public class SurfaceAreaOfCylinder {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of pi:");
double pi = sc.nextDouble();
		
		System.out.print("Enter the radius:");
		        double r = sc.nextDouble();
		        System.out.print("Enter the height:");
		        double h = sc.nextDouble();


		        
		        
		 double TSA=2*pi*r*(r+h);
		 System.out.print("The total surtface area of cylinder:"+TSA);
				
	}

}
