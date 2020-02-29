package Conversion;
import java.util.*;

// this code written by ambesh kumar;


//first we divide the number by 2 and stored result in stack while number is not equal to zero;
// pop the number from stack(stack is LIFO manner  i.e Last in First out in reverse manner);

public class DecimalToBinary {
	
public static void main(String[]args)
{
	
Scanner sc=new Scanner(System.in); //for taking input from user
 System.out.println("enter decimal number to convert into Binary digits");
 long n=sc.nextLong();
 long c=n;
 Stack<Integer> stack=new Stack<>();
 while(n!=0)
 {
	 Integer rem=(int) (n%2);// stored remainder in stack using stack.push function;
	 stack.push(rem);
	 n=n/2;
 }
 System.out.println("Binary representation of the "+" "+c+" "+"is");
 while(!stack.isEmpty())
 {
	 int p=stack.pop();// pop the stack and print the result;
	 System.out.print(p);
 }
	
	
}
}
