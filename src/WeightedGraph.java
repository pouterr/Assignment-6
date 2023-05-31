import java.util.*;
/**
 * This class represents a WeightedGraph. It maintains a list of vertices in the graph.
 *
 * @param <V> the type of data each Vertex in the graph holds
 */
public class WeightedGraph<V> {
    // List of vertices in the graph
    private List<Vertex<V>> vertices = new ArrayList<>();

    /**
     * Adds a Vertex to the graph.
     *
     * @param vertex the Vertex to be added to the graph
     */
    public void addVertex(Vertex<V> vertex) {
        vertices.add(vertex);
    }

    /**
     * Returns the list of vertices in the graph.
     *
     * @return the list of vertices in the graph
     */
    public List<Vertex<V>> getVertices() {
        return vertices;
    }
}
