package Assignment2;
/*Assignment2 question no:1*/
 class Point {
protected int x,y;
Point(){
	this.x=0;
	this.y=0;
}
Point(int x,int y){
	this.x=x;
	this.y=y;
}
public void display() {
	System.out.println("point coordinates:"+x+" "+y);
	
}
}
class ColorPoint extends Point{
	private String color;
	ColorPoint(){
		
		this.color=null;
	}
	ColorPoint(int x,int y,String color){
	super(x,y);
	this.color=color;	
	}
	
	public void display() {
		super.display();
		System.out.println("Color point coordinates:"+x+" "+y+" "+" "+color);
	}
}
class Point3D extends Point {
	private int z;

Point3D (){
	 this.z=0;
 }
Point3D(int x,int y,int z){
	super(x,y);
	this.z=z;
}
public void display() {
	super.display();
	System.out.println("Point 3D coordinates:"+x+" "+y+" "+z  );
}
}

public class Main{
	 public static void  main(String[]args) {
		 Point p=new Point(20,30);
		 p.display();
		 ColorPoint c=new ColorPoint(12 ,5,"blue");
		 c.display();
		 Point3D pd=new Point3D(2,3,5);
		 pd.display();
		
		 
	 }
 }







