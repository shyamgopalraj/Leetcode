import java.util.Stack;

public class MinStack
{
	Stack<Integer> store = new Stack<Integer>();
	static int min = 0;
	
	public void solution(int[] array)
	{
		store.push(array[0]);
		min = store.peek();
		int newElement = 0;
		for(int i=1;i<array.length;i++)
		{
			newElement = array[i];
			if(newElement<min)
			{
				store.push(2*newElement-min);
				System.out.println("stacks min element value is : "+(2*newElement-min));
				min = newElement;
				System.out.println("min element is : "+min);
			}
			else
			{
				store.push(newElement);
				System.out.println("min element is : "+min);
			}
		}
	}
	
	public void stacksMinAfterRemovingElement()
	{
		int poppeditem = 0;
		while(!store.isEmpty())
		{
			poppeditem = store.pop();
			if(poppeditem<min)
			{
				System.out.println("old min element is : "+min);
				min = 2*min-poppeditem;
				System.out.println("new min element is : "+min);
			}
			else
			{				
				System.out.println("popped  element is : "+poppeditem);
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MinStack sample = new MinStack();
		int[] array = {1,2,0,4,-1,10,-7,11};
		sample.solution(array);
		sample.stacksMinAfterRemovingElement();
	}
}
