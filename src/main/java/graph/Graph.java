package graph;

import java.util.*;

public class Graph {
  private int V, E;
  public LinkedList<Node> adj[];

  static int time = 0;

  public Graph(int vertexs) {
    V = vertexs;
    E = 0;
    adj = new LinkedList[V];
    for(int i=0; i<vertexs; i++) {
      adj[i] = new LinkedList<Node>();
    }
  }

  public int getNodes() {
    return this.E;
  }

  public int getVertexs() {
    return this.V;
  }

  public void addNode(int u, int v, int w) {
    adj[u].add(new Node(u,v,w));
    E++;
  }
}
