package com.goldenstudios.codingchallenges.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix implements Graph {
    private final int[][] adjMat;
    private final int numVertices;

    public GraphAdjMatrix(int numVertices) {
        this.adjMat = new int[numVertices][numVertices];
        this.numVertices = numVertices;
    }

    private boolean vertexExists(int vertex) {
        return (vertex>=0 && vertex < this.numVertices);
    }

    // addEdge
    @Override
    public void addEdge(int src, int dest) {
        if( !vertexExists(src) || !(vertexExists(dest))) {
            System.out.println("Invalid vertices");
            return;
        }
        this.adjMat[src][dest] = 1;
        this.adjMat[dest][src] = 1;
    }

    // removeEdge
    @Override
    public void removeEdge(int src, int dest) {
        if( !vertexExists(src) || !(vertexExists(dest))) {
            System.out.println("Invalid vertices");
            return;
        }
        this.adjMat[src][dest] = 0;
        this.adjMat[dest][src] = 0;
    }

    // getDegree

    @Override
    public int getDegree(int vertex) {

        if(!vertexExists(vertex)) {
            System.out.println("Invalid vertex");
            return -1;
        }

        int degreeOfVertex = 0;

        for(int column = 0; column < this.numVertices; column++ ){
            if(this.adjMat[vertex][column] == 1)
                degreeOfVertex++;
        }

        return degreeOfVertex;
    }


    // hasEdge

    @Override
    public boolean hasEdge(int src, int dest) {
        return this.adjMat[src][dest] == 1;
    }


    // getNeighbors

    @Override
    public List<Integer> getNeighbors(int vertex) {
        if(!vertexExists(vertex)) {
            System.out.println("Invalid Vertex");
            return null;
        }

        List<Integer> neighbors = new ArrayList<>();

        for(int column = 0 ; column < this.numVertices ; column++) {
            if(this.adjMat[vertex][column] == 1)
                neighbors.add(column);
        }

        return neighbors;
    }


    // printGraphInAdjMatrix
    @Override
    public void printGraph() {
        System.out.println("Graph with Adjacency Matrix is: ");
        System.out.print("   ");
        for (int column = 0 ; column < this.numVertices; column++) {
            System.out.print(" " + column);
        }
        System.out.println();
        System.out.print("   ");
        for (int column = 0 ; column < this.numVertices; column++) {
            System.out.print(" -");
        }
        System.out.println();
        for(int row = 0; row < this.numVertices; row++) {
            System.out.print(row + " :");
            for(int column = 0; column < this.numVertices; column++) {
                System.out.print(" " + this.adjMat[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new GraphAdjMatrix(4);

        g.addEdge(0,1);
        g.printGraph();
        g.addEdge(0,2);
        g.printGraph();
        g.addEdge(1,3);
        g.printGraph();
        System.out.println("degree of vertex 1 is " + g.getDegree(1));
        System.out.println("degree of vertex 2 is " + g.getDegree(2));
        System.out.println("degree of vertex 3 is " + g.getDegree(3));
        g.addEdge(2,3);
        g.printGraph();
        System.out.println("degree of vertex 1 is " + g.getDegree(1));
        System.out.println("degree of vertex 2 is " + g.getDegree(2));
        System.out.println("degree of vertex 3 is " + g.getDegree(3));
        g.removeEdge(2, 3);
        g.printGraph();
        System.out.println("degree of vertex 1 is " + g.getDegree(1));
        System.out.println("degree of vertex 2 is " + g.getDegree(2));
        System.out.println("degree of vertex 3 is " + g.getDegree(3));

        System.out.println("does 0 have an edge of 3: " + g.hasEdge(0,3));
        System.out.println("does 1 have an edge of 3: " + g.hasEdge(1,3));

        System.out.println("neighbors of vertex 1: " + g.getNeighbors(1));
        System.out.println("neighbors of vertex 0: " + g.getNeighbors(0));
        System.out.println("neighbors of vertex 3: " + g.getNeighbors(3));
    }

}
