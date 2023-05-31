import java.util.*;
public class DijkstraSearch<V> extends Search<V> {
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
