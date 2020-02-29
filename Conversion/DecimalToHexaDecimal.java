package Conversion;

import java.util.Scanner;
import java.util.Stack;


//this code written by ambesh kumar;


//first we divide the number by 16 (in octal Radix is 16) and stored result in stack while number is not equal to zero;
//pop the number from stack(stack is LIFO manner  i.e Last in First out in reverse manner);

public class DecimalToHexaDecimal {
	
	public static void main(String[]args)
	{
		
	Scanner sc=new Scanner(System.in); //for taking input from user
	 System.out.println("enter decimal number to convert into Hexa digits");
	 long n=sc.nextLong();
	 long c=n;
	 Stack<Integer> stack=new Stack<>();
	 while(n!=0)
	 {
		 Integer rem=(int) (n%16);// stored remainder in stack using stack.push function;
		 stack.push(rem);
		 n=n/16;
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