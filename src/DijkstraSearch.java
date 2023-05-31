import java.util.*;
/**
 * This class implements the Dijkstra's shortest path algorithm on a graph.
 *
 * @param <V> the type of data each Vertex in the graph holds
 */
public class DijkstraSearch<V> extends Search<V> {
    /**
     * Executes the Dijkstra's shortest path algorithm from a source Vertex to a destination Vertex.
     *
     * @param source the starting Vertex
     * @param destination the ending Vertex
     * @return a List of Vertices from source to destination representing the shortest path
     */
    public List<V> dijkstra(Vertex<V> source, Vertex<V> destination) {
        Map<Vertex<V>, Vertex<V>> parentMap = new HashMap<>();
        Map<Vertex<V>, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<V>> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        distances.put(source, 0.0);
        queue.offer(source);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            if (current.equals(destination)) {
                return getPath(source, destination, parentMap);
            }
            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                double tentativeDist = distances.get(current) + current.getAdjacentVertices().get(neighbor);
                if (!distances.containsKey(neighbor) || tentativeDist < distances.get(neighbor)) {
                    distances.put(neighbor, tentativeDist);
                    parentMap.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }
        return null;
    }
}
