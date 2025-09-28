package Assignment2;
class Employee1{
	String name;
	float salary;
Employee1(String name,float salary){
	this.name=name;
	this.salary=salary;
	}
void display() {
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	
	}

	
	
}
class Developer extends Employee1{

	String projectname;
	Developer(String name,float salary,String projectname){
		super(name,salary);
		this.projectname=projectname;
		
	}
	@Override
	void display() {
		super.display();
	System.out.println("Projectname:"+projectname);	
		
		}
	
}
public class Programmer extends Developer{
String proglanguage;
Programmer(String name,float salary,String projectname,String proglanguage){
	super(name,salary,projectname);
	this.proglanguage=proglanguage;
}
@Override
void display() {
	super.display();
System.out.println("proglanguage:"+proglanguage);	
	
	}
public static void main(String[] args) {
	Developer dev= new Developer("prattiksha",250000,"voting");
	dev.display();
		

	}


}



