package Conversion;

import java.util.Scanner;

//this code written by ambesh kumar;


//multiply each char (1st char*8^0+2nd char 8^1+and so on ...)
//print value;


public class OctalToDecimal {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter Octal number to convert into Decimal number");
		 String s=sc.next();
		int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int c = s.charAt(i);
            int f=c-48;
            val =8*val + f;
        }
        System.out.println("Decimal representation of "+" "+s+" "+"is");
        System.out.println(val);

	}

}
