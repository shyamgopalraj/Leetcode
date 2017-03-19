import java.lang.Math;

public class Arithmetic {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		int m=18;
		
		int a = n/10+n%10;
		int b = n%2+m%2;
		int c = (m+n)/2;
		double d = (m+n)/2.0;
		int e = (int)(0.5*(m+n));
		int f = (int)Math.round(0.5*(m+n));
		
		System.out.println("n / 10 + n % 10 --> "+a);
		System.out.println("n % 2 + m % 2 --> "+b);
		System.out.println("(m+n)/2 --> "+c);
		System.out.println("(m+n)/2.0 --> "+d);
		System.out.println("(int)(0.5*(m+n))--> "+e);
		System.out.println("(int)Math.round(0.5*(m+n))--> "+f);		
	}
}
