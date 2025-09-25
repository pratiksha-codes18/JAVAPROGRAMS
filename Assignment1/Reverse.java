package Assignment1;

public class Reverse {
	
		public static void main(String[]args){
		int num;
		int rev=0;
		num=Integer.parseInt(args[0]);
		while (num>0){
		int rem=num%10;
		rev=(rev*10)+rem;
		num/=10;
		}
		System.out.println("Reverse of the number is:"+rev);
		}
		}


