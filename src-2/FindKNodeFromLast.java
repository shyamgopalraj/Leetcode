

public class FindKNodeFromLast
{
	
	public class Node
	{
		int data;
		Node Next;
		
		public Node(int data)
		{
			this.data = data;
			this.Next = null;
		}
	}
	
	Node head;
	public void add(int data)
	{
		Node sampleLinked = new Node(data);
		if (head == null)
		{
			
			head = sampleLinked;
		}
		else
		{
			Node cur = head;
			while (cur.Next != null)
			{
				cur = cur.Next;
			}
			cur.Next = sampleLinked;
		}
		
	}
	
	public void show()
	{
		if (head == null)
		{
			System.out.println("empty linked list");
		}
		else
		{
			Node cur = head;
			System.out.print("linked list content - ");
			while (cur!=null)
			{
				System.out.print(+cur.data+",");
				cur=cur.Next;
			}
		}System.out.println();
	}
		
	
	 public void findFromLast(int pos)
	 {
			Node hare,tor;
			hare = head;
			tor = head;
			int counter = 0;
			if (head == null)
			{
				System.out.println("empty linked list");
			}
			else if (hare.Next==null)
			{
				System.out.println("Only one element in linked list");
			}
			else
			{
				while (hare!=null)
				{
					if (counter < pos)
					{
						counter = counter+1;
						hare = hare.Next;
					}
					else
					{
						tor = tor.Next;		
						hare = hare.Next;
					}
				}
				if(tor == head && hare==null)
					System.out.println("exceeding existing length of linked list");
				else
					System.out.println("Element at "+pos+" last position is "+tor.data);
			}
			
		}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FindKNodeFromLast findMe = new FindKNodeFromLast();
		findMe.add(10);
		findMe.add(20);
		findMe.add(30);
		findMe.add(40);
		findMe.add(50);
		findMe.show();
		findMe.findFromLast(3);
	}

}
