package JAVA;

class Employee{
	void Salary() {
		
		System.out.println("The salary of the Employee");
	}
}

class PartTime extends Employee{
	void  Salary() {
		
		System.out.println("The salary of PartTime emp is:50000");
	}
}
class FullTime extends Employee{
	void Salary() {
		System.out.println("The salary of FullTime emp is:10000");
	}
}

public class Emp {

	public static void main(String[] args) {
		
		Employee e;
		e=new Employee();
		e.Salary();
		e=new PartTime();
		e.Salary();
		e=new FullTime();
		e.Salary();
		
		
		
	}

}
