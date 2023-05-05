package dsa.mathematics;

import java.util.Scanner;

public class TailingZeros {

	static int tailZero1(int n) {
		int count = 0;
		for (int i = 5; i <= n; i = i * 5)
			count = count + n / i;
		return count;
	}

	static int tailZero(int n) { // find the no. of zeros at the end in the given number recursion value
		int j = 5; // for this we can simply count no. 5 are there i.e., 5*2=get 0
		int count = 0;
		while (j <= n) {
			count += n / j;
			j *= 5;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		System.out.println(tailZero(n));
		sc.close();
	}

}
