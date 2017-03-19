
public class MatrixDFS {
	
	int[][] dfs = new int[5][5];
	
	public void createDefaultmatrix()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				dfs[i][j] = 0;
			}
		}
	}
	
	public void customizeMatrix(int row,int col)
	{
		dfs[row][col] = 1;
	}
	
	public void showMatrix()
	{
		System.out.println("Content of Matrix");
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(dfs[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean checkPathExists(int source, int destination)
	{
		for(int i=source;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (dfs[i][j]==1)
				{
					if(j==destination)
					{
						return true;
					}
					else
					{
						checkPathExists(j, destination);
					}
				}
			}
		}
		return false;
	}
	
	public boolean checkCyclic(int source,boolean[] visited)
	{
		for (int i=source;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (dfs[i][j]==1)
				{
					if(visited[j]==true)
					{
						return true;
					}
					visited[j]=true;
					return checkCyclic(j, visited);
				}				
			}
		}
		return false;
	}
	
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MatrixDFS sample = new MatrixDFS();
		boolean[] visited = new boolean[5];
		sample.createDefaultmatrix();
		sample.customizeMatrix(0, 1);
		sample.customizeMatrix(0, 2);
		sample.customizeMatrix(0, 3);
		sample.customizeMatrix(3, 4);
		sample.showMatrix();
		boolean result = sample.checkPathExists(0,2);
		if (result)
		{
			System.out.println("Path exist");
		}
		else
		{
			System.out.println("No Path exist");
		}
		boolean cyclic = sample.checkCyclic(0,visited);
		if (cyclic)
		{
			System.out.println("cyclic");
		}
		else
		{
			System.out.println("Not cyclic");
		}
	}

}
