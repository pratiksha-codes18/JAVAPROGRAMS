package JAVA;
import java.util.*;
public class RhombusArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the p:");
		float p=sc.nextFloat();
		System.out.print("Enter the q:");
		float q=sc.nextFloat();
		float area=p*q/2;
		System.out.print("Area of Rhombus is:"+area);
	}

}
