
public class MyLinkedList
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
	}	
	
	public boolean search(int key)
	{
		if (head == null)
		{
			return false;
		}
		else
		{
			Node cur = head;
			while(cur!=null)
			{
				if (cur.data == key)
				{
					return true;
				}
				cur = cur.next;					
			}
			
		}
		return false;
	}
	
	public boolean deleteNode(int data)
	{
		Node cur = head;
		Node prev = head;
		
		boolean condition = false;
		
		if (cur==null)
		{
			return condition;
		}
		else
		{
			if (cur!=null)				
			{
				if (cur.next == null && cur.data == data)
				{
					condition = true;
					head = null;
					return condition;
				}
				else
				{
					while (cur!=null)
					{
						if (cur.data==data)
						{
							condition = true;							
							if(prev==head)
							{
								cur=cur.next;
								head = cur;
							}
							else
							{
								cur=cur.next;
								prev.next = cur;
							}
							return condition;
						}
						prev = cur;
						cur=cur.next;												
					}
					
				}
				
			}					

		}
		return condition;
		
	}

	public static void main(String[] args) 
	{
		MyLinkedList firstOne = new MyLinkedList();
		firstOne.add(20);
		firstOne.add(10);
		firstOne.add(100);
		firstOne.add(1);
		firstOne.display();		
		boolean result = firstOne.search(1020);
		if (result)
		{
			System.out.println("item found");
		}
		else
		{
			System.out.println("item not found");
		}
		boolean delnodeRes = firstOne.deleteNode(1);
		if (delnodeRes)
		{
			System.out.println("item deleted");
			firstOne.display();			
		}
		else
		{
			System.out.println("item not found");
		}		
	}

}
