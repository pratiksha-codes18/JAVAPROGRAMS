package JAVA;

public class B {
int xB=40;
public void  m2() {
	System.out.println("I am in m2 of class b");
}
public void m3() {
	System.out.println("I am in m3 of class b");
	
}
public void m4() {
	this.m2();
	System.out.println(this.xB);
}

	public static void main(String[] args) {
		new B().m4();

	}

}
