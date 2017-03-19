import java.util.Scanner;
import java.lang.Math;

public class MergeSort 
{
	public void mergesort(int[] inputArray,int low, int high,int[] outputArray)
	{
		if (low<high)
		{
			int mid = (low+high)/2;
			mergesort(inputArray,low,mid,outputArray);
			mergesort(inputArray,mid+1,high,outputArray);
			merge(inputArray,low,high,outputArray);
		}		
	}
	
	public void merge(int[] inputArray,int low,int high,int[] outputArray)
	{
		int i=low;
		int middle=(low+high)/2;
		int j=middle+1;
		int k=i;
//		int size = high-low+1;
		while(i<=middle&&j<=high)
		{
			if(inputArray[i]<=inputArray[j])
			{
				outputArray[k]=inputArray[i];
				i++;
			}
			else
			{
				outputArray[k]=inputArray[j];
				j++;
			}
			k++;
		}
		
		while(j<=high)
		{
			outputArray[k]=inputArray[j];
			k++;
			j++;
		}
		
		while(i<=middle)
		{
			outputArray[k]=inputArray[i];
			k++;
			i++;
		}
		
		//copy output array into input array	
		for (i=low;i<k;i++)
		{
			inputArray[i]=outputArray[i];
		}
		
		
//		System.arraycopy(inputArray, i, outputArray, k, middle-i+1);
//		System.arraycopy(inputArray, j, outputArray, k, high-j+1);
//		System.arraycopy(outputArray, i, inputArray, i, size);
	}
	
	public void displayOutputArray(int[] inputArray)
	{
		System.out.println("Sorted elements of the array are - ");
		for(int i = 0;i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		MergeSort sample = new MergeSort();
		Scanner input = new Scanner(System.in);
		int arraySize = input.nextInt();
		int[] inputArray = new int[arraySize];
		int[] outputArray = new int[arraySize];
		System.out.println("enter the elemets of array");
		for (int i=0;i<arraySize;i++)
		{
			inputArray[i]=input.nextInt();
		}
		input.close();		
		sample.mergesort(inputArray,0,arraySize-1,outputArray);
		sample.displayOutputArray(inputArray);
	}

}
