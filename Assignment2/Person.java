package Assignment2;
import utility.CapitalString;
public class Person {
String name,city;
Person(String name,String city){
	this.name=name;
	this.city=city;
}
void display() {
	CapitalString cs=new CapitalString();
	System.out.println("Name:"+cs.FirstLetterCapital(name));
	System.out.println("City:"+cs.FirstLetterCapital(city));
}
	public static void main(String[] args) {
	Person p=new Person("pratu","pune");
	p.display();

	}

}
