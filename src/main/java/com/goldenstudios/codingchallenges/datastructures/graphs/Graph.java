package com.goldenstudios.codingchallenges.datastructures.graphs;

import java.util.List;

public interface Graph {

    public void addEdge(int src, int dest);

    public void removeEdge(int src, int dest);

    public boolean hasEdge(int src, int dest);

    public List<Integer> getNeighbors(int vertex);

    public int getDegree(int vertex);

    public void printGraph();

}
