package dsa.mathematics;

import java.util.Scanner;

public class CountDigits {
  
	static int countDigits1(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	static int countDigits2(int n) {
		if(n==0)
			return 0;
		return 1+countDigits2(n/10);
	}
	int countDigits3(int n) {
	//	return floor((n)+1);
		return 0;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	System.out.println(countDigits2(n));	
       
	}

}
