
public class LinkedListCycle
{
	public ListNode addNodes(ListNode head,int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode cur = head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next = newNode;
		return head;
	}
	
	public ListNode createCycle(ListNode head,int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode cur = head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next = newNode;
		newNode.next = head;
		return head;
	}
	
	public boolean solution(ListNode head)
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			ListNode cur = head;
			ListNode tortoise = cur.next;
			ListNode hare = cur.next.next;
			while(hare!=null || tortoise!=null)
			{
				if(tortoise!=hare)
				{
					tortoise = tortoise.next;
					hare = hare.next.next;
				}
				else
				{
					return true;
				}
			}
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		LinkedListCycle sample = new LinkedListCycle();
		head = sample.addNodes(head,3);
		head = sample.addNodes(head,4);		
		head = sample.createCycle(head,5);
		boolean result = sample.solution(head);
		if(result)
		{
			System.out.println("linkedlist is cyclic");
		}
		else
		{
			System.out.println("linkedlist is not cyclic");
		}		
	}
}
