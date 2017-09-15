package graph;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class GraphTest {

  Graph graph;

  @Test
  public void shouldEdgeBe0() {
    graph = new Graph(3);

    assertEquals(graph.getVertexs(), 3);
    assertEquals(graph.getEdges(), 0);

    graph.addEdge(0,1);
    graph.addEdge(0,2);
    graph.addEdge(1,0);
    graph.addEdge(1,1);
    graph.addEdge(1,2);

    assertEquals(graph.getEdges(), 5);
  }

  @Test
  public void shouldFindMSTKruskal() {
    Kruskal k = new Kruskal(5, 10);
    List<Node> nodes = new ArrayList<Node>();
    nodes.add(new Node(1,2,7));
    nodes.add(new Node(2,1,7));
    nodes.add(new Node(1,4,6));
    nodes.add(new Node(4,1,6));
    nodes.add(new Node(4,2,9));
    nodes.add(new Node(2,4,9));
    nodes.add(new Node(4,3,8));
    nodes.add(new Node(3,4,8));
    nodes.add(new Node(2,3,6));
    nodes.add(new Node(3,2,6));

    assertEquals(k.mst(nodes), 19l);

    k = new Kruskal(5, 14);
    nodes = new ArrayList<Node>();

    nodes.add(new Node(0,1,1));
    nodes.add(new Node(1,0,1));
    nodes.add(new Node(0,2,7));
    nodes.add(new Node(2,0,7));
    nodes.add(new Node(1,2,5));
    nodes.add(new Node(2,1,5));
    nodes.add(new Node(1,3,4));
    nodes.add(new Node(3,1,4));
    nodes.add(new Node(2,4,6));
    nodes.add(new Node(4,2,6));
    nodes.add(new Node(1,4,3));
    nodes.add(new Node(4,1,3));
    nodes.add(new Node(3,4,2));
    nodes.add(new Node(4,3,2));

    assertEquals(11l, k.mst(nodes));
  }
}
