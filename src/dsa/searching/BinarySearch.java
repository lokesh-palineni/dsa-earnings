package dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	static int binary(int[]a,int x) {
	
		int low=0;int high=a.length-1;
		while(low<=high) {
			int mid=low+high/2;
			if(a[mid]==x)
				return mid;
			else if(a[mid]<x)
				low=mid+1;
			else if(a[mid]>x)
				high=mid-1;
		}
		return -1;
		 
	}
	static int recursive(int []a,int low,int high,int x) {
		 if(low> high)
			 return -1; 
		int mid=low+high/2;
		if(a[mid]==x)
			return mid;
		else if(a[mid]<x) {
			return recursive(a,mid+1,high,x);
		}
		else {
			return recursive(a,low,mid-1,x);
		}
		
		 }
		 
		
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter no.");
		int x=sc.nextInt();
		Arrays.sort(a);
		System.out.println(binary(a,x));
		sc.close();
 
	}

}
