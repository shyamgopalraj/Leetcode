import java.util.LinkedList;
import java.util.Queue;


public class BFS 
{
	int[][] bfs = new int[5][5];
	Queue<Integer> qStore = new LinkedList<Integer>();
	boolean condition = true;
	
	
	
	public void createBfsMatrix()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				bfs[i][j] = 0;
			}
		}
	}
	
	public void customizeMatrix(int row,int col)
	{
		bfs[row][col] = 1;
	}
	
	public void showMatrix()
	{
		System.out.println("Content of Matrix");
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(bfs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void bfsTraversal(int source)
	{		
		for (int i=source;i<5;i++)
		{
			if(condition)
			{
				System.out.print("Node "+source+" connected to - ");
				for (int j=0;j<5;j++)
				{
					if(bfs[i][j]==1)
					{
						System.out.print(j);
						qStore.add(j);
					}
				}
				System.out.println();
				if(!qStore.isEmpty())
				{
					source = qStore.remove();
					bfsTraversal(source);
				}
				else
				{
					condition = false;
				}				
			}
			
		}
	}
	
	public boolean checkElementExist(int source,int node)
	{
		for (int i=source;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(bfs[i][j]==1)
				{
					if(j==node)
					{
						return true;
					}
					qStore.add(j);
				}
			}
			if(!qStore.isEmpty())
			{
				source = qStore.remove();
				bfsTraversal(source);
			}
			else
			{
				return false;
			}
		}
		return false;
		
	}	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BFS samplebfs = new BFS();
		samplebfs.createBfsMatrix();
		samplebfs.customizeMatrix(0, 1);
		samplebfs.customizeMatrix(0, 2);
		samplebfs.customizeMatrix(0, 3);
		samplebfs.customizeMatrix(3, 4);
		samplebfs.showMatrix();
		samplebfs.bfsTraversal(0);
		boolean result = samplebfs.checkElementExist(0, 5);
		if (result)
		{
			System.out.println("node exist");
		}
		else
		{
			System.out.println("node does not exist");
		}
	}

}
