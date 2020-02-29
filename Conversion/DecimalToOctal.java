package Conversion;
import java.util.*;

import java.util.Scanner;
import java.util.Stack;

//this code written by ambesh kumar;


//first we divide the number by 8 (in octal Radix is 8) and stored result in stack while number is not equal to zero;
//pop the number from stack(stack is LIFO manner  i.e Last in First out in reverse manner);


public class DecimalToOctal {
	
	public static void main(String[]args)
	{
		
	Scanner sc=new Scanner(System.in); //for taking input from user
	 System.out.println("enter decimal number to convert into Octal digits");
	 long n=sc.nextLong();
	 long c=n;
	 Stack<Integer> stack=new Stack<>();
	 while(n!=0)
	 {
		 Integer rem=(int) (n%8);// stored remainder in stack using stack.push function;
		 stack.push(rem);
		 n=n/8;
	 }
	 System.out.println("Octal representation of the "+" "+c+" "+"is");
	 while(!stack.isEmpty())
	 {
		 int p=stack.pop();// pop the stack and print the result;
		 System.out.print(p);
	 }
		
		
	}
}
