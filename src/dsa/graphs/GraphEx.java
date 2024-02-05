package dsa.graphs;

import java.util.ArrayList;

public class GraphEx {

	public static void main(String[] args) {

		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<Integer>());
		}

		addEdge(adj, 0, 1);          // representation
		addEdge(adj, 0, 2);           //  0 -> 1  2           0
		addEdge(adj, 1, 2);           //  1 -> 0  2  3        | \        
		addEdge(adj, 1, 3);           //  2 -> 0  1           |  1-----3    graph
                                      //  3 -> 1              | /    
		PrintGraphics(adj);           //                      2
	}

	static void PrintGraphics(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i < adj.size(); i++) {
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

		adj.get(u).add(v);
		adj.get(v).add(u);
	}

}
