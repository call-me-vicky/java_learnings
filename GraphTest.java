import java.util.Arrays;

public class GraphTest {

	public static void main(String[] args) {
		
		Graph gdt = new DenseGraph(2);
		Graph gst = new SparseGraph(2);
		gdt.addEdge(0, 1);
		gdt.print();
	
		gst.addEdge(0, 1);
		gdt.print();
		
		Graph gdt1 = new DenseGraph(3);
		Graph gst1 = new SparseGraph(3);
		gdt1.addEdge(0, 2);
		gdt1.addEdge(1, 0);
		gdt1.addEdge(2, 1);
		gdt1.print();
	
		gst1.addEdge(0, 2);
		gst1.addEdge(1, 0);
		gst1.addEdge(2, 1);
		gdt1.print();
		System.out.println(Arrays.toString(gst1.adjacent(0)));
		
		
		
		
		Graph g = new DenseGraph(8);
		Graph g1 = new SparseGraph(8);
		
//		g.print();
		
		g.addEdge(3, 1);
		g.addEdge(3, 0);
		
//		g.print();
		
		g.addEdge(5, 4);
		g.addEdge(7, 3);
		g.addEdge(0,4);
		g.addEdge(0,5);
		g.addEdge(0,1);
		
//		g.print();
		
		g1.print();
		
		g1.addEdge(3, 1);
		g1.addEdge(3, 0);
		
		g1.print();
		
		g1.addEdge(5, 4);
		g1.addEdge(7, 3);
		g1.addEdge(0,4);
		g1.addEdge(0, 5);
		g1.addEdge(0, 1);
		
		g1.print();
		
		/* dense graph adjacent */
		System.out.println(Arrays.toString(g1.adjacent(6)));
		System.out.println(Arrays.toString(g1.adjacent(5)));
		System.out.println(Arrays.toString(g1.adjacent(0)));
		
		System.out.println();
		/* sparse graph adjacent */
		System.out.println(Arrays.toString(g.adjacent(6)));
		System.out.println(Arrays.toString(g.adjacent(5)));
		System.out.println(Arrays.toString(g.adjacent(0)));
		
		

		System.out.println("\nsparse graph size "+g.size());
		System.out.println("dense graph size "+g1.size());
	}

}
