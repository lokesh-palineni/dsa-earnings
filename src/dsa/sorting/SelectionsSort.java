package dsa.sorting;

import java.util.Arrays;

public class SelectionsSort {

	static void selectSort(int[]a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int min_ind=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min_ind]) {
					min_ind=j;
				}
			}
			int temp=a[min_ind];
			a[min_ind]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		 int[]a={10,5,8,20,2,18};
		 selectSort(a);
	}

}
