package dsa.strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostNonRepeating {

	static final int CHAR=26;
	static int leftnon(String s) {   //TWO TRAVERSL
		int[] count=new int[CHAR];
		for (int i = 0; i <s.length(); i++) {
			count[s.charAt(i)-'A']++;
		}
		for (int i = 0; i <s.length(); i++) {
			if(count[s.charAt(i)-'A']==1)
				return i;
		}
		return -1;
	}
	 //ONE TRAVERSAL
	static  final int CHAR1=256;
	static int nonRep(String s) {
		int[] fi=new int[CHAR1];
		Arrays.fill(fi, -1);
		for(int i=0;i<s.length();i++) {
			if(fi[s.charAt(i)]==-1)
				fi[s.charAt(i)]=i;
			else
				fi[s.charAt(i)]=-2;
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<CHAR1;i++)
			if(fi[i]>=0)
				res=Math.min(res, fi[i]);
		
		return (res==Integer.MAX_VALUE)?-1:res;
	}
	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s1=sc.next();
		System.out.println(nonRep(s1));
		sc.close();
	}

}
