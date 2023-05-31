package dsa.strings;

import java.util.Scanner;

public class SubSequence {

	private static boolean sub(String s1,String s2) {
 	
		int j=0;
		for(int i=0;i<s1.length() && j<s2.length();i++) {
			if(s1.charAt(i)==s2.charAt(j))
				j++;
		}
		return(j==s2.length());
	}
	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(sub(s1,s2));
		sc.close();
	}

	

}
