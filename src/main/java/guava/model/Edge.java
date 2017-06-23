package guava.model;

/**
 * Created by viacheslav on 6/23/17.
 */
public class Edge<N, V> {
    private Node<N> source;
    private Node<N> target;
    private V value;

    public Edge() {
    }

    public Edge(Node<N> source, Node<N> target, V value) {
        this.source = source;
        this.target = target;
        this.value = value;
    }

    public Node<N> getSource() {
        return source;
    }

    public void setSource(Node<N> source) {
        this.source = source;
    }

    public Node<N> getTarget() {
        return target;
    }

    public void setTarget(Node<N> target) {
        this.target = target;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge<?, ?> edge = (Edge<?, ?>) o;

        if (source != null ? !source.equals(edge.source) : edge.source != null) return false;
        if (target != null ? !target.equals(edge.target) : edge.target != null) return false;
        return value != null ? value.equals(edge.value) : edge.value == null;
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", target=" + target +
                ", value=" + value +
                '}';
    }
}
