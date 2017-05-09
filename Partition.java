import java.util.Scanner;

public class Partition
{
	public void addNodes(ListNode head,int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode cur = head;
		while(cur.next!=null)
		{
			cur= cur.next;
		}
		cur.next = newNode;
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
	
	public ListNode solution(ListNode head,int partitionValue)
	{
		ListNode smallStart = null;
		ListNode smallEnd = null;
		ListNode bigStart = null;
		ListNode bigEnd = null;
		ListNode cur = head;
		while(cur!=null)
		{
			if(cur.val<partitionValue)
			{
				//node value less than partitionValue
				if(smallStart==null)
				{
					smallStart = cur;
					smallEnd = smallStart;
				}
				else
				{
					smallEnd.next = cur;
					smallEnd = cur;
				}					
			}
			else
				//node value greater than partitionValue
			{
				if(bigStart==null)
				{
					bigStart = cur;
					bigEnd = bigStart;
				}
				else
				{
					bigEnd.next = cur;
					bigEnd = cur;
				}			
			}	
			//move to next node
			cur = cur.next;
		}
		//Attach smallEnd to bigStart
		if(smallStart!=null)
		{
			smallEnd.next = bigStart;
			bigEnd.next = null;
			return smallStart;
		}
		else
		{
			return bigStart;
		}
		
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		Partition sample = new Partition();
		sample.addNodes(head, 2);
		sample.addNodes(head, 31);
		sample.addNodes(head, 10);
		sample.display(head);
		Scanner input = new Scanner(System.in);
		System.out.print("enter the partitionValue : ");	
		int partitionValue = input.nextInt();
		input.close();
		ListNode result = sample.solution(head, partitionValue);
		sample.display(result);
		
		
	}

}
