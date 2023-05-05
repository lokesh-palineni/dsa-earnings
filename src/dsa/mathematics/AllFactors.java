package dsa.mathematics;
 

import java.util.Scanner;

public class AllFactors {

	static void allFactors(int n) {
	 
		for(int i=1;i*i<=n;i++) {
			if(n%i==0)
			System.out.print(i+" ");
			if(i!=n/i)
				System.out.println(n/i);
		}
	}
	static void allFactors1(int n) {
		 int i;
		for( i=1;i*i<n;i++) {
			if(n%i==0)
			System.out.print(i+" ");

		}
		for( ;i>=1;i--) {
			if(n%i==0)
				System.out.print(n/i+" ");
		}
		}
	
	public static void main(String[] args) {
 
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter a no.");
	       int n=sc.nextInt();
	      allFactors1(n);
//	      System.out.println(fact1(n)); 
//	      System.out.println(rec(n)); 
	      sc.close();

	}

}

 