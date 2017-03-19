import java.util.*;

public class AssignCookies {
	
	int result = 0;
	
	public int maxSatisfyGreedFactor(int[] childArray,int[] cookieArray,int num_of_child,int num_of_cookies)
	{
		int j = num_of_child -1;
		for (int i =num_of_cookies-1;i>=0;i--)
		{
			if (j<0)
			{
				break;
			}
			else
			{
				while(j>=0)
				{
					if(cookieArray[i]>=childArray[j])
					{
						result++;
						j--;
						break;
					}
					else
					{
						j--;
					}
				}
			}			
		}
		return result;
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("enter number of children");
		Scanner input = new Scanner(System.in);
		int num_of_child = input.nextInt();
		int[] childArray = new int[num_of_child];
		for (int i=0;i<num_of_child;i++)
		{
			System.out.print("enter child greed");
			childArray[i] = input.nextInt();
		}
		System.out.print("enter number of cookie");
		int num_of_cookies = input.nextInt();
		int[] cookieArray = new int[num_of_cookies];
		for (int j=0;j<num_of_cookies;j++)
		{
			System.out.print("enter cookie sizes");
			cookieArray[j]=input.nextInt();
		}
		input.close();
		AssignCookies sample = new AssignCookies();
		int result = sample.maxSatisfyGreedFactor(childArray, cookieArray,num_of_child,num_of_cookies);
		System.out.println("result - "+result);
		
	}

}
