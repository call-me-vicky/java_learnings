
public class DenseGraph implements Graph {

	private int[][] arr;
	public DenseGraph(int n)
	{
		arr = new int[n][n];
	}

	public void addEdge(int u, int v) {
		arr[u][v]=1;
		arr[v][u]=1;
		return;
	}


	public int size() {
		return arr.length;
	}


	public int[] adjacent(int u) {
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[u][i]==1)
				count++;
		}
		
		int[] res = new int[count];
		
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(arr[u][i]==1)
			{
				res[j]=i;
				j++;
			}
		}
		
		return res;
	}

	
	public void print() {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(i+" : ");
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==1)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
