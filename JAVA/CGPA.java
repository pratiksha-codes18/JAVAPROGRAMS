package JAVA;
import java.util.*;
public class CGPA {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the marks of first subject grades:");
	int sub1=sc.nextInt();
	
	System.out.println("Enter the marks of second subject  grades:");
	int sub2=sc.nextInt();
	
	System.out.println("Enter the marks third subject  grades:");
	int sub3=sc.nextInt();
	
	System.out.println("Enter the marks of fourth subject  grades:");
	int sub4=sc.nextInt();
	
	System.out.println("Enter the marks of fifth subject  grades:");
	int sub5=sc.nextInt();
	System.out.println("Enter the marks of sixth subject grades:");
	int sub6=sc.nextInt();
	
	System.out.println("Enter the marks of seventh subject grades:");
	int sub7=sc.nextInt();
	
	System.out.println("Enter the marks of eighth subject grades:");
	int sub8=sc.nextInt();
	
	
	float total=sub1+sub2+sub3+sub4+sub5+sub6+sub7+sub8;
	 float CGPA=total/8;
	System.out.println("The CGPA of student is:"+CGPA);
	float percentage = CGPA * 9.5f;
	System.out.printf("Percentage equivalent: %.2f%%\n", percentage);

	

	}

}
