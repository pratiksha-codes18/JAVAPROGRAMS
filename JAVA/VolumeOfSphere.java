package JAVA;
import java.util.*;
public class VolumeOfSphere {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
								
			System.out.print("Enter the pi:");
			double pi = sc.nextDouble();
			System.out.print("Enter the radius:");
			double r = sc.nextDouble();
			
			double Volume =4/3*pi*r*r*r;
		System.out.print("Volume of Sphere is:"+Volume);
		}

}	

		
	


