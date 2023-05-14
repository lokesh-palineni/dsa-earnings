package dsa.searching;

import java.util.Scanner;

public class FirstOccurance {
	
	static int firstOcc(int a[],int low,int high,int x) {
		if(low>high)
			return -1;
		int mid=low+high/2;    
		if(x>a[mid])
			return firstOcc(a,mid+1,high,x);
		else if(x<a[mid])
			return firstOcc(a,low,mid-1,x);
		else {
			if(mid==0||a[mid-1]!=a[mid])
				return mid;
			else
				return firstOcc(a,low,mid-1,x);
		}
	}
	//write iterative sol
	static int lastOcc(int a[],int x) {
		 
		int low=0;int high=a.length-1;
		while(low<=high) {
			 
			int mid=(low+high)/2;
		 
			if(a[mid]<x)
				low=mid+1;
			else if(a[mid]>x)
				high=mid-1;
			
			else {
				if(mid==(a.length-1)||a[mid]!=a[mid+1])
					return mid;
				else
					 low=mid+1;
			}
		}
		return -1;
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
		 
		//System.out.println(firstOcc(a,0,n,x));
		System.out.println(lastOcc(a,x));

		sc.close();
	}

}
