package graph;

import java.util.*;

public class Graph {
  private int V, E;
  private LinkedList<Integer> adj[];

  static int time = 0;

  public Graph(int vertexs) {
    V = vertexs;
    E = 0;
    adj = new LinkedList[V];
    for(int i=0; i<vertexs; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  public int getEdges() {
    return this.E;
  }

  public int getVertexs() {
    return this.V;
  }

  class Edge {
    int v;
    int u;

    Edge(int u, int v) {
      this.v = v;
      this.u = u;
    }
  }

  public void addEdge(int u, int v) {
    adj[u].add(v);
    E++;
  }
}
