import java.util.*;

public class WeightedGraph<V> {
    private List<Vertex<V>> vertices = new ArrayList<>();

    public void addVertex(Vertex<V> vertex) {
        vertices.add(vertex);
    }

    public List<Vertex<V>> getVertices() {
        return vertices;
    }
}
