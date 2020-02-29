package Conversion;


import java.util.*;


//this code written by ambesh kumar;

//first count the digit in number ;
//we run a for loop from 0 to count-1 ,and each iteration  divide the number by 10 store remainder in a rem variable .and calculate ith power of 2and multiply
//intiallize k=0; and add multiply value of pow and rem;
// print k;


public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number to convert into Decimal number");
		 long n=sc.nextLong();
		long c=n;
		long b=n;
		int count_digits=0;
		while(n!=0)
		{
			n=n/10;
			count_digits++;
		}
		
		long k=0;
		for(int i=0;i<count_digits;i++)
		{
		int rem=(int) (b%10);
		long value=(long) Math.pow(2,i);
		k=k+value*rem;	
		b=b/10;
		}
		System.out.println("Decimal representation of "+" "+c+" "+"is");
		System.out.println(k);
         
	}

}
