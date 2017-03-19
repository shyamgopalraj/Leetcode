
public class DFSIsland {
	
	int[][] islandMatrix = new int[5][5];
	boolean[][] visited = new boolean[5][5];
	int count=0;
	
	public void createDefaultIsland()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				islandMatrix[i][j] = 0;
			}
		}
	}
	
	public void customizeIsland(int row,int col)
	{
		islandMatrix[row][col] = 1;
	}
	
	public void showIsland()
	{
		System.out.println("Content of Matrix");
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(islandMatrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public int numberOfIsland()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (islandMatrix[i][j]==1 && visited[i][j]!=true)
				{
					visited[i][j]=true;
					findIsland(i,j);
					count++;
				}
			}
		}
		return count;
	}
	
	public void findIsland(int i,int j)
	{		
		int[] rowcheck = new int[]{-1,-1,-1,0,0,1,1,1};
		int[] colcheck = new int[]{-1,0,1,-1,1,-1,0,1};
		
		for (int k=0;k<8;k++)
		{
			int checkNextRow = i+rowcheck[k];
			int checkNextCol = j+colcheck[k];
			if( (checkNextRow>=0 && checkNextRow<5) && (checkNextCol>=0 && checkNextCol<5) && (visited[checkNextRow][checkNextCol]!=true) && islandMatrix[checkNextRow][checkNextCol]==1 )
			{
				visited[checkNextRow][checkNextCol]=true;
				findIsland(checkNextRow, checkNextCol); 
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSIsland sample = new DFSIsland();
		sample.createDefaultIsland();
		sample.customizeIsland(0, 0);
		sample.customizeIsland(0, 1);
		sample.customizeIsland(1, 1);
		sample.customizeIsland(1, 4);
		sample.customizeIsland(2, 0);
		sample.customizeIsland(2, 3);
		sample.customizeIsland(2, 4);
		sample.customizeIsland(4, 0);
		sample.customizeIsland(4, 2);
		sample.customizeIsland(4, 4);
		sample.showIsland();
		int result = sample.numberOfIsland();
		System.out.println("Number of Islands are - "+result);
	}

}
