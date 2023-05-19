package dsa.bitwise;

import java.util.Scanner;

public class CountSetBits {

	static void setBit(int n) {
		int count=0;
//		while(n>0) {
//			if( (n &1)==1 ) {   //->n&2==1
//				count++;
//				//n=n>>1;        //->n=n/2
//
//			}
		while(n>0) {
 			if(n%2==1) {
				count++;
				 
			}
			n=n/2;
		}
		System.out.println(count);
	}
	static int countBits(int n) {
		int count=0; 
		while(n>0) {
			n=(n & (n-1));
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();sc.close();
		setBit(n);
		//System.out.println(countBits(n));
//


}
	}
