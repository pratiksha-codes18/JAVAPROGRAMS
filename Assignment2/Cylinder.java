package Assignment2;
class circle implements Operation{
	int r;
	circle(int r){
		this.r=r;
	}
	
	public void area() {
		double area=Pi*r*r;
		System.out.println("The area of circle is:"+area);
		}
	
	public void volume() {
		System.out.println("Can not find the volume of circle");
	}
}
public class Cylinder implements Operation{
	int r,h;
	Cylinder(int r,int h){
		this.r=r;
		this.h=h;
	}
	public void area() {
		double area=2*Pi*r*(r+h);
		System.out.println("the area of cylinder is:"+area);
		
	}
	public void volume() {
		double volume=Pi*r*r*h;
		System.out.println("the volume of cylinder is:"+volume);
	}
public static void main(String[] args) {
		circle c=new circle(2);
		c.area();
		c.volume();
	Cylinder cy=new Cylinder(2,3);
	cy.area();
	cy.volume();

	}

}
