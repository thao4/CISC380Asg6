
/**
 * CISC 380
 * Algorithms Assignment 5
 * 
 * Driver File for the Graph class.
 * tests the isAcyclic() method.
 * 
 * This driver file contains a single example test case to get you started.
 * You should include more test cases to ensure that your implementation works
 * correctly.
 * You do NOT need to submit this file.
 * 
 * @author YOUR NAME HERE
 *         Due Date: xx/xx/xx
 */

public class DirectedGraphDriver {

    /**
     * Creates a simple graph with 2 vertices connected by a single edge.
     * 
     * @return a simple directed graph with two nodes
     */
    public static DirectedGraph createSimpleGraph() {

        int[][] list = { { 1 },
                { }
        };

        DirectedGraph graph = new DirectedGraph(list);

        return graph;
    }// createSimpleGraph
    
    public static DirectedGraph createSimpleGraph2() {

        int[][] list = { {1,2},
                {},
                {4},
                {1,2},
                {3}
        };

        DirectedGraph graph = new DirectedGraph(list);

        return graph;
    }// createSimpleGraph2

    public static DirectedGraph createSimpleGraph3() {

        int[][] list = { {1,2},
                {3},
                {3},
                {},
                {5},
                {}
        };

        DirectedGraph graph = new DirectedGraph(list);

        return graph;
    }// createSimpleGraph3

    public static DirectedGraph createSimpleGraph4() {

        int[][] list = { {1,2},
                {3},
                {3},
                {},
                {5},
                {4}
        };

        DirectedGraph graph = new DirectedGraph(list);

        return graph;
    }// createSimpleGraph4
    /**
     * Creates a graph representation of a directed binary tree with the given
     * amount of nodes.
     * 
     * @return a graph with a directed binary tree
     */
    public static DirectedGraph createBinaryTree(int numNodes) {

        boolean[][] matrix = new boolean[numNodes][numNodes];

        // for every node
        for (int i = 0; i < numNodes; i++) {
            // if the left child is present, add it
            if ((2 * i + 1) < numNodes) {
                matrix[i][2 * i + 1] = true;
            }
            // if the right child is present, add it
            if ((2 * i + 2) < numNodes) {
                matrix[i][2 * i + 2] = true;

            }
        }

        DirectedGraph graph = new DirectedGraph(matrix);

        return graph;
    }// createBinaryTree

    /**
     * creates a graph representation of a forest of with the given amount of
     * directed unary trees, each of the given size.
     * 
     * @return a graph with a forest of unary trees
     */
    public static DirectedGraph createForest(int numTrees, int treeSize) {
        int numNodes = numTrees * treeSize;
        boolean[][] matrix = new boolean[numNodes][numNodes];

        // for numTrees
        for (int i = 0; i < numTrees; i++) {

            // connect the vertices in each node
            for (int j = 0; j < treeSize - 1; j++) {
                matrix[(i * treeSize) + j][(i * treeSize) + j + 1] = true;
            }

        }

        return new DirectedGraph(matrix);

    }// createForest

    public static void main(String[] args) {

        DirectedGraph graph = DirectedGraphDriver.createSimpleGraph();
        DirectedGraph graph2 = DirectedGraphDriver.createBinaryTree(7);
        DirectedGraph graph3 = DirectedGraphDriver.createSimpleGraph2();
        DirectedGraph graph4 = DirectedGraphDriver.createSimpleGraph3();
        DirectedGraph graph5 = DirectedGraphDriver.createSimpleGraph4();

        System.out.println("Test 1: Expected: true");
        System.out.println("Graph Representation: \n" + graph.toString());
        System.out.println("is Acyclic: " + graph.isAcyclic());
        
        System.out.println("\nTest 2: Expected: true");
        System.out.println("Graph Representation: \n" + graph2.toString());
        System.out.println("is Acyclic: " + graph2.isAcyclic());
        
        System.out.println("\nTest 3: Expected: false");
        System.out.println("Graph Representation: \n" + graph3.toString());
        System.out.println("is Acyclic: " + graph3.isAcyclic());
        
        System.out.println("\nTest 4: Expected: true");
        System.out.println("Graph Representation: \n" + graph4.toString());
        System.out.println("is Acyclic: " + graph4.isAcyclic());

        System.out.println("\nTest 5: Expected: false");
        System.out.println("Graph Representation: \n" + graph5.toString());
        System.out.println("is Acyclic: " + graph5.isAcyclic());

    }// main

}// class