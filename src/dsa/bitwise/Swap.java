package dsa.bitwise;

public class Swap {

	static void swap(int a,int b) {
		System.out.println("before a:"+a+",b:"+b);

		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("after  a:"+a+",b"+b);
	}
	static void isPow2(int n) {
		if((n & (n-1))==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void main(String[] args) {
		 //swap(5,6);
		 isPow2(8);
	}

}
