import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double x = 0;
		double s;
		s = 1.0 / (1 + n * n);
		System.out.println(s);
		while (s > 0.01)
		{
			
			n++;
			x = x + s;
			s = 1.0 / (1 + n * n);
			System.out.println(s);
		}	
		in.close();
	}
}
