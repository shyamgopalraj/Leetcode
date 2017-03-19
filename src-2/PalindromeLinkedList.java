import java.util.Stack;

public class PalindromeLinkedList
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
		System.out.println();
	}
	
	public void palindromeCheckBrute()
	{
		Node cur = head;
		if (cur == null)
		{
			System.out.println("No elements to display");	
		}
		else if(cur.next== null)
		{
			System.out.println("Only one element - "+cur.data);	
		}
		else
		{
			Stack<Integer> store = new Stack<Integer>();
			while(cur!= null)
			{
				store.push(cur.data);
				cur = cur.next;				
			}
			
			cur = head;
			while(cur!=null)
			{
				if (cur.data == store.pop())
					cur = cur.next;				
				else					
					break;				
			}
			if (cur==null)
				System.out.println("Its a palindrome!!!");
			else
				System.out.println("Not a palindrome...Booo");
		}
	}
	
	public void palindromeCheckHalfTraverse()
	{
		Node hare = head;
		if (hare == null)
		{
			System.out.println("No elements to display");	
		}
		else if(hare.next== null)
		{
			System.out.println("Only one element - "+hare.data);	
		}
		else
		{
			Stack<Integer> store = new Stack<Integer>();
			Node tor = head;
			while (hare!= null)
			{				
//				System.out.println(+tor.data);
				
				
				if (hare.next==null)
				{
					tor=tor.next;
					break;
				}
				else					
				{
					store.push(tor.data);
					tor=tor.next;
					hare = hare.next.next;
				}
					
			}    
			
			while(tor!=null)
			{
				if (store.pop()==tor.data)
					tor = tor.next;
				else
					break;
			}
			if (tor==null)
				System.out.println("Its a palindrome!!!");
			else
				System.out.println("Not a palindrome...Booo");						
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PalindromeLinkedList checkMe = new PalindromeLinkedList();
		checkMe.add(1);
		checkMe.add(0);
		checkMe.add(0);
		checkMe.add(0);
		checkMe.add(1);
		checkMe.palindromeCheckBrute();
		checkMe.palindromeCheckHalfTraverse();

	}

}
