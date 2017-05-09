import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram
{
	public boolean solution(String source,String test)
	{
		int sLength = source.length();
		int tLength = test.length();
		char c;
		int count = 0;
		if(sLength!=tLength)
		{
			return false;
		}
		else
		{
			Map<Character, Integer> store = new HashMap<>();
			
			for(int i=0;i<sLength;i++)
			{
				c=source.charAt(i);
				if(store.isEmpty())
				{
					store.put(c,1);
				}
				else
				{
					if(store.containsKey(c))
					{
						store.put(c,store.get(c)+1);
					}
					else
					{
						store.put(c,1);
					}
				}
			}
			
			
			for(int i=0;i<tLength;i++)
			{
				c=test.charAt(i);
				
				if(store.containsKey(c))
				{
					count = store.get(c);
					if(count>0)
					{
						count--;
						if(count == 0)
						{
							store.remove(c);
						}
						else
						{
							store.put(c, count);
						}
					}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}				
			}
			return true;			
		}		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ValidAnagram sample = new ValidAnagram();
		Scanner input = new Scanner(System.in);
		System.out.print("enter source string : ");
		String source = input.next();
		System.out.print("enter test string : ");
		String test = input.next();
		boolean result = sample.solution(source, test);
		input.close();
		if(result)
		{
			System.out.println("Its an Anagram");
		}
		else
		{
			System.out.println("Its NOT an Anagram");
		}		
	}

}
