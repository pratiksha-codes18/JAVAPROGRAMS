package JAVA;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		
			
			int a[]={6,2,8,4};
			int sum=0;
			int i;
			for(i=0;i<a.length;i++){
			sum+=a[i];
			
			}
			System.out.println("The Sum of array is:"+sum);
			//System.out.print(sum+" ");
			System.out.println();
			
			System.out.print("Sorted Array:");
			Arrays.sort(a);
			for( i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
				}
}
		
			
			
	

	







