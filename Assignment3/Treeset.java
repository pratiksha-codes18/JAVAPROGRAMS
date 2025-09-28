package Assignment3;
import java.util.*;
public class Treeset{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer>numbers=new TreeSet<>();
	
		System.out.println("How many numbers:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter number"+(i+1)+":");
			int num =sc.nextInt();
			numbers.add(num);
		}
		System.out.println("numbers in sorted order:"+numbers);
		System.out.println("Enter the number you want to search:");
		int search=sc.nextInt();
	if(numbers.contains(search)) {
		System.out.println(search+"is present in collection");
		}
	else {
		System.out.println(search+"is not present in collection");
	}
	}
}