package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	static void   bubble(int[] a) {
		int n=a.length;
		 
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;       
		for(int j=0;j<n-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				swapped=true;
			}
		}
		if(swapped==false)    //if ntg is swapped means the array sorted so break
			break;
		
		 
		}
		System.out.println(Arrays.toString(a));
	}
	

	public static void main(String[] args) {
		 int [] arr= {10,8,20,5};
		 bubble(arr);
	}

}
