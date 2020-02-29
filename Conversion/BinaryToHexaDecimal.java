package Conversion;

import java.util.Scanner;
import java.util.Stack;

//this code written by ambesh kumar;

//no direct ways to calculate binary to HexaDecimal 
//first we change from binary to decimal
//then after change decimal to HexaDecimal;

public class BinaryToHexaDecimal {

	public static void main(String[] args) {
		
		
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter binary number to convert into HexaDecimal number");
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
				
				//from here change decimal to hexaDecimal;
				
				
				 Stack<Integer> stack=new Stack<>();
				 while(k!=0)
				 {
					 Integer rem=(int) (k%16);// stored remainder in stack using stack.push function;
					 stack.push(rem);
					 k=k/16;
				 }
				 System.out.println("HexaDecimal representation of the "+" "+c+" "+"is");
				 while(!stack.isEmpty())
				 {
					 int p=stack.pop();// pop the stack and print the result;
					 if(p==10)
						 System.out.print("A");
					 else if(p==11)
							 System.out.print("B");
					 else if(p==12)
						 System.out.print("C");
					 else if(p==13)
						 System.out.print("D");
					 else if(p==14)
						 System.out.print("E");
					 else if(p==15)
						 System.out.print("F");
					 else
					 System.out.print(p);
				 }
				
	}

}
