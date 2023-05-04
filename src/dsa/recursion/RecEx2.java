package dsa.recursion;

import java.util.Scanner;

public class RecEx2 {

	static int fun(int n) {
		if (n == 1)
			return 0;
		else
			return 1 + fun(n / 2);
	}

	static void binaryFun2(int n) {
		if (n == 0)
			return;
		binaryFun2(n / 2);         //o/p will generate binary format on no.
		System.out.print(n % 2);
	}

	static void printNo(int n) {
		if (n == 0)
			return;

		System.out.println(n);       // 12345
		printNo(n - 1);

	}

	static void printNo2(int n) {
		if (n == 0)
			return;                   //54321

		printNo2(n - 1);
		System.out.println(n);

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binaryFun2(n);
		fun(n);
		printNo2(n);
		// System.out.println( n);   //if(n==2^n)o/p: log2(n)
		                             // else floor(log2(n))
	}

}
