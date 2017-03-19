

public class MergeTwoSortedLists 
{
	public class LinkList
	{
		int data;
		LinkList next;
		
		public LinkList(int x)
		{
			this.data = x;
		}
	}	
	
	public LinkList addNodes(int content,LinkList head)
	{
		LinkList newnode = new LinkList(content);
		LinkList cur = head;
		if (head==null)
		{
			head = newnode;
		}
		else
		{
			while(cur.next!=null)
			{
				cur=cur.next;
			}
			cur.next = newnode;
		}
		return head;
	}
	
	public void displaylinkedlist(LinkList head)
	{
		LinkList cur = head;
		System.out.print("contents of linked list -> ");
		while(cur!=null)
		{
			System.out.print(cur.data+",");
			cur=cur.next;
		}
		System.out.println();
	}
	
	public LinkList merge(LinkList l1,LinkList l2)
	{
		
		LinkList cur2=l2;
		
		//when element in l1 is less than element in l2
		if (l2.data<l1.data)
		{
			l2 = cur2.next;
			cur2.next = l1;
			l1=cur2;
			cur2=l2;
		}
		
		// displaying linked list after inserting element at start
		displaylinkedlist(l1);
		
		LinkList prev1=l1;
		LinkList cur1=l1;
		
		while (cur1!=null && cur2!=null)
		{
			// when element in l2 is greater than element in l1
			if (l2.data>cur1.data)
			{
				//keep on moving forward till it encounters an element larger than l2
				while(cur1!=null && l2.data>cur1.data)
				{
					prev1 = cur1;
					cur1=cur1.next;
				}
				
				if (cur1==null)
				{
					break;
				}
				
				//Does not reach end of list but finds an element in l1 greater than l2
				if (l2.data<=cur1.data)
				{
					//inserting the node of l2 between the two nodes of l1
					l2 = cur2.next;
					cur2.next=cur1;
					prev1.next = cur2;
					cur1=cur2;
					cur2=l2;
				}
				//displaying after element inserted in right position
				displaylinkedlist(l1);
			}			
		}
		
		//Reaches end of list when first element is greater than all elements of l1
		if(cur1==null)
		{	
			prev1.next = l2;
			return l1;
		}
		
		//last element of l2 would be attached to end of l1 and so no elements left
		else
		{
			return l1;
		}				
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkList head1 = null;
		LinkList head2 = null;
		System.out.println("creating sorted linkedlist");
		MergeTwoSortedLists sample = new MergeTwoSortedLists();
		head1 = sample.addNodes(2,head1);
		head1 = sample.addNodes(3,head1);
//		head1 = sample.addNodes(6,head1);
		head2 = sample.addNodes(1,head2);
		head2 = sample.addNodes(4,head2);
//		head2 = sample.addNodes(5,head2);		
		head2 = sample.addNodes(9,head2);
		sample.displaylinkedlist(head1);
		sample.displaylinkedlist(head2);
		head1 = sample.merge(head1, head2);
		sample.displaylinkedlist(head1);
	}

}
