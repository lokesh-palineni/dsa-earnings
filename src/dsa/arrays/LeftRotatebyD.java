package dsa.arrays;

import java.util.Scanner;

public class LeftRotatebyD {

	static void arr(int[] a,int n,int d) {
		int temp[]=new int[d];
		
		for(int i=0;i<d;i++)
			temp[i]=a[i];
		
		for(int i=d;i<n;i++)
			a[i-d]=a[i];
		
		for(int i=0;i<d;i++)
			a[n-d+i]=temp[i];
						
	}
	static void  leftRotate(int a[],int n,int d) {
		reverse(a,0,d-1);
		reverse(a,d,n-1);
		reverse(a,0,n-1);
	}
	static void reverse(int a[],int low,int high) {
		while(low<high) {
			int te=a[low];
			a[low]=a[high];
			a[high]=te;
			low++;
			high--;
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
		System.out.println("enter d");
		int d=sc.nextInt();
	     leftRotate(a,n,d);
	     sc.close();
	
	     System.out.println("after elements");
	      for(int i=0;i<n;i++)
		     System.out.println(a[i]);
		
		
	}

}
