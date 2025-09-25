package JAVA;
import java.util.*;
public class VolumeOfCylinder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
						
	System.out.print("Enter the pi:");
	double pi = sc.nextDouble();
	System.out.print("Enter the radius:");
	double r = sc.nextDouble();
	System.out.print("Enter the height:");
	double h = sc.nextDouble();
	double Volume =pi*r*r*h;
System.out.print("Volume of Cylinder is:"+Volume);
}

}
