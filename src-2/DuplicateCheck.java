import java.util.HashSet;
import java.util.Set;



public class DuplicateCheck {
	
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void add(int data)
	{
		Node newnode = new Node(data);
		if (head == null)
		{
			head = newnode;
		}
		else
		{
			Node cur = head;
			while (cur.next!= null)
			{
				cur = cur.next;
			}
			cur.next = newnode;			
		}
		System.out.format("%d - added to linkedlist \n",data);
	}
	
	public void display()
	{
		if (head == null)
		{
			System.out.println("No elements to display");
		}
		else
		{
			Node cur = head;
			System.out.print("elements of linkedlist - ");
			while (cur!= null)
			{				
				System.out.format("%d,",cur.data);
				cur = cur.next;
			}
		}
		System.out.println();
	}	
	
	public void removeDuplicates()
	{
		Node cur = head;
		Node prev = head;
		Set<Integer> uniques = new HashSet<Integer>();
		if (cur == null)
		{
			System.out.print("Linked lisrt empty");
		}
		else if(cur.next == null)
		{
			System.out.print("Only one element in Linked list");
		}
		else
		{
			while (cur!=null)
			{
				if (uniques.contains(cur.data))
				{
					prev.next = cur.next;
					cur = cur.next;
				}
				else
				{
					uniques.add(cur.data);
					prev = cur;
					cur = cur.next;					
				}
			}
		}
	}
	
	public void removeDuplicateWithoutTempBuffer()
	{
		Node prev = head;		
		if (prev == null)
		{
			System.out.print("Linked lisrt empty");
		}
		else if(prev.next == null)
		{
			System.out.print("Only one element in Linked list");
		}
		else
		{
			for (int compareElement = prev.data;prev!=null;prev=prev.next)
			{
				Node cur;
				cur = prev.next;
				while (cur!= null)
				{
					if (cur.data == compareElement)
					{
						prev.next = cur.next;
						
					}
					cur = cur.next;
				}
					
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DuplicateCheck tryMe = new DuplicateCheck();
		tryMe.add(10);
		tryMe.add(20);
		tryMe.add(50);
		tryMe.add(30);
		tryMe.add(20);
		tryMe.display();
		tryMe.removeDuplicates();
		System.out.println("displaying using buffer");
		tryMe.display();
		tryMe.removeDuplicateWithoutTempBuffer();
		System.out.println("displaying without using buffer");
		tryMe.display();
	}
}
