
public class Squares {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int j=4;
		int square = 0;
		System.out.println("Using counter-controlled while-loop");
		System.out.println("Original and Squared Numbers:");
		while(j<=10)
		{
			square = j*j;
			System.out.println(+j+" "+square);
			j++;
		}
		
		System.out.println();
		
		System.out.println("Using for-loop");
		System.out.println("Original and Squared Numbers:");
		for (int i=10;i>=4;i--)
		{
			square = i*i;
			System.out.println(+i+" "+square);
		}
	}

}
