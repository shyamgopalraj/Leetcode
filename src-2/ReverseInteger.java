
import java.util.*;

public class ReverseInteger 
{
	public int reversedNumber(int number)
	{
		ArrayList<Integer> store = new ArrayList<Integer>();
		int remainder=0,quotient=0,copyofnumber = number;
		if (number<0)
		{
			number = number*-1;
		}
		while((number/10)!=0)
		{
			quotient = number/10;
			remainder = number%10;
			number = quotient;
			store.add(remainder);
		}
		store.add(number);
		
		ListIterator<Integer> itr = store.listIterator();
		StringBuilder buildstr = new StringBuilder();
		while(itr.hasNext())
		{
			buildstr.append(itr.next());
		}
		
		int reversedInteger = Integer.parseInt(buildstr.toString());
		if (copyofnumber<0)
		{
			return checkIntegerOverflow(reversedInteger*-1);
		}
		else
		{
			return checkIntegerOverflow(reversedInteger);
		}
	}
	
	public int reversenumber(int number)
	{
		int rev=0;
		while(number!=0)
		{
			rev = rev*10;
			rev = rev+(number%10);
			number = number/10;
		}
		return rev;
	}
	
	
	public int betterSolution(int number)
	{
		int ans;
		ans = reversenumber(number);
		if (number<0)	
		{	
			return checkIntegerOverflow(ans);			
		}
		else
		{
			return checkIntegerOverflow(ans);
		}		
	}
	
	public int checkIntegerOverflow(int reversedInteger)
	{
		if (reversedInteger>Integer.MAX_VALUE || reversedInteger<Integer.MIN_VALUE)
		{
			return 0;
		}
		else
		{
			return reversedInteger;
		}
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("enter an integer to be reversed - ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		System.out.println("entered integer is - "+number);
		ReverseInteger sample = new ReverseInteger();
		int reversedNumber = sample.betterSolution(number);
		System.out.println("reversed number is - "+reversedNumber);		
	}

}
