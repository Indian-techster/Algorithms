package Conversion;

import java.util.*;
import java.lang.*;

//this code written by ambesh kumar

/*
SYMBOL       VALUE
I             1
IV            4
V             5
IX            9                   
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900 
M             1000   


*/ //this is Roman to Integer  Symbol;

//first check two character of string and calculate after the value using else if condition;



// this code working from 1- 4999 only;
//first we divide 1000 and return value print value times M....
//after divide 900

public class IntegerToRoman {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer Number");
		int n=sc.nextInt();
		int k=n;
		String  m[]= {"","M","MM","MMM","MMMM"};
		String c[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String X[]= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String I[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String thous=m[n/1000];
		String hun=c[(n%1000)/100];
		String ten=X[(n%100)/10];
		String one=I[(n%10)/1];

		String result=thous+hun+ten+one;
		System.out.println("Roman representation of"+" "+k);
		System.out.println(result);
		
		
		
		
	}

}
