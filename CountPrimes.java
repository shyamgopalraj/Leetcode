import java.util.Scanner;

public class CountPrimes
{
	
	public boolean checkPrime(int number)
	{
		for(int j=2;j<=number/2;j++)
		{
			if(number%j==0)
			{
				return false;
			}
		}
		return true;
	}
	public int solution(int n)
	{
		int count = 0;
		if(n==0)
		{
			return n;
		}
		else
		{
			for(int i=1;i<n;i++)
			{
				if(checkPrime(i))
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CountPrimes sample = new CountPrimes();
		System.out.print("enter a number to find primes till that number : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
//		boolean result = sample.checkPrime(n);
//		if(result)
//		{
//			System.out.println("its prime ");
//		}
//		else
//		{
//			System.out.println("its not prime ");
//		}
		input.close();
		int numberOfPrimes = sample.solution(n);		
		System.out.println("Number of primes are : "+numberOfPrimes);
	}

}
