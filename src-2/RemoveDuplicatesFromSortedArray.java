import java.util.*;

public class RemoveDuplicatesFromSortedArray
{
	
	public int[] swap(int i,int j,int a[])
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		return a;
	}
	public int[] removeDuplicates(int[] a)
	{
		int i=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				a[j]=0;
				continue;
			}
			else
			{
				if(j-i==1)
				{
					i++;
				}
				else
				{
					i=i+1;
					a = swap(i,j,a);
				}
			}		
		}
		return a;
	}
	
	public void displayArrayContent(int[] a)
	{
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	
	public void arrayListcontent(ArrayList<Integer> store)
	{
		Iterator<Integer> itr = store.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
	}
	
	public ArrayList<Integer> removeDuplicateArrayList(ArrayList<Integer> store)
	{
		int pos = 0;	
		int nextElementpos = pos+1;
		while(nextElementpos<store.size())
		{
			if (store.get(pos)==store.get(nextElementpos))
			{
				store.remove(nextElementpos);
			}
			else
			{
				pos=nextElementpos;
				nextElementpos = pos+1;
			}
		}
		return store;
	}

	public static void main(String[] args)
	{
		// Using arrays
//		System.out.print("enter the size of array(number of elements in array) - ");
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		int[] a = new int[size];
//		for (int i=0;i<size;i++)
//		{
//			System.out.print("enter items - ");
//			a[i]=input.nextInt();
//		}	
//		RemoveDuplicatesFromSortedArray sample = new RemoveDuplicatesFromSortedArray();
//		System.out.print("contents of array before removing duplicate items - ");
//		sample.displayArrayContent(a);
//		a = sample.removeDuplicates(a);		
//		System.out.print("contents of array after removing duplicate items - ");
//		sample.displayArrayContent(a);
		
		// Using array list
		Scanner input = new Scanner(System.in);
		System.out.print("enter number of elements to arraylist - ");
		int size = input.nextInt();
		ArrayList<Integer> store = new ArrayList<Integer>();
		int item=0;
		for (int i=0;i<size;i++)
			{
				System.out.print("enter item - ");
				item = input.nextInt();
				store.add(item);
			}
		
		RemoveDuplicatesFromSortedArray arrayListSample = new RemoveDuplicatesFromSortedArray();
		arrayListSample.arrayListcontent(store);
		store = arrayListSample.removeDuplicateArrayList(store);
		arrayListSample.arrayListcontent(store);
		input.close();
		
	}

}
