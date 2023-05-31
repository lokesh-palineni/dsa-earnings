package dsa.strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostRepeating {

	static int mostrpt(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			String s= ""+s1.charAt(i);
			String s2=s1.substring(i+1);
			if(s2.contains(s))
					return i;
		}
		return -1;
	}
	
	static final int CHAR1=26;
	static int lmrpt(String s) {
		 int[] count=new int[CHAR1];
		 for (int i = 0; i < s.length(); i++) {
			int temp=s.charAt(i)-'a';
			count[temp]++;
		}
		 for (int i = 0; i <s.length(); i++) {
			if(count[s.charAt(i)]>1)
				return i;
		}
		 return -1;
	}
	static final int CHAR=256;
	static int   lmrpt1(String s) {
		int [] FIndex=new int[CHAR];
		Arrays.fill(FIndex, -1);
		int res=Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			int fi=FIndex[s.charAt(i)];
			if(fi==-1)
				FIndex[s.charAt(i)]=i;
			else
				res=Math.min(res, fi);
		}
		return  res=(res==Integer.MAX_VALUE)?-1:res;
//one more efficient method.
	}
	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s1=sc.next();
		System.out.println(mostrpt(s1));
		sc.close();
	}

}

/*i/p:                    o/p:
  geeksforgeeks           * 0
 abbcc                       1
 abdc                       -1
 */
 