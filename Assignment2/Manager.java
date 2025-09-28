package Assignment2;
import java.util.*;
 class Employee {
int id;
String name;
float salary;
Employee(){
	id=0;
	name=null;
	salary=0;
	}
Scanner sc=new Scanner(System.in);
void accept() {
	System.out.println("enter id:");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name:");
	name=sc.nextLine();
	
	System.out.println("enter salary:");
	salary=sc.nextFloat();
	
	}
void display() {
	System.out.println("ID:"+id);
	System.out.println("NAME:"+name);
	System.out.println("SALARY:"+salary);
	
}

}
public class Manager extends Employee{
	private int bonus;
	void accept() {
		super.accept();
		System.out.println("Enter bonus:");
		bonus=sc.nextInt();
	}
	void display() {
		super.display();
		System.out.println("bonus:"+bonus);
	}
	float getTotalSalary() {
		return salary+bonus;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Employee:");
		int n=sc.nextInt();
		Manager M[]=new Manager[n];
		for(int i=0;i<n;i++) {
			M[i]=new Manager();
			System.out.println("Enter the deatails of Manager:"+(i+1));
			M[i].accept();
			
		}
		for(int i=0;i<n;i++) {
			//M[i]=new Manager();
			System.out.println("display  the deatails of Manager:"+(i+1));
			M[i].display();
		}
		int MaxIndex=0;
		for(int i=1;i<n;i++) {
			if(M[i].getTotalSalary()>M[MaxIndex].getTotalSalary()) {
				MaxIndex=i;
			}
		}
		
		System.out.println("The manager with maximum salary:");
		M[MaxIndex].display();
	}
}


	
	