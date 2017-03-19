import java.util.Scanner;

public class BubbleSort {
	
	public void swap(int i,int j,int[] inputArray)
	{
		int big = inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]=big;
		
	}
	
	public int[] sort(int[] inputArray,int lastIndex)
	{
		int i=0,j=i+1;
		while(lastIndex>0)
		{
			if(inputArray[i]>inputArray[j])
			{
				swap(i, j, inputArray);
			}
			i=j;
			if(i==lastIndex)
			{
				i=0;
				j=i+1;
				lastIndex=lastIndex-1;
			}
			else
			{
				j=j+1;
			}			
		}
		return inputArray;
	}
	
	

	public static void main(String args[])
	{
		System.out.println("enter the size of unsorted array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] inputArray = new int[size];
		System.out.println("enter the elements of array");
		for (int i=0;i<size;i++)
		{
			inputArray[i]=input.nextInt();
		}
		input.close();
		BubbleSort sample = new BubbleSort();
		int[] resultArray =  sample.sort(inputArray,size-1);
		System.out.println("sorted array - ");
		for (int j=0;j<size;j++)
		{
			System.out.print(resultArray[j]);
		}		
	}
}
