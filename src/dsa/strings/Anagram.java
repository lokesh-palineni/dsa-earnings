package dsa.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		char a1[]=s1.toCharArray();
		Arrays.sort(a1);
		s1=new String(a1);
		
		char a2[]=s2.toCharArray();
	    Arrays.sort(a2);
	    s2=new String(a2);
	    return s1.equals(s2);
	}
   static final int CHAR =256;      //this method is form all ascci values
	static boolean anagram1(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		int count[]=new int[CHAR];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<CHAR;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}
	static final int CHAR1 =26; //if we have only lowercase letters
	static boolean anagram2(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		int count[]=new int[CHAR1];
		for (int i = 0; i < s1.length(); i++) {
			int temp=s1.charAt(i)-'a';
			int temp1=s2.charAt(i)-'a';

			count[temp]++;
			count[temp1]--;
		}
		for(int i=0;i<CHAR1;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(anagram2(s1,s2));
		sc.close();
	}

}
// anagram means the no. of occurance of each character is same.
