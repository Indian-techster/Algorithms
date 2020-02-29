package Conversion;

import java.util.*;

//this code written by ambesh kumar;

//no direct ways to calculate binary to octal 
//first we change from binary to decimal
//then after change decimal to octal;




public class BinaryToOctal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number to convert into Octal number");
		 long n=sc.nextLong();
		long c=n;
		long b=n;
		
		//from here change binary to decimal;
		
		int count_digits=0;
		while(n!=0)
		{
			n=n/10;
			count_digits++;
		}
		
		long k=0;
		for(int i=0;i<count_digits;i++)
		{
		int rem=(int) (b%10);
		long value=(long) Math.pow(2,i);
		k=k+value*rem;	
		b=b/10;
		}
		
		//from here change decimal to Octal
		
		 Stack<Integer> stack=new Stack<>();
		 while(k!=0)
		 {
			 Integer rem=(int) (k%8);// stored remainder in stack using stack.push function;
			 stack.push(rem);
			 k=k/8;
		 }
		 System.out.println("Octal representation of the "+" "+c+" "+"is");
		 while(!stack.isEmpty())
		 {
			 int p=stack.pop();// pop the stack and print the result;
			 System.out.print(p);
		 }
			
			
		
	}

}
