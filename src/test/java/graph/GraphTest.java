package graph;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class GraphTest {

  Graph graph;

  @Test
  public void shouldNodeBe0() {
    graph = new Graph(3);

    assertEquals(graph.getVertexs(), 3);
    assertEquals(graph.getNodes(), 0);

    graph.addNode(0,1,0);
    graph.addNode(0,2,0);
    graph.addNode(1,0,0);
    graph.addNode(1,1,0);
    graph.addNode(1,2,0);

    assertEquals(graph.getNodes(), 5);
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

  @Test
  public void shouldFindMSTPrim() {
    Prim p = new Prim(4);

    p.addNode(0,1,7);
    p.addNode(1,0,7);
    p.addNode(0,3,6);
    p.addNode(3,0,6);
    p.addNode(3,1,9);
    p.addNode(1,3,9);
    p.addNode(3,2,8);
    p.addNode(2,3,8);
    p.addNode(1,2,6);
    p.addNode(2,1,6);

    assertEquals(19l, p.mst());
  }

  @Test
  public void shouldFindShortestPathBellmanFord() {
    ShortestPath sp = new ShortestPath(4);
    sp.graph.addNode(0,1,7);
    sp.graph.addNode(1,0,7);
    sp.graph.addNode(0,3,6);
    sp.graph.addNode(3,0,6);
    sp.graph.addNode(3,1,9);
    sp.graph.addNode(1,3,9);
    sp.graph.addNode(3,2,8);
    sp.graph.addNode(2,3,8);
    sp.graph.addNode(1,2,6);
    sp.graph.addNode(2,1,6);

    sp.bellmanFord();

    assertEquals(sp.dist[1], 7);
    assertEquals(sp.dist[2], 13);
    assertEquals(sp.dist[3], 6);


  }
}
