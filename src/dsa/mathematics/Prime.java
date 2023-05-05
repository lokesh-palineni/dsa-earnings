package dsa.mathematics;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n) {
    	for(int i=2;i*i<=n;i++) {
    		if(n%i==0)
    			return false;
    	}
    	return true;
    }
    static boolean isPrime2(int n) {
    	if(n==1) return false;          //efficient method we can skip more half of the elements
    	if(n==2|| n==3) return false;
    	if(n%2==0||n%3==0) return false;   
    	for(int i=5;i*i<=n;i=i+6) {
    		if(n%i==0 || n%(i+2)==0)
    			return false;
    	}
    	return true;
    }
    static boolean isPrimeRec(int n) {
    	 
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
	 
		//System.out.println( );
		System.out.println(isPrime(n));

		sc.close();
	}

}
