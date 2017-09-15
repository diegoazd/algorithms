package graph;


public class Node implements Comparable<Node> {
  int u;
  int v;
  int w;

  public Node(int u, int v, int w) {
    this.u = u;
    this.v = v;
    this.w = w;
  }

  public int compareTo(Node n) {
    return this.w - n.w;
  }
}
