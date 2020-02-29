package Conversion;

import java.util.*;

//this code written by ambesh kumar

//first all char of string change in upper case;
//Assume a string digits="0123456789ABCDEF";
//multiply each char (1st char*16^0+2nd char 16^1+and so on ...)
//print value;


public class HexaToDecimal {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter HexaDecimal number to convert into Decimal number");
		 String s=sc.next();
		 String digits = "0123456789ABCDEF";
         s = s.toUpperCase();
         int val = 0;
         for (int i = 0; i < s.length(); i++)
         {
             char c = s.charAt(i);
             int d = digits.indexOf(c);
             val = 16*val + d;
         }
		
		System.out.println("Decimal representation of "+" "+s+" "+"is");
		System.out.println(val);

	}

}
