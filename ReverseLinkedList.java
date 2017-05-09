
public class ReverseLinkedList
{
	public ListNode addNodes(ListNode head,int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode cur = head;
		while(cur.next!=null)
		{
			cur = cur.next;
		}
		cur.next = newNode;
		return head;
	}

	public void display(ListNode head)
	{
		ListNode cur = head;
		while(cur!=null)
		{
			System.out.print(cur.val+",");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public ListNode solution(ListNode head)
	{
		ListNode cur = head;
		if(cur==null)
		{
			return head;
		}
		else
		{
			cur = head;
			ListNode prev = head;
			cur = prev.next;
			while(cur!=null)
			{				
				prev.next = cur.next;
				cur.next = head;
				head = cur;
				cur=prev.next;	
				display(head);
			}
			return head;
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ReverseLinkedList sample = new ReverseLinkedList();
		head = sample.addNodes(head,2);
		head = sample.addNodes(head,3);
		head = sample.addNodes(head,4);
		sample.display(head);
		head = sample.solution(head);
		sample.display(head);
	}

}
