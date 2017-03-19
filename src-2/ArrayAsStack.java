
public class ArrayAsStack
{
	
	int[] Arrayasstack = new int[5];
	int count = -1;
	
	public void push(int data)
	{	
//		System.out.println("Arraylength - "+Arrayasstack.length);
		
		if (count < Arrayasstack.length-1)
		{
			count++;
			Arrayasstack[count]=data;
			System.out.println("Elements inserted- "+data);
			System.out.println("count -  "+count);
		}
		else
			System.out.println("cannot insert any more element as its exceeding limit");			
	}
	
	public void pop()
	{
		if(count==-1)
		{
			System.out.println("Empty Stack");	
		}
		else if (count >= 0)
		{
			System.out.println("Popped element is - "+Arrayasstack[count]);
			Arrayasstack[count] = -1;
			count--;
		}
	}
	
	public void peek()
	{
		if (count==-1)
		{
			System.out.println("No elements in stack");	
		}
		else
		{
			System.out.println("stack peek is - "+Arrayasstack[count]);	
		}
	}
	
	public void display()
	{
		if (count==-1)
		{
			System.out.println("No elements in stack");	
		}
		else
		{
			System.out.print("Elements to be displayed - ");
			for (int i=0;i<=count;i++)
			{
				System.out.print(Arrayasstack[i]+",");	
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayAsStack letsstack = new ArrayAsStack();
		letsstack.push(10);
		letsstack.push(20);
		letsstack.push(30);
		letsstack.push(40);
		letsstack.push(50);
		letsstack.push(60);
		letsstack.peek();
		letsstack.display();
		letsstack.pop();
		letsstack.display();
		
		
	}

}
