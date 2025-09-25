package JAVA;
import java.util.*;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows::");
		int rows=sc.nextInt();
	System.out.print("Enter the number of column:");
	int cols=sc.nextInt();
	int a[][]=new int[rows][cols];
	System.out.println("Enter the elements of array:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("The elements of the array:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}

}
