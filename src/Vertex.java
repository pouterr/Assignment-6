import java.util.*;

/**
 * This class represents a Vertex in a graph. Each Vertex has data of a generic type
 * and a map of adjacent vertices with their corresponding edge weights.
 *
 * @param <V> the type of data this Vertex holds
 */
public class Vertex<V> {
    private V data;
    // Adjacency map, stores adjacent vertices and the weight of the edge connecting them
    private Map<Vertex<V>, Double> adjacentVertices = new HashMap<>();

    /**
     * Vertex constructor, initializes the Vertex with its data.
     *
     * @param data the data of this Vertex
     */
    public Vertex(V data) {
        this.data = data;
    }

    /**
     * Adds an adjacent Vertex to this Vertex with a specified edge weight.
     *
     * @param destination the Vertex to be added as an adjacent Vertex
     * @param weight the weight of the edge connecting this Vertex and the adjacent Vertex
     */
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    /**
     * Returns the data contained in this Vertex.
     *
     * @return the data of this Vertex
     */
    public V getData() {
        return data;
    }

    /**
     * Returns the map of adjacent vertices and their corresponding edge weights.
     *
     * @return the adjacency map of this Vertex
     */
    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
}
