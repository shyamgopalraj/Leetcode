

public class CyclicLinkedList 
{
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
		int count = 0;
		if (head == null)
		{
			head = newnode;
			count++;
		}
		else
		{
			Node cur = head;
			Node prev = head;
			while (cur.next!= null)
			{
				count++;
				if (count == 2)
				{
					prev = cur;
				}		
				
				cur = cur.next;
			}
			cur.next = newnode;	
			if (data==40)
			{
				newnode.next = prev;
			}
			
		}
		
		System.out.format("%d - added to linkedlist \n",data);
	}
	
	public void checkCyclic()
	{
		Node hare = head;
		Node tor = head;
		if(hare == null)
		{
			System.out.println("No elements in linked list");
		}
		else if(hare.next == null)
		{
			System.out.println("only one element and acyclic");			
		}
		else
		{
			while(hare!=null)
			{
				tor = tor.next;
				hare= hare.next.next;
				if (tor==hare)
				{
					break;
				}
			}
			if (hare==null)
			{
				System.out.println("its Acyclic");
			}
			else
			{
				tor = head;
				while(tor!=hare)
				{
					tor = tor.next;
					hare = hare.next;
				}
				System.out.println("Loop begins at data - "+tor.data);
			}		
		}
	}

	public static void main(String[] args)
	{		
		// TODO Auto-generated method stub
		CyclicLinkedList checkMe = new CyclicLinkedList();
		checkMe.add(10);
		checkMe.add(20);
		checkMe.add(30);
		checkMe.add(40);
//		checkMe.add(60);
//		checkMe.add(70);
		checkMe.checkCyclic();
	}
}
