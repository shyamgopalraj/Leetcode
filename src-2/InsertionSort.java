import java.util.Scanner;

public class InsertionSort {
	
	int[] result;
	
	public void swap(int i,int j,int result[])
	{
		int temp = result[i];
		result[i] = result[j];
		result[j] = temp;
	}
	
	public int[] sortedarray(int a[])
	{
		result = a;
		int i=0;
		for (int j=1;j<result.length;j++)
		{
			i=j-1;
			while(result[i]>result[j] && i>=0)
			{
				swap(i,j,result);
				i = i-1;
				if(i < 0)
				{
					break;
				}
				else
				{
					j--;
				}
				
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.print("enter the size of array - ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] a = new int[size];
		System.out.println("enter the unsorted integers - ");
		for (int i=0;i<size;i++)
		{
			a[i] = input.nextInt();
		}
		InsertionSort sample = new InsertionSort();
		input.close();
		int[] result = sample.sortedarray(a);
		System.out.print("sorted integers are - ");
		for (int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}
}
