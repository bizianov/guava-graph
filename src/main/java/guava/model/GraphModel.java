package guava.model;

import java.util.Collections;
import java.util.Set;

/**
 * Created by viacheslav on 6/23/17.
 */
public class GraphModel<T, V> {
    private Set<Node<T>> nodes;
    private Set<Edge<T, V>> edges;

    public GraphModel() {
        this.nodes = Collections.emptySet();
        this.edges = Collections.emptySet();
    }

    public GraphModel(Set<Node<T>> nodes, Set<Edge<T, V>> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public Set<Node<T>> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node<T>> nodes) {
        this.nodes = nodes;
    }

    public Set<Edge<T, V>> getEdges() {
        return edges;
    }

    public void setEdges(Set<Edge<T, V>> edges) {
        this.edges = edges;
    }
}
