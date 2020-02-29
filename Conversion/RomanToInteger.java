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


public class RomanToInteger {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roman Number");
		String s=sc.next();
		s=s.toUpperCase();
		long value=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((i+1)<s.length())
			{
				
				char d=s.charAt(i+1);
				
			 if(c=='I'&& d=='V')
			 {
					value +=4;
					i++;
			 }
			 else if(c=='I'&& d=='X')
			 {
					value +=9;
					i++;
			 }
			 else if(c=='X'&& d=='L')
			 {
				 value +=40;
				 i++;
			 }
					
			 else if(c=='X'&& d=='C')
			 {
					value +=90;
					i++;
			 }
			 else if(c=='C'&& d=='D')
			 {
				 value +=400;
				 i++;
			 }
					
			 else if(c=='C'&& d=='M')
			 {
					value +=900;
					i++;
			 }
			 else if(c=='I')
				 value +=1;
			 else if(c=='V')
				 value +=5;
			else if(c=='X')
				 value +=10;
			else if(c=='L')
				 value +=50;
			else if(c=='C')
				 value +=100;
			else if(c=='D')
				 value +=500;
			else if(c=='M')
				 value +=1000;
			}
			else
			{
				  if(c=='I')
					 value +=1;
				 else if(c=='V')
					 value +=5;
				else if(c=='X')
					 value +=10;
				else if(c=='L')
					 value +=50;
				else if(c=='C')
					 value +=100;
				else if(c=='D')
					 value +=500;
				else if(c=='M')
					 value +=1000;
			}
			
		}
		
		System.out.println("Integer representation of "+" "+s);
		System.out.println(value);

	}

}
