import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;


public class DFS {
	
	LinkedList<Integer>[] sparsedfs = new LinkedList[8];
	LinkedList<Integer> temp = new LinkedList<Integer>();
	
	//Scanner input = new Scanner(System.in);
	
	public void InitializeFiveNode()
	{
		for (int i=0;i<8;i++)
		{
			sparsedfs[i]= new LinkedList<Integer>();
		}
		
	}
	
	public void addClosestNode(int Node,int Neighbor)
	{		
			temp = sparsedfs[Node];
			temp.add(Neighbor);			
	}
	
	public void displayNeighborNodes()
	{
		for (int k=0;k<8;k++)
		{			
			temp = sparsedfs[k];
//			System.out.println(temp);
//			ListIterator<Integer> itr = temp.listIterator();
//			if (itr.hasNext())
//			{
//				int store = itr.next();
//				System.out.println(store);
//			}
			for (int i=0;i<temp.size();i++)
			{
				System.out.print(temp.get(i));
			}
			System.out.print(",");
//			System.out.println("size of each linked list - "+temp.size());
		}
		System.out.println();
	}
	
	public boolean checkPath(int source,int destination)
	{
		temp = sparsedfs[source];
		Iterator itr = temp.iterator();
		while(itr.hasNext())
		{
			source = (int) itr.next();
			System.out.print(+source+",");			
			if(source==destination)
			{
				return true;
			}
			if (checkPath(source,destination)==true)
			{
				return true;
			}
		}
		return false;			
	}	
	
	public boolean checkCyclic(int source,boolean[] visited)
	{
		temp = sparsedfs[source];
		Iterator itr = temp.iterator();
		while(itr.hasNext())
		{
			source = (int) itr.next();
			System.out.print(+source+",");			
			if(visited[source]==true)
			{
				return true;
			}
			visited[source]=true;
			if (checkCyclic(source,visited)==true)
			{
				return true;
			}
		}
		return false;			
	}	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Source Node(0 to 7)");
		int source = input.nextInt();
		boolean[] visited = new boolean[8];
		visited[source]=true;
		DFS sample = new DFS();
		sample.InitializeFiveNode();
		sample.addClosestNode(0,1);
		sample.addClosestNode(0,2);
		sample.addClosestNode(0,3);
		sample.addClosestNode(1,4);
		sample.addClosestNode(2,5);
		sample.addClosestNode(3,6);
		sample.addClosestNode(6,7);
		sample.displayNeighborNodes();
		boolean result = sample.checkPath(source,7);
		if (result)
		{
			System.out.println("\npath exist");
		}
		else
		{
			System.out.println("\npath does not exist");
		}
		boolean checkCyclic = sample.checkCyclic(source,visited);		
		if (checkCyclic)
		{
			System.out.println("\n cyclic");
		}
		else
		{
			System.out.println("\n not cyclic");
		}
		input.close();
	}

}
