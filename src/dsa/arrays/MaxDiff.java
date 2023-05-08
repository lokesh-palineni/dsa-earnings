package dsa.arrays;

import java.util.Scanner;

public class MaxDiff {
	static void general(int a[],int n) {
		int temp=a[1]-a[0];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j]-a[i]>temp) {
					temp=a[j]-a[i];
				}
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		 general(a,n);
		sc.close();

	}

}
