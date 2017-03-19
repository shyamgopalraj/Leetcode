import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;

public class HappyNumber 
{
	public boolean bruteforce(String number)
	{
		boolean happy = false;
		int sum = 0;
		int digit = 0;
		while (!happy)
		{
			for(int i=0;i<number.length();i++)
			{
				digit = number.charAt(i)-'0';
				System.out.println("digit - "+digit);
				sum = sum+(digit*digit);
				System.out.println("sum - "+sum);
			}
			
			if(sum==1)
			{
				happy = true;
			}
			else
			{
				number = String.valueOf(sum);
				sum=0;
			}
			
//			System.out.println("sum - "+sum);
		}	
		return true;
	}
	
	
	
	public boolean bettersolution(int number,Stack<Integer> store)
	{
		
		int remainder=0,digit = 0,sum = 0;
		
		while((number/10)!=0)
		{
			remainder = number%10;
			store.push(remainder);
			System.out.println("remainder - "+remainder);
			number = number/10;		
			System.out.println("number - "+number);
		}
		
		store.push(number);
		System.out.println("number - "+number);
		
		while(!store.empty())
		{
			digit = store.pop();
			System.out.println("digit - "+digit);
			sum = sum+(digit*digit);
		}
		
		System.out.println("sum - "+sum);
		
		if(sum==1)
		{
			return true;
		}
		else
		{
			return bettersolution(sum,store);
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		System.out.print("enter number (input as String) -  ");
		System.out.print("enter number  -  ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		Stack<Integer> store = new Stack<Integer>();
		HappyNumber bettersol = new HappyNumber();
		boolean ans = bettersol.bettersolution(number,store);
		if(ans)
		{
			System.out.println("happy number");
		}
		else
		{
			System.out.println(" Not a happy number");
		}
			
			
//		HappyNumber sample = new HappyNumber();
//		boolean result = sample.bruteforce(number);
//		
//		if(result)
//		{
//			System.out.println("happy number");
//		}
//		else
//		{
//			System.out.println(" Not a happy number");
//		}
		
		
	}

}
