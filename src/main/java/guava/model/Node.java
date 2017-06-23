package guava.model;

/**
 * Created by viacheslav on 6/23/17.
 */
public class Node<T> {
    private int id;
    private T value;

    public Node() {
    }

    public Node(int id, T value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (id != node.id) return false;
        return value != null ? value.equals(node.value) : node.value == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
