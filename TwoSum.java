import java.util.Arrays;
import java.util.Scanner;

public class TwoSum 
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] result = new int[2];
		boolean found = false;
		for(int i=0;i<nums.length-1;i++)
		{
			if(found)
			{
				break;
			}
			else
			{
				for (int j=i+1;j<nums.length;j++)
				{
					if(nums[i]+nums[j]==target)
					{
						result[0] = i;
						result[1] = j;
						found = true;
						break;
					}
				}
			}
			
		}
		
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the size of array : ");		
		int numberOfElements = input.nextInt();
		int[] array = new int[numberOfElements];
		for(int i=0;i<numberOfElements;i++)
		{
			System.out.print("enter element : ");		
			array[i] = input.nextInt();
		}
		System.out.print("enter target value : ");
		int target = input.nextInt();
		TwoSum sample = new TwoSum();
		int[] result = sample.twoSum(array, target);
		input.close();
		System.out.print("Index values are : ");	
		for(int j=0;j<result.length;j++)
		{
			System.out.print(result[j]+",");
		}		
		
	}
}
