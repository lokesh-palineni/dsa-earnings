package dsa.recursion;

import java.util.Scanner;

public class BaseCaseEx {

//	static int fact(int n,int k) {
//		if(n<=1)
//			return k;
//		 k*=n*(n-1);
//		return fact(n-2,k);
//	}
	static int fact(int n) {
		if (n == 1)
			return 1;

		return n * fact(n - 1);
	}

	static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res = fact(n);
		int res1=fib(n);
		System.out.println(res);
		System.out.println(res1);

	}

}
