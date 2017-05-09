import java.util.Stack;

public class AddTwoNumbers
{	
	public void addToLOne(int data,ListNode head1)
	{		
		
		ListNode cur1 = head1;		
		
		while(cur1.next!=null)
		{
			cur1 = cur1.next;
		}
		cur1.next = new ListNode(data);		
	}
	
	public void addToLTwo(int data,ListNode head2)
	{
		
		
		ListNode cur2 = head2;		
		
		while(cur2.next!=null)
		{
			cur2 = cur2.next;
		}
		cur2.next = new ListNode(data);		
	}
	
	public void display(ListNode head)
	{
		ListNode cur = head;
		while(cur!=null)
		{
			System.out.print(cur.val);
			cur=cur.next;
		}
	}
	
	public ListNode createList(ListNode resultHead,int data)
	{		
		ListNode newNode = new ListNode(data);
		if(resultHead==null)
		{
			resultHead = newNode;			
		}
		else
		{
			ListNode cur = resultHead;
			while(cur.next!=null)
			{
				cur=cur.next;
			}
			cur.next = newNode;
		}
		return resultHead;		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode resultHead = null;
        int carry = 0;
        int d1 = 0;
        int d2 = 0;
        int sum = 0;
        int digit = 0;
        while(cur1!=null || cur2!=null)
        {
        	if(cur1==null)
        	{
        		d1=0;
        	}
        	else
        	{
        		d1 = cur1.val;
        		cur1 = cur1.next;
        	}
        	if(cur2==null)
        	{
        		d2=0;
        	}
        	else
        	{        		
        		d2 = cur2.val;            	
            	cur2 = cur2.next;  
        	}       
        	// add d1 and d2
        	sum = d1+d2+carry;
        	carry = 0;
        	if(sum>=10)
        	{
        		digit = sum-10;
        		resultHead = createList(resultHead, digit);
        		carry = 1;
        	}
        	else
        	{
        		digit = sum;
        		resultHead = createList(resultHead, digit);
        	}  
        }
        
        // if there is a carry from last digit
        if(carry==1)
        {
        	resultHead = createList(resultHead, carry);
        }
        
        return resultHead;
        
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddTwoNumbers sample = new AddTwoNumbers();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		ListNode head1 = l1;
		ListNode head2 = l2;
		sample.addToLOne(4,head1);
		sample.addToLOne(3,head1);
		sample.addToLTwo(6,head2);
		sample.addToLTwo(4,head2);
		sample.display(head1);
		System.out.println();
		sample.display(head2);	
		ListNode result = sample.addTwoNumbers(l1, l2);
		System.out.println();
		sample.display(result);
	}
}
