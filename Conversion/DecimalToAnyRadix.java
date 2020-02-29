package Conversion;
import java.util.Scanner;
import java.util.Stack;


//this code written by ambesh kumar;


//first we divide the number by n  and stored result in stack while number is not equal to zero;
//pop the number from stack(stack is LIFO manner  i.e Last in First out in reverse manner);


public class DecimalToAnyRadix {

public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);   //for taking input from user
	System.out.println("enter the base");
	long b=sc.nextLong();
	 System.out.println("enter decimal number to convert into "+"n"+" "+"base");
	 long n=sc.nextLong();
	 long c=n;
	 Stack<Integer> stack=new Stack<>();
	 while(n!=0)
	 {
		 Integer rem=(int) (n%b);// stored remainder in stack using stack.push function;
		 stack.push(rem);
		 n=n/b;
	 }
	 System.out.println(b+" base representation of the "+" "+c+" "+"is");
	 while(!stack.isEmpty())
	 {
		 int p=stack.pop();// pop the stack and print the result;
		 if(p>=0 && p<=9)
			 System.out.print(p);
		 else
		 {
			 char l=(char)(p-10+'A');
			 System.out.print(l);
		 }
			 
	
	
	 }	
}
}
