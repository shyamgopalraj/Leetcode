import java.util.*;
import java.util.Stack;

public class PalindromeLinkedList 
{
	public ListNode addNodes(ListNode head,int data)
	{
		ListNode cur = head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next = new ListNode(data);
		return head;
	}
	
	public void display(ListNode head)
	{
		ListNode cur = head;
		while(cur!=null)
		{
			System.out.print(cur.val+",");
			cur=cur.next;
		}
		System.out.println();
	}
	
	public boolean solution1(ListNode head)
	{
		ListNode tortoise = head;
		ListNode hare = head;
		
		if(head==null)
		{
			return false;
		}
		else
		{
			Stack<Integer> s = new Stack<Integer>(); 
			s.push(head.val);
			tortoise = head.next;
			hare = hare.next.next;
			
			while(hare!=null)
			{
				s.push(tortoise.val);
				tortoise = tortoise.next;
				hare = hare.next;
				if(hare!=null)
				{
					hare = hare.next;		
				}				
			}
			
			// hare reaches end of linked list
			int stacksize = s.size();
			if(stacksize%2!=0)
			{
				s.pop();
			}			
			
			while(tortoise!=hare)
			{
				if(!s.isEmpty())
				{
					if(tortoise.val==s.pop())
					{
						tortoise = tortoise.next;
					}
					else
					{ 
						// Not a palindrome
						return false;
					}
				}
			}
			// all elements popped and tortoise reached end of linkedlsit
			return true;
		}		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PalindromeLinkedList sample = new PalindromeLinkedList();
		ListNode head = new ListNode(1);
		head = sample.addNodes(head,0);
		head = sample.addNodes(head,0);
		head = sample.addNodes(head,1);
		sample.display(head);
		boolean result = sample.solution1(head);
		if(result)
		{
			System.out.println("yes its a palindrome !!!");
		}
		else
		{
			System.out.println("Its not a palindrome !!!");
		}
	}
}
