package dsa.matrix;

public class Transpose {
	static void transposedisplay(int a[][]) {
		int n=a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
	static void transpose(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		int n=a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
 
		 int arr[][]= { { 1,2,3,4},
			        {5,6,7,8},
			        {9,10,11,12},
			        {13,14,15,16}};
	transpose(arr);
	}

}
