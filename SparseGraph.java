
public class SparseGraph implements Graph {

	private Node[] allVertex;
	
	public class Node{
		private int vertex;
		private Node next;
		public Node(int u)
		{
			vertex=u;
			next = null;
		}
	}
	
	public SparseGraph(int n)
	{
		allVertex = new Node[n];
	}
	public void addEdge(int u, int v) {
		
		Node vertx = new Node(u);
		Node temp = null;
		Node adj = new Node(v);
		
		temp = allVertex[u];
		adj.next=temp;
		allVertex[u]=adj;
		
		temp = allVertex[v];
		vertx.next=temp;
		allVertex[v]=vertx;
		
		return;
	}

	
	public int size() {
		return allVertex.length;
	}

	public int[] adjacent(int u) {
		
		int count=0;
		Node curr = allVertex[u];
		Node ccurr = curr;
		
		while(ccurr!=null)
		{
			count++;
			ccurr= ccurr.next;
		}
		
		int[] res = new int[count];
		int i=0;
		
		while(curr!=null)
		{
			res[i]=curr.vertex;
			curr=curr.next;
			i++;
		}
		
		return res;
	}

	
	public void print() {
		
		for(int i=0;i<allVertex.length;i++)
		{
			System.out.print(i+" : ");
			Node curr= allVertex[i];
			while(curr!=null)
			{
				System.out.print(curr.vertex+" ");
				curr=curr.next;
			}
			System.out.println();			
		}
		System.out.println();
	}

}
