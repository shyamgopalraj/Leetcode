import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;


public class StackMin
{
	public class struc
	{
		int data;
		int min;
	}
	
	
	
	public int findMin()
	{		
		Stack<struc> stk = new Stack<struc>();
		int element_num,min=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements to be inserted in stack");
		element_num = input.nextInt();
		for (int i=0;i<element_num;i++)
		{
			struc node = new struc();
			System.out.println("Enter elements to be inserted");
			node.data = input.nextInt();
			if (i==0)
			{
				node.min = node.data;
				min = node.min;
				stk.push(node);
			}
			else
			{
				if (node.data<min)
				{
					node.min = node.data;
					min = node.min;
					
					stk.push(node);
				}
				else
				{
					node.min = min;
					stk.push(node);
				}
			}
		}
		input.close();
		struc node = stk.peek();
		return node.min;
	}
	
	public int findMinBrute()
	{
		Stack<Integer> store = new Stack<Integer>();
		int element_num,min=0,count=0,next_element = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements to be inserted in stack");
		element_num = input.nextInt();
		for (int i=0;i<element_num;i++)
		{
			System.out.println("Enter elements to be inserted");
			int data = input.nextInt();
			store.push(data);
		}	
		Iterator<Integer> iter = store.iterator();		
		while (iter.hasNext())
		{
			if(count == 0)
			{
				min = iter.next();
				count++;
			}
				
			else
			{
				next_element = iter.next();
				if (next_element<min)
				{
					min = next_element;
				}
			}
		}
		input.close();
		return min;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StackMin sample = new StackMin();
		
//		int stackMin = sample.findMin();
//		System.out.println("Minimum element of stack is - "+stackMin);
		
		int stackMinBrute = sample.findMinBrute();
		System.out.println("Minimum element of stack through BruteForce method - "+stackMinBrute);
	}

}
