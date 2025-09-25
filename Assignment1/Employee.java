package Assignment1;
import java.util.*;
public class Employee {
	
String name;
		float salary;
		Scanner sc=new Scanner(System.in);
		public void put() {
			System.out.println("Enter the name:");
			name=sc.nextLine();
			System.out.println("Enter the salary:");
			salary=sc.nextFloat();
			
		}
		public void get() {
			System.out.println("Tha name is:"+name);
			System.out.println("The salary is:"+salary);
			
		}
		public static void main(String[] args) {
			Employee[]E=new Employee[5];
			
			for(int i=0;i<5.;i++) {
			E[i]=new Employee();
				System.out.println("Enter the details for the employee"+(i+1));
				E[i].put();
				
			}
			for(int i=0;i<5;i++) {
				System.out.println("The details of employee"+(i+1));
				E[i].get();
			}

		}

	}


