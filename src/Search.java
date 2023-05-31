import java.util.*;
public class Search<V> {
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
