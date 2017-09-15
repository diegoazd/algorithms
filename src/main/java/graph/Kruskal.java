package graph;

import java.util.*;

public class Kruskal {
  
  int[] id;
  int nodes;
  int edges;
  private int MAX = 10005;

  public Kruskal(int nodes, int edges) {
    this.nodes = nodes;
    this.edges = edges;
    id = new int[MAX];
    initialize();
  }


  void initialize() {
    for(int i=0; i < MAX; i++) {
      id[i]= i;
    } 
  }

  int root(int x) {
    while(id[x] != x) {
      id[x] = id[id[x]];
      x = id[x];
    }
    return x;
  }

  void union(int x, int y) {
    int p = root(x);
    int q = root(y);
    id[p] = id[q];
  }

  public long mst(List<Node> nodes) {
    int x;
    int y;
    long cost = 0;
    long totalCost = 0l;
    Collections.sort(nodes);

    for(int i=0; i<edges; i++) {
      Node node = nodes.get(i);
      cost = node.w;
      x = node.u;
      y = node.v;
      if(root(x) != root(y)) {
        totalCost += cost;
        union(x,y);
      }
    }

    return totalCost;
  }
}
