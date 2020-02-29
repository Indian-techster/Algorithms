package Conversion;

//this code written by ambesh kumar

//first all char of string change in upper case;
//Assume a string digits="0123456789ABCDEFGHIJK......";
//multiply each char (1st char*sr^0+2nd char sr^1+and so on ...) sr-source radix;
//its convert in decimal;
//after decimal it's easier to convert into destination radix;

import java.util.*;

public class AnyRadixToAnyRadix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the begin base of number && end base of number between(2-36)");
		int sr=sc.nextInt();
		int cb=sc.nextInt();
		System.out.println("enter a number ");
		 String s=sc.next();
		
		//here change anyradix to decimal;
		
		 String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 s = s.toUpperCase();
         long val = 0;
         for (int i = 0; i < s.length(); i++)
         {
             char ch = s.charAt(i);
             int d = digits.indexOf(ch);
             val = sr*val + d;
         }
		
         //here change decimal to anyIndex;
         
         long n=val;
    	 Stack<Integer> stack=new Stack<>();
    	 while(n!=0)
    	 {
    		 Integer rem=(int) (n%cb);// stored remainder in stack using stack.push function;
    		 stack.push(rem);
    		 n=n/cb;
    	 }
    	 System.out.println(cb+" base representation of the "+" "+s+" "+"is");
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
