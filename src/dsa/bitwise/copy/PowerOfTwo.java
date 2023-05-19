package dsa.bitwise.copy;

import java.util.Scanner;

public class PowerOfTwo {
	static boolean powTwo(int n) {
		if(n==0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
	static boolean power(int n) {
		int count=0; 
		while(n>0) {
			n=(n & (n-1));
			count++;
		}
		return( count==1);
	}
 
	static boolean pow2(int n) {
		return (n!=0) && ((n&(n-1))==0);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();sc.close();
	   System.out.println( pow2(n)); 
	}

}
