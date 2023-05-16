package dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key=a[i];
			
			int j=i-1;;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			  
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
	 
		 int[]a={10,5,8,20,2,18};
		 insertionSort(a);
	}

}
