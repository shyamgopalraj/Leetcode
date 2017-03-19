import java.util.*;

public class LongestCommonPrefix 
{
	public String findLongestCommonPrefix(String[] words)
	{
//		StringBuilder result = new StringBuilder();
		int minStringPos = minLengthString(words);
		String minString = words[minStringPos];
		int minLength = words[minStringPos].length();
		char[] longestPrefix = new char[minLength];
		int minLow = 0;
		int minHigh = minLength-1;
		int minMid = (minLow+minHigh)/2;
		for (int i=0;i<words.length;i++)
		{
			if(i==minStringPos)
			{
				continue;
			}
			else
			{
				for (int j=minLow;j<=minMid;j++)
				{
					if (words[i].charAt(j)==minString.charAt(j))
					{
						if (longestPrefix[j]==0)
						{
							longestPrefix[j]=words[i].charAt(j);
						}					
					}
					else
					{
						longestPrefix[j]=0;
					}
				}				
			}			
		}		
		
		System.out.println("length of string -  "+longestPrefix.length);
		
		if(longestPrefix[minMid]==minString.charAt(minMid))
		{
			for (int i=0;i<words.length;i++)
			{
				if(i==minStringPos)
				{
					continue;
				}
				else
				{
					for (int j=minMid+1;j<=minHigh;j++)
					{
						if (words[i].charAt(j)==minString.charAt(j))
						{
							if (longestPrefix[j]==0)
							{
								longestPrefix[j]=words[i].charAt(j);
							}					
						}
						else
						{
							longestPrefix[j]=0;
						}
					}				
				}
				
			}			
		}		
		String ans = new String(longestPrefix);
		return ans;
	}
	
	public int minLengthString(String[] words)
	{
		int index = 0;
		int minLength = words[0].length();
		for (int i=1;i<words.length;i++)
		{
			if (minLength<words[i].length())
			{
				continue;
			}
			else
			{
				minLength = words[i].length();
				index = i;
			}
		}
		return index;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("enter the number of strings");
		Scanner input = new Scanner(System.in);
		int arraySize = input.nextInt();
		String[] words = new String[arraySize];
		for (int i=0;i<arraySize;i++)
		{
			System.out.print("enter string");
			words[i] = input.next();
		}
		input.close();		
		System.out.print("Printing contents of string - ");
		for(int j =0;j<arraySize;j++)
		{
			System.out.print(words[j]+",");
		}
		LongestCommonPrefix sample = new LongestCommonPrefix();
		String result = sample.findLongestCommonPrefix(words);
		System.out.println("the longest prefix is - "+result);
	}
}
