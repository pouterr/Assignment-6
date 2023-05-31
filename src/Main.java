import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vertex<String> A = new Vertex<>("D");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        A.addAdjacentVertex(B, 1.0);
        B.addAdjacentVertex(C, 2.0);

        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        List<String> bfsPath = bfs.bfs(A, C);
        System.out.println("BFS path: " + bfsPath);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        List<String> dijkstraPath = dijkstra.dijkstra(A, C);
        System.out.println("Dijkstra path: " + dijkstraPath);
    }
}
