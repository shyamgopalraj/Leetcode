import java.util.Stack;

public class AddUsingLinkedList {
	
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
	
	
	
	public Node add(Node head,int data)
	{
		Node newnode = new Node(data);
		if (head == null)
		{
			head = newnode;
			System.out.println("data added - "+newnode.data);
			return head;
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
		System.out.println("data added - "+newnode.data);
		return head;
	}
	
	public void display(Node head)
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
	
	public void addtwo(Node head1,Node head2)
	{
		AddUsingLinkedList l3 = new AddUsingLinkedList();
		Node head3 = null;
		Node cur1=head1;
		Node cur2=head2;
		
		if(cur1==null&&cur2==null)
		{
			System.out.print("No elements to add");
			
		}
		else if(cur1==null)
		{
			l3.display(cur2);
		}
		else if(cur2==null)
		{
			l3.display(cur1);
		}
		else
		{
			int sum,rem,carryon,temp;
			temp=0;
			while(cur1!=null&&cur2!=null)
			{
				sum = cur1.data+cur2.data+temp;
				rem = sum%10;
				System.out.println("rem - "+rem);
				carryon = sum/10;
				temp=carryon;
				head3 = l3.add(head3,rem);
				cur1=cur1.next;
				cur2=cur2.next;
			}
			l3.display(head3);
		}
	}
	
	public void addtwoFromFirst(Node head1,Node head2)
	{
		AddUsingLinkedList l3 = new AddUsingLinkedList();
		
		Node head3 = null;
		Node cur1=head1;
		Node cur2=head2;
		
		if(cur1==null&&cur2==null)
		{
			System.out.print("No elements to add");
			
		}
		else if(cur1==null)
		{
			l3.display(cur2);
		}
		else if(cur2==null)
		{
			l3.display(cur1);
		}
		else
		{
			Stack<Integer> store = new Stack<Integer>();
			int sum,rem,carryon=0,temp=0;
			while(cur1!=null&&cur2!=null)
			{
				sum = cur1.data+cur2.data;
				store.push(sum);
				System.out.print("element inserted"+sum);
				cur1=cur1.next;
				cur2=cur2.next;	
			}			
			while(store.empty()==false)
			{
				temp = store.pop();
				rem = temp%10;				
				rem = rem+carryon;
				carryon = temp/10;
				head3 = l3.NextToHeader(head3,rem);	
			}
			l3.display(head3);
		}
		
	}
	
	public Node NextToHeader(Node head,int data)
	{
		Node newnode = new Node(data);
		if (head == null)
		{
			head = newnode;
			System.out.println("data added - "+newnode.data);
			return head;
		}
		else
		{	
			Node cur=head;
			newnode.next = cur;
			head = newnode;
						
		}
		System.out.println("data added - "+newnode.data);
		return head;
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddUsingLinkedList l1 = new AddUsingLinkedList();
		AddUsingLinkedList l2 = new AddUsingLinkedList();
		AddUsingLinkedList result = new AddUsingLinkedList();
		Node head1 = null;
		Node head2 = null;
//		head1 = l1.add(head1,7);
//		head1 = l1.add(head1,1);
//		head1 = l1.add(head1,6);
//		head2 = l2.add(head2,5);
//		head2 = l2.add(head2,9);
//		head2 = l2.add(head2,2);
		head1 = l1.add(head1,6);
		head1 = l1.add(head1,1);
		head1 = l1.add(head1,7);
		head2 = l2.add(head2,2);
		head2 = l2.add(head2,9);
		head2 = l2.add(head2,5);
		l1.display(head1);
		l2.display(head2);
//		result.addtwo(head1, head2);
		result.addtwoFromFirst(head1, head2);
	}
}
