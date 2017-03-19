import java.util.*;

import javax.sound.midi.SysexMessage;

public class PalindromeNumber 
{
	public int reversedNumber(int number)
	{
		int rev=0;
		while(number!=0)
		{
			rev = rev*10;
			rev = rev+number%10;
			number = number/10;
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter an integer -> ");
		int number = input.nextInt();
		input.close();
		PalindromeNumber sample = new PalindromeNumber();
		int reversedNumber = sample.reversedNumber(number);
		if (number==reversedNumber)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}

}
