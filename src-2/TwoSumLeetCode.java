import java.util.HashMap;

public class TwoSumLeetCode {
	
	public int[] twoSum(int target,int[] a)
	{
		int[] indices = new int[2];
		HashMap<Integer, Integer> store = new HashMap<Integer,Integer>();
		store.put(a[0], 0);
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>=target)
			{
				continue;
			}
			else
			{
				int diff = target-a[i];
				if(store.containsKey(diff))
				{
					indices[0] = store.get(diff);
					indices[1] = i;
					break;
				}
				else
				{					
					store.put(a[i], i);
				}
			}
		}
		return indices;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = {2, 7, 11, 15};
		int target = 9;
		TwoSumLeetCode sample = new TwoSumLeetCode();
		int[] result= sample.twoSum(target, a);
		System.out.print("indices of elements whose sum equals target - "+target+" are - ");
		for (int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+",");
		}
	}

}
