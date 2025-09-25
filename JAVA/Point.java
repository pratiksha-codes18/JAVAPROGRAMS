package JAVA;
public  class Point {
int x, y;
 Point(){
	 this .x=0;
	 this.y=y;
 }
 Point(int x,int y){
	 this.x=x;
	 this.y=y;
 
 }
 void display() {
	 System.out.println("X"+"="+x);
 }
 }
 
 class colorPoint extends Point{
	 String color;
	 public void display() {
		 System.out.println("Color:"+color);
	 }
	 
 }
 class Point3D extends colorPoint{
	 int z;
	public  void display() {
	 System.out.println("z:"+z);
	 }
	 
 }
 
 class Main{
	 public static void main(String[]args) {
		 Point3D p=new Point3D();
		 p.display();
	 }
 }