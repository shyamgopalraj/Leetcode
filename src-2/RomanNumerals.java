import java.util.*;

public class RomanNumerals
{
	public String numberToRoman(int number,Map<Integer,String> numberToRoman)
	{
		// get  individual digits 
		int count=0,digit;
		StringBuilder roman = new StringBuilder();
		while(number!=0)
		{
			digit = number%10;
			number = number/10;
			if (digit == 0)
			{
				count++;
				continue;
			}
			else
			{
				int diff=0;
				if (count==0)
				{
					roman.insert(0,numberToRoman.get(digit));
					count++;
				}
				else if (count==1)
				{
					if (digit==9)
					{
						roman.insert(0,"XC");
					}
					else if (digit>5)
					{
						diff = digit-5;		
						for (int i=0;i<diff;i++)
						{
							roman.insert(0,numberToRoman.get(10));
						}
						roman.insert(0,numberToRoman.get(50));
					}
					else
					{
						roman.insert(0,numberToRoman.get(10));
					}	
					count++;
				}
				else if (count==2)
				{
					if (digit==9)
					{
						roman.insert(0,"CM");
					}
					else if (digit>5)
					{
						diff = digit-5;		
						for (int i=0;i<diff;i++)
						{
							roman.insert(0,numberToRoman.get(100));
						}
						roman.insert(0,numberToRoman.get(500));
					}
					else
					{
						roman.insert(0,numberToRoman.get(100));
					}	
					count++;
				}
				else if (count==3)
				{
					for (int i=0;i<digit;i++)
					{
						roman.insert(0,numberToRoman.get(1000));
					}			
				}
			}
		}
		String result = roman.toString();
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("enter a numeral from (0 to 3999) to be converted to Roman -> ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		Map<Integer,String> numberToRoman = new HashMap<>();
		numberToRoman.put(1,"I");
		numberToRoman.put(2,"II");
		numberToRoman.put(3,"III");
		numberToRoman.put(4,"IV");
		numberToRoman.put(5,"V");
		numberToRoman.put(6,"VI");
		numberToRoman.put(7,"VII");
		numberToRoman.put(8,"VIII");
		numberToRoman.put(9,"IX");
		numberToRoman.put(10,"X");
		numberToRoman.put(50,"L");
		numberToRoman.put(100,"C");
		numberToRoman.put(500,"D");
		numberToRoman.put(1000,"M");	
		RomanNumerals sample = new RomanNumerals();
		String roman = sample.numberToRoman(number,numberToRoman);
		System.out.println("Roman equivalent of numeral is -> "+roman);
	}
}
