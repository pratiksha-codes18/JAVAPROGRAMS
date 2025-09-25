package Assignment1;
import java.util.*;
public class ArraySum {
	
public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("How many numbers:");
			int n=sc.nextInt();
			int a[]=new  int [n];
			System.out.println("Enter the number of array:");
			int sum=0;
			int i;
			for(i=0;i<a.length;i++){
				a[i]=sc.nextInt();

			sum+=a[i];
			}
			
		
			System.out.println("The addition of array is:"+sum);
			System.out.println("the Ascending order of array is:"+a[i]);

			Arrays.sort(a);
			for(i=0;i<n;i++){
				System.out.println(a[i]+" ");
				}
			}
			}





