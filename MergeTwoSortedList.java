
public class MergeTwoSortedList
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
			cur=cur.next;
		}
		System.out.println();
	}
	
	public ListNode solve(ListNode big,ListNode small)
	{
		ListNode bigCur = big;
		ListNode smallPrev = small;
		ListNode smallCur = smallPrev.next;
		
		if(small.next == null)
		{
			small.next = big;
			return small;
		}
		else
		{
			while(bigCur!=null && smallCur!=null)
			{
				if(bigCur.val>=smallPrev.val && bigCur.val<=smallCur.val)
					{
						smallPrev.next = bigCur;
						big = bigCur.next;
						bigCur.next = smallCur;	
						bigCur = big;
					}
				smallPrev = smallPrev.next;
				smallCur = smallPrev.next;
			}				
		}
		if(smallCur==null)
		{
			smallPrev.next = big;				
		}
		return small;
	}
	
	public ListNode solution(ListNode l1,ListNode l2)
	{
		if(l1==null)
		{
			return l2;
		}
		else if (l2==null)
		{
			return l1;
		}
		else
		{
			if(l1.val > l2.val)
			{
				l1 = solve(l1,l2);
				return l1;				
			}
			else
			{
				l2 = solve(l2,l1);
				return l2;
			}
		}	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(0);
		MergeTwoSortedList sample = new MergeTwoSortedList();
//		sample.addNodes(head1, 2);
//		sample.addNodes(head1, 5);
		sample.addNodes(head2, 3);
		sample.addNodes(head2, 7);
		sample.display(head1);
		sample.display(head2);
		ListNode result = sample.solution(head1, head2);
		sample.display(result);
		
	}

}
