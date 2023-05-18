package dsa.matrix;

public class BoudryTrav {

	static void boundarytraversal(int arr[][]) {
		if(arr.length==1) {
			for (int i = 0; i < arr[0].length; i++) 
				System.out.println(arr[0][i]);		
		}
		else if(arr[0].length==1) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i][0]);
			}
		}
		
		else {
			 System.out.println(arr[0].length);
			for (int i = 0; i < arr[0].length; i++) {
				System.out.print(arr[0][i]+" ");
			}
			for (int i = 1; i < arr.length; i++) {
				System.out.print(arr[i][arr[i].length-1]+" ");
			}
			for (int i = arr[arr.length-1].length-2; i >=0; i--) {
				System.out.print(arr[arr.length-1][i]+" ");
			}
			for (int i = arr.length-2; i>=1; i--) {
				System.out.print(arr[i][0]+" ");
				
			}
		}
	}
	public static void main(String[] args) {
//		  int arr[][]= {{1,2,3,4}};
//		  int arr[][]= {{1},{2},{3},{4}};
		 int arr[][]= { { 1,2,3,4},
			        {5,6,7,8},
			        {9,10,11,12},
			        {13,14,15,16}};
		  boundarytraversal(arr);
	}

}
