package dsa.matrix;

public class SpiralTravs {

	static void spiral(int a[][]) {
		int r=a[0].length;
		int c=a.length;
		int top=0,left=0,right=r-1,bottom=c-1;
		 while(top<=bottom && left<=right) {
			 for(int i=left;i<=right;i++)
				 System.out.print(a[top][i]+" ");  //top row 
			 top++;
			 
			 for(int i=top;i<=bottom;i++)
				 System.out.print(a[i][right]+" ");  //right column
			 right--;
			 
			 if(top<=bottom) {
				 for(int i=right;i>=left;i--)
					 System.out.print(a[bottom][i]+" ");  //bottom row(recursive order)
				 bottom--;
				 
			 if(left<=right) {
				 for(int i=bottom;i>=top;i--)
					 System.out.print(a[i][left]+" ");  //left row(recursive order)
				 left++;
			 }
			 }
		 }
	}
	
	public static void main(String[] args) {
 
		int arr[][]= { { 1,2,3,4},
		        {5,6,7,8},
		        {9,10,11,12},
		        {13,14,15,16}};
		spiral(arr);
	}

}
