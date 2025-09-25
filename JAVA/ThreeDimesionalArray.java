package JAVA;
import java.util.*;
public class ThreeDimesionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of layers:");
		int x=sc.nextInt();
		System.out.print("Enter the number of rows:");
		int y=sc.nextInt();
		System.out.print("Enter the number of columns:");
		int z=sc.nextInt();
		int a[][][]=new int[x][y][z];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<x;i++) {
			
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		
System.out.println("The elements of the array:");
for(int i=0;i<x;i++) {
	System.out.println("Layer:"+(i+1));
	for(int j=0;j<y;j++) {
		for(int k=0;k<z;k++) {
			System.out.print(a[i][j][k]+" ");
	}
		System.out.println();
	}
	System.out.println();
}
	}
}
