package JAVA;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the numbers to the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
System.out.print("Reverse of number:");
for(int i=n-1;i>=0;i--) {
	System.out.print(a[i]+" ");
	
}
	}

}
