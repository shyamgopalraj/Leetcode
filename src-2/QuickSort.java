import java.util.Scanner;

public class QuickSort 
{
	public void sortedArray(int[] a)
	{
		quicksort(a,0,a.length-1);
	}
	
	public void quicksort(int[] a,int left,int right)
	{
		if (left<right)
		{
			int pivot = a[(left+right)/2];
			int index = partition(left, right, pivot, a);
			quicksort(a, left,index-1 );
			quicksort(a, index, right);
		}	
		return;
	}
	
	public void swap(int i,int j,int[] a)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public int partition(int left, int right, int pivot, int[] a)
	{
		while(left<=right)
		{
			while(a[left]<pivot)
			{
				left++;
			}
			while(a[right]>pivot)
			{
				right--;
			}
			if(left<=right)
			{
				swap(left, right, a);
				left++;
				right--;
			}
		}
		return left;
		
	}
	
	public void Display(int a[])
	{
		for (int i=0;i<a.length;i++)
		{			
			System.out.print(a[i]+",");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("enter size of array - ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] a = new int[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.print("enter array element - ");
			a[i]=input.nextInt();
		}
		input.close();
		QuickSort sample = new QuickSort();
		System.out.print("Unsorted Array is - ");
		sample.Display(a);
		sample.sortedArray(a);		
		System.out.print("contents of sorted array are - ");	
		sample.Display(a);
	}

}
