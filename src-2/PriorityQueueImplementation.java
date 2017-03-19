import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueImplementation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("default size of priority queue is - "+prq.size());
		
		for (int i=0;i<5;i++)
		{
			System.out.print("enter integer elements to priority queue - ");			
			prq.add(input.nextInt());
		}		
		System.out.println("contents of priority queue are - "+prq);		
		
		PriorityQueue<Integer> decreasingQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		System.out.println("default size of decreasingQueue is - "+decreasingQueue.size());
		
		for (int i=0;i<5;i++)
		{
			System.out.print("enter integer elements to priority queue - ");			
			decreasingQueue.add(input.nextInt());
		}
		input.close();
		System.out.print("contents of decreasingQueue are - "+decreasingQueue);		
		
	}

}
