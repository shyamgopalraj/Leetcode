import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.SAAJMetaFactory;



public class BinarySearchTreeBfsTraversal 
{
	
	BinarySearchTreeBfsTraversal left,right;
	int data;	
	
	
	BinarySearchTreeBfsTraversal  temp = null;
	BinarySearchTreeBfsTraversal  itr = null;
	
	public BinarySearchTreeBfsTraversal(int data)
	{
		this.data = data;
	}
	
	public void inOrder()
	{
		if(left !=  null)
		{
			left.inOrder();
		}
		
		System.out.print(data+",");
		
		if(right !=  null)
		{
			right.inOrder();
		}
	}
	
	public void insert(int value)
	{
		//		System.out.println("root node is - "+data);
		if (value < data)
		{
			if(left ==  null)
			{
				left = new BinarySearchTreeBfsTraversal(value);
				System.out.println("Inserted at left - "+value);
				return;
			}
			else
			{
				left.insert(value);
				
			}
		}
		else
		{
			if(right ==  null)
			{
				right = new BinarySearchTreeBfsTraversal(value);;
				System.out.println("Inserted at right - "+value);
				return;
			}
			else
			{
				right.insert(value);		
			}
		}
	}
	
	public void bfsTraversalBinarySearch(Queue<BinarySearchTreeBfsTraversal> qStore)
	{
		if(left!=null)
		{
			qStore.add(left);			
		}
		
		if(right!=null)
		{
			qStore.add(right);
		}
		
		if(!qStore.isEmpty())
		{
			temp = qStore.remove();
			System.out.print(temp.data+",");
			temp.bfsTraversalBinarySearch(qStore);
		}		
	}
	
	public void bfsTraversalBinarySearchIter(BinarySearchTreeBfsTraversal root,Queue<BinarySearchTreeBfsTraversal> qStoreItr)
	{
		while(root.left!=null || root.right!=null || (!qStoreItr.isEmpty()))
		{
			if(root.left!=null)
			{
				qStoreItr.add(root.left);
			}
			if(root.right!=null)
			{
				qStoreItr.add(root.right);
			}
			temp = qStoreItr.remove();
			System.out.print(temp.data+",");
			root=temp;
		}
	}
	
	public void bfsTraversalBinarySearchIterAkka(BinarySearchTreeBfsTraversal root)
	{
		if(root == null)
			return;
		
		Queue<BinarySearchTreeBfsTraversal> qStoreItr = new LinkedList<>();
		qStoreItr.add(root);
		
		while(!qStoreItr.isEmpty())
		{
			temp = qStoreItr.remove();
			System.out.print(temp.data+",");
			if(temp.left!=null)
			{
				qStoreItr.add(temp.left);
			}
			if(temp.right!=null)
			{
				qStoreItr.add(temp.right);
			}	
		}
	}
	
	public ArrayList<LinkedList<BinarySearchTreeBfsTraversal>> levelOrderTraversal(BinarySearchTreeBfsTraversal root)
	{
		ArrayList<LinkedList<BinarySearchTreeBfsTraversal>> result = new ArrayList<LinkedList<BinarySearchTreeBfsTraversal>>();
		if (root==null)
		{
			return result;
		}
		else
		{
			LinkedList<BinarySearchTreeBfsTraversal> cur = new LinkedList<BinarySearchTreeBfsTraversal>();
			cur.add(root);
			while(cur.size()>0)
			{
				result.add(cur);
				LinkedList<BinarySearchTreeBfsTraversal> parents = cur;
				cur = new LinkedList<BinarySearchTreeBfsTraversal>();
				for(BinarySearchTreeBfsTraversal parent:parents)
				{
					if(parent.left!=null)
					{
						cur.add(parent.left);
					}
					if(parent.right!=null)
					{
						cur.add(parent.right);
					}
				}				
			}
			return result;
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BinarySearchTreeBfsTraversal head = new BinarySearchTreeBfsTraversal(10);
		BinarySearchTreeBfsTraversal temp=null;
		head.insert(5);
		head.insert(6);
		head.insert(3);
		head.insert(12);
		head.insert(11);
		head.insert(13);
		head.inOrder();
		System.out.println("BfsTraversal through iteration");
		Queue<BinarySearchTreeBfsTraversal> qStore = new LinkedList<>();
		Queue<BinarySearchTreeBfsTraversal> qStoreItr = new LinkedList<>();
		head.bfsTraversalBinarySearch(qStore);
		System.out.println();
		head.bfsTraversalBinarySearchIter(head,qStoreItr);
		System.out.println();
		head.bfsTraversalBinarySearchIterAkka(head);
		ArrayList<LinkedList<BinarySearchTreeBfsTraversal>> result = new ArrayList<LinkedList<BinarySearchTreeBfsTraversal>>();
		result = head.levelOrderTraversal(head);
		System.out.println("depth of tree - "+result.size());
		Iterator<LinkedList<BinarySearchTreeBfsTraversal>> itr = result.iterator();
		int level=0;
		while(itr.hasNext())	
		{
			System.out.print("level - "+level+" - elements are - ");
			level = level+1;
			LinkedList<BinarySearchTreeBfsTraversal> cur = itr.next();
			Iterator<BinarySearchTreeBfsTraversal> listItr = cur.iterator();
			while(listItr.hasNext())
			{
				temp = listItr.next();
				System.out.print(temp.data+",");
			}
			System.out.println();
		}
		
	}
}
