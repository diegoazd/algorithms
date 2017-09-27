package graph;

class ShortestPath {
  public Graph graph;
  public int[] dist;
  public boolean[] visited;

  public ShortestPath(int nodes) {
    graph = new Graph(nodes);
    dist = new int[nodes];
    visited = new boolean[nodes];

    for(int i=1; i<nodes; i++)
      dist[i] = 100000;
  }

  public void bellmanFord() {
  for(int i=0; i<graph.adj.length-1; i++) {
    int j=0;
    while(j < graph.adj[i].size()) {
        Node current = graph.adj[i].get(j);

        if(dist[current.u] + current.w < dist[current.v])
          dist[current.v] = dist[current.u] + current.w;

        System.out.println(dist[current.v]+"---"+current.v);
        j++;
        
      }
    }
  }

} 
