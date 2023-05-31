# Graph Algorithms

This repository contains Java implementations of graph algorithms, including Breadth-First Search (BFS) and Dijkstra's algorithm. The algorithms operate on an edge-weighted graph, where each vertex is represented by a `Vertex` object.

## Introduction

The goal of this project is to provide efficient implementations of graph algorithms for edge-weighted graphs. The `Vertex` class represents a vertex in the graph, and the `WeightedGraph` class stores the vertices and their adjacency relationships.

- `Vertex` class: Represents a vertex in a graph. It has the following important methods:
  - `addAdjacentVertex(destination, weight)`: Adds an adjacent vertex to this vertex with the given weight.
  - `getData()`: Returns the data associated with this vertex.
  - `getAdjacentVertices()`: Returns a map of adjacent vertices and their corresponding edge weights.

- `WeightedGraph` class: Represents a weighted graph. It has the following important methods:
  - `addVertex(vertex)`: Adds a vertex to the graph.
  - `getVertices()`: Returns a list of vertices in the graph.

- `Search` class: Base class for graph search algorithms. It provides a common method for retrieving the path between two vertices in a graph.
  - `getPath(source, destination, parentMap)`: Returns the path between the source and destination vertices using the parent map.

- `BreadthFirstSearch` class: Implements the Breadth-First Search algorithm for graph traversal. It has the following important method:
  - `bfs(source, destination)`: Performs a BFS starting from the source vertex and stops when the destination vertex is found. Returns the path between the source and destination vertices, or null if no path exists.

- `DijkstraSearch` class: Implements Dijkstra's algorithm for finding the shortest path in a graph. It has the following important method:
  - `dijkstra(source, destination)`: Performs Dijkstra's algorithm starting from the source vertex and finds the shortest path to the destination vertex. Returns the path between the source and destination vertices, or null if no path exists.

Here's an example usage:

```java
Vertex<String> A = new Vertex<>("A");
Vertex<String> B = new Vertex<>("B");
Vertex<String> C = new Vertex<>("C");
A.addAdjacentVertex(B, 1.0);
B.addAdjacentVertex(C, 2.0);

WeightedGraph<String> graph = new WeightedGraph<>();
graph.addVertex(A);
graph.addVertex(B);
graph.addVertex(C);

BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
List<String> bfsPath = bfs.bfs(A, C);
System.out.println("BFS path: " + bfsPath);

DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
List<String> dijkstraPath = dijkstra.dijkstra(A, C);
System.out.println("Dijkstra path: " + dijkstraPath);
