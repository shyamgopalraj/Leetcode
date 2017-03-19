import java.util.*;

public class ValidParentheses 
{
	public boolean checkValidity(String parenthesis)
	{
		int length = parenthesis.length();
		Stack<Character> store = new Stack<Character>();
		for (int i=0;i<length;i++)
		{
			if(parenthesis.charAt(i)=='{' || parenthesis.charAt(i)=='(' || parenthesis.charAt(i)=='[')
			{
				store.push(parenthesis.charAt(i));
			}
			else
			{
				if (!(store.empty()))
				{
					if (parenthesis.charAt(i)=='}')
					{
						if (store.peek()=='{')
						{
							store.pop();
							
						}
						else
						{
							return false;
						}
					}
					else if (parenthesis.charAt(i)==']')
					{
						if (store.peek()=='[')
						{
							store.pop();
							
						}
						else
						{
							return false;
						}
					}
					else if (parenthesis.charAt(i)==')')
					{
						if (store.peek()=='(')
						{
							store.pop();							
						}
						else
						{
							return false;
						}
					}
				}
				else
				{
					return false;
				}
			}			
		}
		if (store.empty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("enter the parenthesis as input to check validity -> ");
		Scanner input = new Scanner(System.in);
		String parenthesis= input.next();
		input.close();
		ValidParentheses sample = new ValidParentheses();
		boolean result = sample.checkValidity(parenthesis);
		if (result)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
