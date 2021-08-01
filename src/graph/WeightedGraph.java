package graph;

/**
 * Represents a weighted graph.
 *
 * @param <T> Value of a given vertex.
 */
public interface WeightedGraph<T> {
  /**
   * Adds an edge connecting a to b with a provided weight.
   *
   * @param a Origin
   * @param b Destination
   * @param weight Cost of the edge
   *
   * @return Whether an edge was added
   */
  boolean addEdge(T a, T b, int weight);

  /**
   * Returns an iterable of all neighbor vertices of the provided vertex.
   *
   * Throws (SOMETHING) if the vertex was not within the graph.
   *
   * @param vertex Vertex value.
   */
  Iterable<WeightedEdge<T>> getNeighbors(T vertex);
}