import java.util.Scanner;
import java.lang.Math;
public class StringToInteger
{
	public int solution(String s)
	{
		int sLength = s.length()-1;
		int digit = 0;
		int number = 0;
		char c = 0;
		char flag=0;
		for(int i = 0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(i==0 && ((c=='+'||c=='-')))
			{
				flag = c;
			}
			else
			{
				if(c>='0'|| c<='9')			
				{
					digit = c -'0';
					digit = (int) (digit*Math.pow(10,sLength));
					number = number+digit;
				}
			}								
			sLength--;
		}		
		
		if (flag == '-')
		{
			number = -number;
		}
		if(number > Integer.MAX_VALUE)
		{
			return Integer.MAX_VALUE;
		}
		else if (number < Integer.MIN_VALUE)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return number;
		}	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter input : ");
		String s = input.next();
		input.close();
		s.trim();
		s.replaceAll("\\s+","");
		StringToInteger sample = new StringToInteger();
		int result = sample.solution(s);
		System.out.println(result);
	}
}
