import java.util.*;
/**
 * This class implements the Breadth-First Search algorithm on a graph.
 *
 * @param <V> the type of data each Vertex in the graph holds
 */
public class BreadthFirstSearch<V> extends Search<V> {
    /**
     * Executes the Breadth-First Search algorithm from a source Vertex to a destination Vertex.
     *
     * @param source the starting Vertex
     * @param destination the ending Vertex
     * @return a List of Vertices from source to destination representing the shortest path
     */
    public List<V> bfs(Vertex<V> source, Vertex<V> destination) {
        Map<Vertex<V>, Vertex<V>> parentMap = new HashMap<>();
        Queue<Vertex<V>> queue = new LinkedList<>();
        Set<Vertex<V>> visited = new HashSet<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            if (current.equals(destination)) {
                return getPath(source, destination, parentMap);
            }
            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    parentMap.put(neighbor, current);
                }
            }
        }
        return null;
    }
}
