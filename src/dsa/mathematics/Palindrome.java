package dsa.mathematics;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int n) {
		if (n < 10)
			return true;
		else {
			int rev = 0;
			while (n > 0) {
				int last = n % 10;
				n = n / 10;
				rev *= 10 + last;
			} 
			return (n == rev);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPalindrome(n))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
