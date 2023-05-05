package dsa.mathematics;

import java.util.Scanner;

public class Factorial {

	static int fact(int n) {
  	  int temp=1;
  	  while(n>1) {
  		  temp*=n;
  		  n--;
  	  }
  	  return temp;
    }
	static int fact1(int n) {
	  	  int temp=1;
	  	 for(int i=2;i<=n;i++)
	  		 temp*=i;
	  	  return temp;
	    }
	static int rec(int n) {
		if(n<=1)
			return 1;
		
		return n*rec(n-1);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
      System.out.println(fact(n)); 
      System.out.println(fact1(n)); 
      System.out.println(rec(n)); 

	}

}
