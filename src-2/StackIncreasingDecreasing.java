
import java.util.Stack;
import java.util.Iterator;



public class StackIncreasingDecreasing
{
	int temp=0;
	
	
	
	public Stack<Integer> ascending(Stack<Integer> s1,Stack<Integer> sortedStack)
	{
		if (s1.isEmpty())
		{
			System.out.println("No elements to sort");	
			return s1;
		}
		else
		{
			while(!s1.isEmpty())
			{
				if(sortedStack.isEmpty())
					sortedStack.push(s1.pop());
				else
				{
					if(s1.peek()<sortedStack.peek())
					{
						temp=s1.pop();
						while(sortedStack.isEmpty()==false)
						{
							if (temp<sortedStack.peek())
								s1.push(sortedStack.pop());
							else
								break;								
						}	
						sortedStack.push(temp);
					}
					else
						sortedStack.push(s1.pop());					
				}
			}
			return sortedStack;
		}
		
	}
	
	
	public Stack<Integer> descending(Stack<Integer> s1,Stack<Integer> sortedStack)
	{
		if (s1.isEmpty())
		{
			System.out.println("No elements to sort");	
			return s1;
		}
		else
		{
			while(!s1.isEmpty())
			{
				if(sortedStack.isEmpty())
					sortedStack.push(s1.pop());
				else
				{
					if(s1.peek()>sortedStack.peek())
					{
						temp=s1.pop();
						while(sortedStack.isEmpty()==false)
						{
							if (temp>sortedStack.peek())
								s1.push(sortedStack.pop());
							else
								break;								
						}	
						sortedStack.push(temp);
					}
					else
						sortedStack.push(s1.pop());					
				}
			}
			return sortedStack;
		}
		
	}
	
	
	
	public void display(Stack<Integer> showMe)
	{
		Iterator<Integer> iter;
		iter = showMe.iterator();
		System.out.print("contents of stack are - ");	
		while(iter.hasNext())
		{
			int element = iter.next();
			System.out.print(element+",");		
		}
		System.out.println();
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();	
		Stack<Integer> inreasingStack = new Stack<Integer>();
		Stack<Integer> DecreasingStack = new Stack<Integer>();
		stack.push(10);
		stack.push(0);
		stack.push(20);
		stack.push(1);
		stack.push(2);	
		StackIncreasingDecreasing sample = new StackIncreasingDecreasing();	
		sample.display(stack);
		inreasingStack = sample.ascending(stack,inreasingStack);
		sample.display(inreasingStack);
		stack.push(10);
		stack.push(0);
		stack.push(20);
		stack.push(1);
		stack.push(2);
		DecreasingStack = sample.descending(stack, DecreasingStack);
		sample.display(DecreasingStack);
		
	}

}
