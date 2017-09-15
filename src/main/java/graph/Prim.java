package graph;

import java.util.*;

public class Prim {

  private Graph graph;
  boolean visited[];
  Queue<Node> queue = new PriorityQueue<Node>();

  public Prim(int V) {
    graph = new Graph(V);
    visited = new boolean[V];
  }

  public void addNode(int u, int v, int w) {
    graph.addNode(u,v,w); 
  }

  private int findInitialNode() {
    for(int i=0; i< graph.getVertexs(); i++) {
      if(graph.adj[i].size() > 0) {
        return graph.adj[i].get(0).u;
      }
    }

    return 0;
  }
  
  public long mst() {
    long minimumCost = 0l;

    queue.add(new Node(0, findInitialNode(), 0));
    
    while(!queue.isEmpty()){
      Node current = queue.poll();
      if(visited[current.v]) continue;

      visited[current.v]=true;
      minimumCost+=current.w;

      for(int i=0; i < graph.adj[current.v].size(); i++) {
        Node iteration = graph.adj[current.v].get(i);

        if(!visited[iteration.v])
          queue.add(iteration);
      }
    }

    return minimumCost;
  }
}
