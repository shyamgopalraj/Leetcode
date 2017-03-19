

public class DeleteMiddleNode {
	
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
	
	public void removeMiddle()
	{
		Node hare = head;
		Node tor = head;
		
		if (hare==null)
		{
			System.out.println("Empty linked list");			
		}
		else if (hare.next == null)
		{
			System.out.println("only one element in linked list");	
		}
		else
		{
			Node snail=tor;
			while(hare.next != null )
			{
				snail=tor;
				tor = tor.next;
				hare = hare.next.next;
			}
			snail.next = tor.next;
			snail = null;
						
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DeleteMiddleNode checkMe = new DeleteMiddleNode();
		checkMe.add(10);
		checkMe.add(20);
		checkMe.add(30);
		checkMe.add(40);
		checkMe.add(60);
		
		checkMe.removeMiddle();
		checkMe.display();
	}
}
