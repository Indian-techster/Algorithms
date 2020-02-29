package Conversion;

import java.util.*;

//this code written by ambesh kumar

//first we change hexaDecimal to decimal
// after we change decimal to binary


public class HexaToBinary {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter HexaDecimal number to convert into Binary number");
		 String s=sc.next();
		 
		 //Here convert HexaDecimal to Decimal;
		 
		 String digits = "0123456789ABCDEF";
         s = s.toUpperCase();
         int val = 0;
         for (int i = 0; i < s.length(); i++)
         {
             char c = s.charAt(i);
             int d = digits.indexOf(c);
             val = 16*val + d;
        }
         
         
         //Here convert Decimal to Binary;
         
         long n=val;
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


