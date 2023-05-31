import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Creates vertices
        Vertex<String> A = new Vertex<>("D");
        Vertex<String> B = new Vertex<>("B");
        Vertex<String> C = new Vertex<>("C");
        // Adds adjacent vertices with weights
        A.addAdjacentVertex(B, 1.0);
        B.addAdjacentVertex(C, 2.0);
        // Creates a weighted graph and adds vertices
        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        // Performs Breadth-First Search and prints the path
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        List<String> bfsPath = bfs.bfs(A, C);
        System.out.println("BFS path: " + bfsPath);
        // Performs Dijkstra's shortest path search and prints the path
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        List<String> dijkstraPath = dijkstra.dijkstra(A, C);
        System.out.println("Dijkstra path: " + dijkstraPath);
    }
}
