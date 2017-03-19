import java.util.*;
import java.util.Scanner;

public class ReverseNodesKGroup
{
	
	public class ListNode
	{
		int val;
		ListNode next;
		
		public ListNode(int x)
		{
			this.val = x;
		}
	}
	
	ListNode head = null;
	ListNode cur = null;
	
	public ListNode createLinkedList(int data)
	{
		ListNode newnode = new ListNode(data);
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			cur = head;
			while (cur.next!=null)
			{
				cur = cur.next;
			}
			cur.next = newnode;
		}
		return head;
	}
	
	public void displayLinkedlistContents(ListNode headpos)
	{
		if (headpos==null)
		{
			System.out.println("no contents to display");
		}
		else
		{
			cur = headpos;
//			System.out.print("contents of linked list - ");
			while(cur != null)
			{
				System.out.print(cur.val);
				cur= cur.next;
			}
			System.out.println();
		}
	}
	
	public void ReverseNodesKPos(ListNode headpos,int k,int size)
	{
		Stack<Integer> store = new Stack<Integer>();
		int count = size/k;
		int stackOperation = 0,pushCount = 0;
		cur = headpos;
		System.out.print("K value reversed display - ");
		while(stackOperation!=count)
		{
			store.push(cur.val);
			cur=cur.next;
			pushCount++;
			if (pushCount==k)
			{
				while(!store.isEmpty())
				{
					System.out.print(store.pop());
				}
				pushCount = 0;
				stackOperation++;
			}
		}
		displayLinkedlistContents(cur);
	}
	
	public void ReOrderNodesKPos(ListNode headpos,int k,int size)
	{
		Stack<Integer> store = new Stack<Integer>();
		int count = size/k;
		int stackOperation = 0,pushCount = 0;
		ListNode prev = headpos;
		cur = headpos;
		System.out.print("K value reversed display - ");
		while(stackOperation!=count)
		{
			store.push(cur.val);
			cur=cur.next;
			pushCount++;
			if (pushCount==k)
			{
				while(!store.isEmpty())
				{
					prev.val = store.pop();
					prev = prev.next;
				}
				prev = cur;
				pushCount = 0;
				stackOperation++;
			}
		}
		displayLinkedlistContents(head);
	}
	
	public ListNode reverseLinkedList(ListNode headpos)
	{
		ListNode prev = headpos;
		cur = headpos.next;
		
		while (cur!= null)
		{
			prev.next = cur.next;
			cur.next = head;
			head = cur;
			cur=prev.next;		
			displayLinkedlistContents(head);
		}	
		return head;
	}
	
	public ListNode reverseKNodes(ListNode temphead,int k,int round,ListNode joinprev)
	{
		ListNode prev = temphead;
		cur = temphead.next;
		int count = 1;
		
		while (count!=k)
		{
			prev.next = cur.next;
			cur.next = temphead;
			temphead = cur;
			cur=prev.next;	
			count++;
		}
		if (round == 1)
		{
			head = temphead;
		}
		else
		{
			joinprev.next = temphead;
		}
		displayLinkedlistContents(head);
		return prev;
	}
	
	public ListNode bestSolution(ListNode headpos,int k)
	{
		ListNode joinprev = null,prev = null;
		ListNode temphead = null;
		cur = headpos;
		int count = 1;
		int round = 0;
		while(cur.next!=null)
		{
			cur = cur.next;
			count++;
			if(count == k)
			{
				round++;
				if(round == 1)
				{
					temphead = head;
					joinprev = null;
					
				}
				else
				{
					joinprev = prev;
				}
				prev = reverseKNodes(temphead,k,round,joinprev);
				count = 0;
				temphead = prev.next;//start node for next k reversal
				cur = prev;
//				prev = temphead.next;				
			}
		}
		return head;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ReverseNodesKGroup sample = new ReverseNodesKGroup();
		Scanner input = new Scanner(System.in);
		System.out.print("enter an size of linked list u want to create - ");
		int size = input.nextInt();
		int data;
		ListNode storehead = null;
		for (int i=0;i<size;i++)
		{
			System.out.print("enter an integer to add to linked list - ");
			data = input.nextInt();
			storehead = sample.createLinkedList(data);
		}
		System.out.print("contents of linked list - ");
		sample.displayLinkedlistContents(storehead);
		System.out.print("enter an k value - ");
		int k = input.nextInt();
//		sample.ReverseNodesKPos(storehead, k, size);
//		sample.ReOrderNodesKPos(storehead, k, size);
//		storehead = sample.reverseLinkedList(storehead);
//		sample.displayLinkedlistContents(storehead);
		storehead = sample.bestSolution(storehead, k);
		sample.displayLinkedlistContents(storehead);
		input.close();
		
	}

}
