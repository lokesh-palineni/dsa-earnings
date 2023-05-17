package dsa.multidimensional;
import java.util.Scanner;

public class SampleEx {
 
	static void Type1() {
		int arr[][]= { {1,2,3,7,8,6,9},
		                {4,5,6}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	static void Type2() {
		 Scanner sc=new Scanner(System.in);
		int m=2,n=3;
		int arr[][]=new int[m][n];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 arr[i][j]=sc.nextInt();	
			}
			System.out.println();
		}
		sc.close();
	}
	static void jagged() {
		int m=3;
		int arr[][]=new int[m][];
		for (int i = 0; i < arr.length; i++) {
			int arr[i]=new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=i;
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void passargs(int arr[][]){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 Type1();
		 Type2();
		 int arr[][]= { {3,4,5,6},
				          {8,9,10}}; 
		 passargs(arr);
		 }	

}
