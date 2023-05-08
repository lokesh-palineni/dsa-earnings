package dsa.arrays;

import java.util.Scanner;

public class Freqnce {
	
	static void sorted(int[] a,int n) {
		boolean flag=true;int i=0;int temp=1;
		
		while(i<n-1) {
			if(a[i]!=a[i+1]) {
				flag=false;
			}
			else
			    temp++;
			i++;
			if(!flag) {
				System.out.println(a[i-1]+":"+temp);
				 temp=1;
			}
		}
	}

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sorted(a,n);
		sc.close();

	}

}
