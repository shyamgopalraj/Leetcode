
public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12,y=8,z=5;
		boolean a = (x % z < y && y < z);
		boolean b = (z/y < y | x/y > z);
		boolean c = (!(x < y) && x > y+z);
		boolean d = (x > y && y< z);
		boolean e = (!(x % y < z));
		boolean f = (x == 4 || y > 4);
		System.out.println("(x % z < y and y < z) --> "+a);
		System.out.println("(z/y < y or x/y > z) --> "+b);
		System.out.println("(not(x < y) and x > y+z) --> "+c);
		System.out.println("(x > y < z) --> "+d);
		System.out.println("(not(x % y < z)) --> "+e);
		System.out.println("(x == 4 or y > 4) --> "+f);		
	}

}
