import java.util.Scanner;

public class ReverseString 
{
	public String solution(String s)
	{
		if(s==null)
		{
			return s;
		}
		else
		{
			StringBuilder sb = new StringBuilder();
			String[] sSplit = s.split("\\s+");
			
		
			for(int i=sSplit.length-1;i>=0;i--)
			{
				sb.append(sSplit[i]);
				sb.append(" ");
			}
			return sb.toString();		
		}
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ReverseString sample = new ReverseString();
		Scanner input = new Scanner(System.in);
		System.out.print("enter the string to be reversed : ");
		String s = input.nextLine();
		s = sample.solution(s);
		input.close();
		System.out.println("Reversed string is : "+s);
	}
}
