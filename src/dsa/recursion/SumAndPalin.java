package dsa.recursion;

public class SumAndPalin {

	static int sum(int n) {
		if(n==0)
			return 0;
		
		return n+sum(n-1);
	}
	static boolean palin(String s,int start,int end) {
		 
		if(start>=end)
			return true;
		
		return(s.charAt(start)==s.charAt(end))&&palin(s,start+1,end-1);
	}
	static int sum1(int n) {
		if(n==0)
			return 0;
		return n%10+sum1(n/10);
	}
	public static void main(String[] args) {
     int sol=sum(8);
     int sol1=sum1(253);
     System.out.println(sol1 );
     System.out.println(sol );

	}

}
