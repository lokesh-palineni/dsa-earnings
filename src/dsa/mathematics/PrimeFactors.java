package dsa.mathematics;

import java.util.Scanner;

public class PrimeFactors {

	static void primeFact(int n) {

		for (int i = 2; i <= n; i++) {
			if (Prime.isPrime(i)) {
				int x = i; // narrow solution
				while (n % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}

	static void primeFactors1(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (Prime.isPrime(i)) {
				int x = i; // best then above
				while (n % x == 0) {
					System.out.print(i + " ");
					x = x * i;
				}
			}
		}

	}

	static void primeFactors(int n) {
		System.out.println("");
		for (int i = 2; i*i <= n; i++) {
			                           // efficient solution
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;

			}

		}
		if (n > 1)
			System.out.println(n);
	}
	static void primeFactors3(int n) {
		if(n<=1) return;
		while(n%2==0) {
			System.out.print("2"+" ");
			n=n/2;
		}                         //more efficient  solution 
		while(n%3==0) {
			System.out.print("3"+" ");
			n=n/3;
		}
		for(int  i=5;i*i<=n;i=i+6) {
			while(n%i==0) {
				System.out.println(i+" ");
				n=n/i;
			}
			while(n%(i+2)==0) {
				System.out.println(i+2+" ");
				n=n/i+2;
			}
			if(n>3)
				System.out.println(n);
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		 primeFactors(n);
		primeFactors1(n);

		// System.out.println( );
		sc.close();
	}

}
