import java.util.*;

public class RemoveElement
{
	public int findElement(int low,int high,ArrayList<Integer> store,int key)
	{
		if (low<high)
		{
			int mid = (low+high)/2;
			int midelement = store.get(mid);
			if (midelement==key)
			{
				return mid;
			}
			else
			{
				if (key>midelement)
				{
					return findElement(mid+1, high, store, key);
				}
				else
				{
					return findElement(0, mid-1, store, key);
				}
			}								
		}
		else
		{
			return -1;	
		}			
	}
	
	public ArrayList<Integer> removeElement(ArrayList<Integer> store,int key)
	{
		int keypos = findElement(0,store.size()-1,store,key);
		int keyvalue = store.get(keypos);		
		store.remove(keypos);
		//As next element will take key position
		while(keypos<store.size() && store.get(keypos)==keyvalue)
		{
			store.remove(keypos);
		}
		// removing occurrence of element before key position
		if (keypos!=0)
		{
			int prevkey = keypos-1;
			while(prevkey >= 0 && keyvalue == store.get(prevkey))
			{
				store.remove(prevkey);
				prevkey--;
			}
		}
		return store;		
	}
	
	public void display(ArrayList<Integer> store)
	{
		Iterator<Integer> itr = store.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("enter the number of elements - ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		ArrayList<Integer> store = new ArrayList<Integer>();
		for (int i=0;i<size;i++)
		{
			System.out.print("enter elements - ");
			int element = input.nextInt();
			store.add(element);
		}
		System.out.print("enter element to be removed - ");
		int key = input.nextInt();
		input.close();
		//sorting input array
		Collections.sort(store);
		RemoveElement sample = new RemoveElement();
		System.out.print("contents of array list before removing key element - ");
		sample.display(store);
		store = sample.removeElement(store, key);
		System.out.print("contents of array list after removing key element - ");
		sample.display(store);
		System.out.print("new length  - "+store.size());
	}

}
