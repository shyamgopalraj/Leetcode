import java.util.Scanner;
import java.lang.Math;

public class HeapOperations
{
	Scanner input = new Scanner(System.in);
	int count=-1;
	int parent = 0;
	int leftChildIndex = 0;
	int rightChildIndex = 0;
	public void addToHeap(int[] Myarray,int arraySize)
	{
		count++;
		System.out.print("enter the elements of array");
		if(count==0)
		{
			Myarray[count] = input.nextInt();
		}
		else
		{
			if(count<arraySize)
			{
				parent = Math.floorDiv(count, 2);
				Myarray[count] = input.nextInt();
				if(Myarray[count]>Myarray[parent])
				{
					int child = count;
					heapifyUp(Myarray,child);
				}
			}
				
			else
			{
				System.out.println("exceeding the size of array");
			}			
		}		
	}
	
	public void heapifyUp(int[] Myarray,int child)
	{
		if(child==0)
		{
			return;
		}
		else			
		{
			int parent = Math.floorDiv(child, 2);
//			System.out.println("parent - "+parent);
//			System.out.println("child - "+child);
			if(Myarray[parent]>Myarray[child])
			{
				swap(parent,child,Myarray);
				heapifyUp(Myarray, parent);
			}			
		}		
	}
	
	public void swap(int parent,int child,int[] Myarray)
	{
		int temp = Myarray[parent];
		Myarray[parent] = Myarray[child];
		Myarray[child] = temp;
	}
	
	public void heapifyDown(int[] Myarray)
	{
		if(count==0)
		{
			System.out.println("NO elements to perform heapify");
		}
		else
		{
			makeTheLastElemenyFirst(Myarray);
//			displayContents(Myarray);
			pushDown(Myarray,0);
		}
	}
	
	public void makeTheLastElemenyFirst(int[] Myarray)
	{
		Myarray[0]=Myarray[count];
		Myarray[count]=-1;
		count--;		
	}
	
	public void pushDown(int[] Myarray,int parentIndex)
	{	
		int minIndex=0; 	
		while(parentIndex<=count)
		{
			leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
			if (leftChildIndex<=count && rightChildIndex<=count)
			{
				if(Myarray[leftChildIndex]<Myarray[rightChildIndex])
				{
					minIndex = leftChildIndex;
					if(Myarray[parentIndex]>Myarray[minIndex])
					{
						swap(parentIndex, minIndex, Myarray);
						pushDown(Myarray,minIndex);
					}
				}
				else
				{
					minIndex = rightChildIndex;
					if(Myarray[parentIndex]>Myarray[minIndex])
					{
						swap(parentIndex, minIndex, Myarray);
						pushDown(Myarray,minIndex);
					}
				}
			}
			if (leftChildIndex<=count)
			{
				if(Myarray[parentIndex]>Myarray[leftChildIndex])
				{
					swap(parentIndex, leftChildIndex, Myarray);
					pushDown(Myarray,leftChildIndex);
				}				
			}
			else if (rightChildIndex<=count)
			{
				if(Myarray[parentIndex]>Myarray[rightChildIndex])
				{
					swap(parentIndex, rightChildIndex, Myarray);
					pushDown(Myarray,rightChildIndex);
				}				
			}
			else
			{
				return;
			}
		}		
	}
	
	public void displayContents(int[] Myarray)
	{
		for (int i=0;i<=count;i++)
		{
			System.out.print(Myarray[i]+",");
		}
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.print("enter the size of array");
		Scanner input = new Scanner(System.in);
		int arraySize = input.nextInt();
		int[] Myarray = new int[arraySize];
		HeapOperations sample = new HeapOperations();
		for (int i=0;i<Myarray.length;i++)
		{
			sample.addToHeap(Myarray,arraySize);
		}		
		input.close();
		System.out.print("contents of the array - ");
		sample.displayContents(Myarray);
		sample.heapifyDown(Myarray);
		System.out.println();
		System.out.print("contents of the array after heapifydown - ");
		sample.displayContents(Myarray);
	}

}
