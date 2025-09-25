package Assignment1;
import java.util.*;
public class MyDate {
	int DD,MM,YYYY;
	  MyDate(){
		  this.DD=14;
		  this.MM=06;
		  this.YYYY=1996;
	  }
	  MyDate(int DD,int MM,int YYYY){
		  this.DD=DD;
		  this.MM=MM;
		  this.YYYY=YYYY;
	  }
	  void display() {
		  System.out.println("The date is:"+DD+"-"+MM+"-"+YYYY);
	  }
		public static void main(String[] args) {
			MyDate md=new MyDate(23,02,2005);
			md.display();

		}

	}
	
	
	
	
	
	

