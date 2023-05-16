package dsa.sorting;

public class Union {
	
	static void union(int[]a,int[]b) {
		
		int n=a.length;
		int m=b.length;
		int i=0,j=0;
		while(i<n && j<m) {
			if(j>0 && a[j]==a[j-1]) {j++;continue;}
			if(i>0 && a[i]==a[i-1]) {i++;continue;}
			
			System.out.println(i+" "+j);
			System.out.println(a[i]+" "+b[j]);
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}
			else if(a[i]>b[j]) {
				System.out.println(b[j]);
				j++;
			}
			else if(a[i]==b[j]){
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
		while(i<n) { 
			if(i>0 && a[i]!=a[i-1])
			System.out.println(a[i]);
			i++;
			}
		while(j<m) {
			if(j>0 && a[j]!=a[j-1])
			System.out.println(a[j]);
			j++;
			}
	}
	public static void main(String[] args) {
		 int[]a= {3,5,8,9,9,9,9,10,11};
		 int[]b= {2,8,9,9,9,9,10,15,16};
		 union(a,b);
	}

}
