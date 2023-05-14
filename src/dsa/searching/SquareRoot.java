package dsa.searching;

import java.util.Scanner;

public class SquareRoot {
	static int sqRootFloor(int x) {
		int low=1,high=x,ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int msq=mid*mid;
			if(msq==x)
				return mid;
			else if(msq>x)
				high=mid-1;
			else {
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 int x=sc.nextInt();
		System.out.println( sqRootFloor(x));
		sc.close();
	}

}
