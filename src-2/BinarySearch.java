import java.util.Scanner;


public class BinarySearch 
{
	int mid=0;
	public boolean search(int[] a,int l,int h,int key)
	{
		int low=l;
		int high =h;
		mid = (low+high)/2;		
		if(a[mid]==key)
		{
			return true;
		}
		else
		{
			if (key<a[mid])
			{
				if(mid==0)
				{
					return false;
				}
				else
				{
					return search(a, 0,mid-1, key);
				}				
			}
			else
			{
				if(mid==high)
				{
					return false;
				}
				else
				{
					return search(a, mid+1,high, key);
				}				
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size = input.nextInt();
		int[] seacharray = new int[size];
		System.out.println("Enter sorted array");
		for(int i=0;i<size;i++)
		{
			int element = input.nextInt();
			seacharray[i]=element;
		}
		int low = 0;
		int high = size-1;
		BinarySearch sample = new BinarySearch();
		System.out.println("Enter key to be searched");
		int key = input.nextInt();		
		boolean result = sample.search(seacharray,low,high,key);
		if (result)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
		input.close();		
	}

}
