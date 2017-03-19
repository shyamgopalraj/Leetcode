import java.util.Scanner;

public class ImplementStrStr
{
	public String findSubString(String whole,String part)
	{
		int j=0;
		for (int i=0;i<whole.length();i++)
		{
			if (whole.charAt(i)==part.charAt(j))
			{
				if (j==part.length()-1)
				{
					return part;
				}
				else
				{
					j++;
				}				
			}
			else
			{
				if (j>0)
				{
					j=0;
				}				
			}
		}
		return null;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("enter string - ");
		Scanner input = new Scanner(System.in);
		String whole = input.next();
		System.out.print("enter sub-string to be searched - ");
		String part = input.next();
		input.close();
		ImplementStrStr sample = new ImplementStrStr();
		String result = sample.findSubString(whole, part);
		if(result==null)
		{
			System.out.println("SubString not present");
		}
		else
		{
			System.out.println("SubString is present - "+result);
		}
	}

}
