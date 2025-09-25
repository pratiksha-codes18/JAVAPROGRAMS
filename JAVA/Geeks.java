package JAVA;

  class Animal {
	
	
    void sound() {
	System.out.println("Animal makes a sound");
}

}

class Dog extends Animal1{
	void sound()
	{
		System.out.println("Dog barks");
	}

}
class Cat extends Animal1{
	void sound() {
		System.out.println("Cat meow");
	}
}
class Cow extends Animal1{
	void sound() {
		System.out.println("Cow  moos");
	}
}
public class Geeks{
	
public static void main(String[] args) {
  Animal1 a;
  a=new Animal1();
a.sound();

  a=new Dog();
   a.sound();
 a=new Cat();
 a.sound();
 a=new Cow(); 
 a.sound();
	 
 }


	}


