import java.util.*;

/**
 * This is the base class for graph search algorithms. It provides a common method for retrieving the path
 * between two vertices in a graph.
 *
 * @param <V> the type of data each Vertex in the graph holds
 */
public class Search<V> {
    /**
     * Returns the path between the source vertex and the destination vertex using the parent map.
     *
     * @param source      the source vertex
     * @param destination the destination vertex
     * @param parentMap   the map that stores the parent vertex for each vertex in the path
     * @return the path between the source and destination vertices, or null if no path exists
     */
    public List<V> getPath(Vertex<V> source, Vertex<V> destination, Map<Vertex<V>, Vertex<V>> parentMap) {
        LinkedList<V> path = new LinkedList<>();
        Vertex<V> current = destination;
        while (current != null) {
            path.addFirst(current.getData());
            current = parentMap.get(current);
        }
        if (path.getFirst().equals(source.getData())) {
            return path;
        }
        return null;
    }
}
