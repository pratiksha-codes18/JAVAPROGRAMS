package JAVA;
import java.util.*;
public class OneDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers to be enter:");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.print("Enter the number in the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
System.out.print("Elements of the array:");
for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}
	}

}
