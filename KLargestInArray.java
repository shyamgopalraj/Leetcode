import java.util.Arrays;
import java.util.Scanner;

public class KLargestInArray 
{
	public int solution(int[] nums,int k)
	{
		Arrays.sort(nums);
		int lastElement = nums.length-1;
		int NumOfComparision = 0;
		int iPrev=lastElement-1;
		//when all elements of array are same
		if(nums[0]==nums[lastElement])
		{
			return lastElement;
		}
		else if(k==1)
		{
			return lastElement;
		}
		else if(k==nums.length)
		{
			return nums[0];
		}
		else
		{
			while(iPrev>=0)
			{
				if(nums[lastElement]!=nums[iPrev])
				{
					NumOfComparision++;
					if(NumOfComparision==k-1)
					{
						break;
					}					
				}
				lastElement--;
				iPrev--;
			}
		}
		return nums[iPrev];
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int sizeOfArray = input.nextInt();
		int[] nums = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++)
		{
			System.out.print("enter the array elemens : ");
			nums[i]=input.nextInt();
		}
		KLargestInArray sample = new KLargestInArray();
		System.out.print("enter Kth largest element to be found in array : ");
		int k = input.nextInt();
		int result = sample.solution(nums, k);
		input.close();
		System.out.println("Kth largest element is : "+result);		
	}
}
