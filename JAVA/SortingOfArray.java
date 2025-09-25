package JAVA;
import java.util.*;
public class SortingOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
System.out.print("Sorted Array:");
Arrays.sort(a);
for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}
	}

}
