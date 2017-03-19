import java.lang.Math;

public class Mytree 
{
	
	Mytree left,right;
	int data;	
	
	public Mytree(int data)
	{
		this.data = data;
	}
	
	public void insert(int value)
	{
		//		System.out.println("root node is - "+data);
		if (value < data)
		{
			if(left ==  null)
			{
				left = new Mytree(value);
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
				right = new Mytree(value);;
				System.out.println("Inserted at right - "+value);
				return;
			}
			else
			{
				right.insert(value);		
			}
		}
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
	
	public boolean search(int key)
	{
		if (key == data)
		{
			return true;
		}		
		else
		{
			if(key<data)
			{
				if (left!=null)
				{
					System.out.println("left");
					return left.search(key);
				}
				else
				{
					return false;
				}
			}
			else
			{
				if (right!=null)
				{
					System.out.println("right");
					return right.search(key);
				}
				else
				{
					return false;
				}
			}
		}
	}
	
	public void postOrder()
	{
		if (left!=null)
		{
			left.postOrder();
		}
		
		if(right!=null)
		{
			right.postOrder();
		}
		System.out.print(data+",");
	}
	
	public void preOrder()
	{
		System.out.print(data+",");
		
		if (left!=null)
		{
			left.postOrder();
		}
		
		if(right!=null)
		{
			right.postOrder();
		}
	}
	
	public int checkBalance(int leftTreeCount,int righttreeCount)
	{
		if(left!=null)
		{
			leftTreeCount++;
			return left.checkBalance(leftTreeCount, righttreeCount);
		}
		else
		{
			if (right!=null)
			{
				righttreeCount++;
				return right.checkBalance(leftTreeCount, righttreeCount);
			}
		}
		if(Math.abs(leftTreeCount-righttreeCount)<=1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean checkBST()
	{
		if(left!=null)
		{
			if(left.data<data)
			{
				return left.checkBST();
			}
			else
			{
				return false;
			}
			
		}
		
		System.out.print(data+",");
		
		if(right!=null)
		{
			if(right.data>data)
			{
				right.checkBST();
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mytree head = new Mytree(10);
		head.insert(5);
		head.insert(3);
		head.insert(2);
		head.insert(1);
		head.insert(12);
		System.out.print("Inorder Traversal - ");
		head.inOrder();
		System.out.println();
		System.out.print("PostOrder Traversal - ");
		head.postOrder();
		System.out.println();
		System.out.print("PreOrder Traversal - ");
		head.preOrder();
		System.out.println();
		boolean result = head.search(15);
		if (result)
		{
			System.out.println("found item in tree");
		}
		else
		{
			System.out.println("item not present in tree");
		}
		int treeBalancecheck = head.checkBalance(0,0);
		if (treeBalancecheck==1)
		{
			System.out.println("Balanced tree");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		boolean checkBinaryIfTree=head.checkBST();
		if (checkBinaryIfTree)
		{
			System.out.println("It's a BST");
		}
		else
		{
			System.out.println("Not a BST");
		}
		
	}

}
