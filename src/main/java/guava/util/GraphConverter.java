package guava.util;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraph;
import com.google.common.graph.ValueGraphBuilder;
import guava.model.Edge;
import guava.model.GraphModel;
import guava.model.Node;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Created by viacheslav on 6/23/17.
 */
public class GraphConverter {
    public static <T, V> ValueGraph modelToGraph(GraphModel<T, V> graphModel) {
        Set<Node<T>> nodes = graphModel.getNodes();
        Set<Edge<T, V>> edges = graphModel.getEdges();

        MutableValueGraph<Node<T>, V> weightedGraph = ValueGraphBuilder.directed().build();

        nodes.forEach(weightedGraph::addNode);
        edges.forEach(edge -> weightedGraph.putEdgeValue(edge.getSource(), edge.getTarget(), edge.getValue()));

        return weightedGraph;
    }

    public static <T, V> GraphModel<T, V> graphToModel(ValueGraph<Node<T>, V> valueGraph) {
        Set<Node<T>> nodes = valueGraph.nodes();
        Set<EndpointPair<Node<T>>> edges = valueGraph.edges();
        Set<Edge> modelEdges = edges.stream()
                .map(edge -> new Edge(edge.nodeU(),
                        edge.nodeV(),
                        valueGraph.edgeValue(edge.nodeU(), edge.nodeV())))
                .collect(toSet());
        return new GraphModel(nodes, modelEdges);
    }
}
