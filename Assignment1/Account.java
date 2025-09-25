package Assignment1;
import java.util.*;
public class Account {
	int accno;
		String accname;
		float balance;
		Scanner sc=new Scanner(System.in);
	public void put() {
		System.out.println("Enter the account number:");
		accno=sc.nextInt();
		System.out.println("Enter the account name:");
		accname=sc.nextLine();
		System.out.println("Enter the balance:");
		balance=sc.nextFloat();
		
	}
	public void get() {
		System.out.println(" the account number:"+accno);
		System.out.println("the account name:"+accname);
		System.out.println(" the balance:"+balance);
		
		
	}
	static void sortAccount() {
		
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("How many Accounts:");
			int n=sc.nextInt();
		Account A[]=new Account[n];	
		for(int i=0;i<n;i++) {
			A[i]=new Account();
			System.out.println("Enter the details of employee"+(i+1));
			A[i].put();
			
			
		}
		
		for(int i=0;i<n;i++) {
			A[i]=new Account();
			System.out.println(" the details of employee"+(i+1));
			A[i].get();
		}
			

		}

	}



