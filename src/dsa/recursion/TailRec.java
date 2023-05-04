package dsa.recursion;

public class TailRec {

	static void tailRec(int n,int i) {
		if(n==0)
			return;
		 
		System.out.println(i);
		tailRec(n-1,i+1);          //function call is the last element 
	}
	public static void main(String[] args) {
         tailRec(5,1);
	}

}
