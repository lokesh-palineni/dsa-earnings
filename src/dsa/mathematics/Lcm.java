package dsa.mathematics;

import java.util.Scanner;

public class Lcm {
	static int hcf(int a,int b) {
		if(b==0)
			return a;
		return hcf(b,a%b);
	}
	static int lcm(int a,int b) {
		return a*b/hcf(a,b);
	}
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm(a,b));
		//System.out.println(hcf(a,b));

		sc.close();
}
}
