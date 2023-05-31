package dsa.strings;

import java.util.Scanner;

public class Palindrome {
	
	static boolean palin(String s) {
		int n=s.length();
		for (int i = 0; i <s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(--n))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s=sc.next();
		System.out.println(palin(s));
		sc.close();
		}

}
