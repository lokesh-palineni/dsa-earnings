 package dsa.mathematics;

import java.util.Scanner;

public class HcfOrGcd {
	
 
	static int euclidean(int a,int b) {   //using euclidean alg for finding hcf
		                             //gcd and hcf same
		while(a!=b) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);         //by euclidean recursion 
	}
	static int hcf(int a,int b) {
		 while(b!=0) {
			 int temp=b;
			 b=a%b;
			 a=temp;
			
		}
		return a;
	}
	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(euclidean(a,b));
				System.out.println(hcf(a,b));

				sc.close();
	}

}
