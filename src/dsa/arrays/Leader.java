package dsa.arrays;

import java.util.Scanner;

public class Leader {    //all right side elements are lessthan the element

	static void leader(int []a,int n) {
		 
		 for(int i=0;i<n-1;i++) {
			 
			 boolean flag=false;
			 for(int j=i+1;j<n;j++){
				 if(a[i]<a[j]) {
					 flag=true;
					 break;
				 }
				
				 
			 }
			 if(!flag)
				 System.out.println(a[i]);
		 }
		 System.out.println(a[n-1]);
				
		
	}
	static void leader1(int a[],int n) {
		int cur_leader=a[n-1];
		System.out.println(cur_leader);
		for(int i=n-2;i>=0;i--) {
			if(cur_leader<a[i]) {
				cur_leader=a[i];
				System.out.println(cur_leader );
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
		leader1(a,n);
		sc.close();
		 
	}

}
