import java.util.*;

public class ThreeSum
{
	public int[] removeDuplicates(int[] array)
	{
		Set<Integer> unique = new HashSet<Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(unique.isEmpty())
			{
				unique.add(array[i]);
			}
			else
			{
				if(!unique.contains(array[i]))
				{
					unique.add(array[i]);
				}
			}
		}
		
		int[] a = new int[unique.size()];
		int j=0;
		Iterator<Integer> itr = unique.iterator();
		while(itr.hasNext())
		{
			a[j]=itr.next();
			j++;
		}
		
		return a;
	}
	
	public List<List<Integer>> solution(int[] array)
	{
		// removes duplicates from input array
		
		ArrayList<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<array.length-2;i++)
		{
			if(i>0 && array[i]==array[i-1])
			{
				continue;
			}
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						List<Integer> r = new ArrayList<>();
						r.add(array[i]);
						r.add(array[j]);
						r.add(array[k]);
						
						result.add(r);
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
		int size = input.nextInt();
		int[] array = new int[size];
		int element = 0;
		for(int i=0;i<size;i++)
		{
			System.out.print("enter element into array : ");
			element = input.nextInt();
			array[i]=element;
		}
		input.close();
		ThreeSum sample = new ThreeSum();
//		int[] a = sample.removeDuplicates(array);
		Arrays.sort(array);
		List<List<Integer>> result = sample.solution(array);
		Iterator<List<Integer>> itr = result.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
