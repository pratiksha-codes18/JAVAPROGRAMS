package JAVA;

public class Student {
	int rollno;
	String name;
	float percentage;
	//Default Constructor
	Student(){
	this.rollno=4226;
	this.name="Pratiksha";
	this.percentage=50;
		
	}
			//Parameterized Constructor
				Student(int rollno,String name,float percentage){
						this.rollno =rollno;
						this.name=name;
						this.percentage=percentage;
						}

void display() {
	System.out.println("The rollno of student is:"+this.rollno);
	System.out.println("The name of student is:"+this.name);
	System.out.println("The percentage of student is:"+percentage);
}


	public static void main(String[] args) {
		Student s1=new Student(4228,"Mukta",90);
		Student s2=new Student (4227,"Anuradha",98);
		Student s3=new Student(4232,"Manjusha",95);
		Student s4=new Student(4210,"Shruti",94);
		Student s5=new Student(4233,"Monika",93);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		
	}

	}
