package dsa.matrix;

 

public class Rotate90 {
	
	static void rotate(int a[][]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[j][n-i-1]+" ");
			}
			System.out.println();
		}
		}

	public static void main(String[] args) {
 
		 int arr[][]= { { 1,2,3,4},
			        {5,6,7,8},
			        {9,10,11,12},
			        {13,14,15,16}};
		 rotate(arr);
	}

}
