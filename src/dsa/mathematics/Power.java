package dsa.mathematics;

import java.util.Scanner;

public class Power {

	static int pow(int x,int n) {
		int count=1;
		for(int i=n;i>0;i--) {
			count=count*x;
		}
		return count;
	}
	static int pow1(int x,int n) {
		int count=1;
		if(n%2==0) {
		for(int i=n/2;i>0;i--) {
			count=count*x;
		 }
		return count*count;
		}
		else {
			for(int i=(n-1)/2;i>0;i--) {
				count=count*x;
			 }
		return count*count*x;
		}
	}
	
		static int powRec(int x,int n) {
			if(n==0)
				return 1;
			int temp=powRec(x,n/2);
			temp=temp*temp;
			if(n%2==0)
				return temp;
			else
				return temp*x;
		
	
}
		static int powIterative(int x,int n) {
			int res=1;
			while(n>0) {
				if(n%2!=0)
					res=res*x;
				 
					x=x*x;
				n=n/2;
			}
			return res;
		}
	public static void main(String[] args) {
 

		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter a no.");
	       int x=sc.nextInt();
	       int n=sc.nextInt();
	     System.out.println(pow1(x,n));
	     System.out.println(powIterative(x,n));
//	     
	      sc.close();
	}

}
