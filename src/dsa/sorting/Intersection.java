package dsa.sorting;

public class Intersection {

	static void intersection(int a[],int[]b) {
		int n=a.length;
		int m=b.length;
		int i=0,j=0;
		while(i<n && j<m) {
			 if(i>0 && a[i]==a[i-1]) {i++;continue;}
			 System.out.println("j");
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;j++;
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]){
				j++;
			} 
			
			
		}
	}
	public static void main(String[] args) {
		 int[]a= {3,5,10,10,10,15,15,20};
		 int[]b= {5,10,10,10,10,10,10};
		intersection(a,b);
		  
	}

}
