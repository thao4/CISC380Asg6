import java.util.*;

/**
 * CISC 380
 * Algorithms Assignment 6
 * 
 * Driver File for the ColoredGraph class.
 * 
 * This driver file contains two example test case to get you started.
 * You should include more test cases to ensure that your implemenetation works
 * correctly.
 * You do NOT need to submit this file.
 * 
 * @author YOUR NAME HERE
 *         Due Date: xx/xx/xx
 */

public class GraphDriver {

    /**
     * Creates a colored graph with a cycle. There are two valid colored paths from
     * start = 0 to t = 7.
     * The shortest path has a distance of 3: (0, 3, 4, 7).
     * The other path has a distance of 6: (0, 3, 5, 6, 8, 9, 7).
     */
    public static ColoredGraph twoValidPaths() {

        int[][] list = {
                { 1, 3 },
                { 0, 2 },
                { 1 },
                { 0, 4, 5 },
                { 3, 7 },
                { 3, 6 },
                { 5, 8 },
                { 4, 9 },
                { 6, 9 },
                { 8, 7 }

        };
        String[][] colors = {
                { "blue", "red" },
                { "blue", "yellow" },
                { "yellow" },
                { "red", "yellow", "yellow" },
                { "yellow", "blue" },
                { "yellow", "blue" },
                { "blue", "red" },
                { "blue", "blue" },
                { "red", "yellow" },
                { "yellow", "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph with a cycle. There are two valid colored paths from
     * start = 0 to t = 7.
     * The shortest path has a distance of 3: (0, 3, 5, 7).
     * The other path has a distance of 6: (0, 3, 4, 6, 8, 9, 7).
     */
    public static ColoredGraph twoValidPaths2() {

        int[][] list = {
                { 1, 3 },
                { 0, 2 },
                { 1 },
                { 0, 4, 5 },
                { 3, 6 },
                { 3, 7 },
                { 4, 8 },
                { 5, 9 },
                { 6, 9 },
                { 8, 7 }

        };
        String[][] colors = {
                { "blue", "red" },
                { "blue", "yellow" },
                { "yellow" },
                { "red", "yellow", "yellow" },
                { "yellow", "blue" },
                { "yellow", "blue" },
                { "blue", "red" },
                { "blue", "blue" },
                { "red", "yellow" },
                { "yellow", "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t
     * = 7.
     * The path has a distance of 3: (0, 3, 4, 7).
     */
    public static ColoredGraph oneValidPath() {
        int[][] list = {
                { 1, 3 },
                { 0, 2 },
                { 1 },
                { 0, 4 },
                { 3, 7 },
                {},
                {},
                { 4 }
        };
        String[][] colors = {
                { "blue", "red" },
                { "blue", "yellow" },
                { "yellow" },
                { "red", "yellow" },
                { "yellow", "blue" },
                {},
                {},
                { "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t
     * = 5.
     * The path has a distance of 3: (0, 1, 4, 5).
     */
    public static ColoredGraph oneValidPath2() {
        int[][] list = {
                { 1, 3, 4 },
                { 0, 2, 4, 5 },
                { 1, 5 },
                { 0, 4 },
                { 0, 1, 3, 5 },
                { 1, 2, 4 }
        };
        String[][] colors = {
                { "red", "blue", "yellow" },
                { "red", "blue", "yellow", "yellow" },
                { "blue", "red" },
                { "blue", "blue" },
                { "yellow", "yellow", "blue", "blue" },
                { "yellow", "red", "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t
     * = 8.
     * The path has a distance of 6: (0, 1, 4, 3, 6, 7, 8).
     */
    public static ColoredGraph oneValidPath3() {
        int[][] list = {
                { 1, 3, 4 },
                { 0, 2, 4 },
                { 1, 5 },
                { 0, 4, 6 },
                { 0, 1, 3, 5, 7, 8 }, // 4
                { 2, 4, 7, 8 },
                { 3, 7 },
                { 4, 5, 6, 8 },
                { 4, 5, 7 }
        };
        String[][] colors = {
                { "red", "blue", "yellow" },
                { "red", "blue", "yellow" },
                { "blue", "yellow" },
                { "blue", "blue", "red" },
                { "yellow", "yellow", "blue", "red", "blue", "red" }, // 4
                { "yellow", "red", "yellow", "red" },
                { "red", "yellow" },
                { "blue", "yellow", "yellow", "blue" },
                { "red", "red", "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t
     * = 4.
     * The path has a distance of 3: (0, 2, 1, 3).
     */
    public static ColoredGraph oneValidPath4() {
        int[][] list = {
                { 1, 2 },
                { 0, 2, 3 },
                { 0, 1 },
                { 1 }
        };
        String[][] colors = {
                { "red", "red" },
                { "red", "yellow", "blue" },
                { "red", "yellow" },
                { "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is one valid colored path from start = 0 to t
     * = 8.
     * The path has a distance of 6: (0, 1, 4, 3, 6, 7, 8).
     */
    public static ColoredGraph oneValidPath5() {
        int[][] list = {
                { 1, 3, 4 },
                { 0, 2, 4 },
                { 1, 5 },
                { 0, 4, 6, 7 },
                { 0, 1, 3, 5, 7, 8 }, // 4
                { 2, 4, 7, 8 },
                { 3, 7 },
                { 3, 4, 5, 6, 8 },
                { 4, 5, 7 }
        };
        String[][] colors = {
                { "red", "yellow", "yellow" },
                { "red", "blue", "yellow" },
                { "blue", "yellow" },
                { "yellow", "blue", "red", "red" },
                { "yellow", "yellow", "blue", "red", "blue", "red" }, // 4
                { "yellow", "red", "yellow", "red" },
                { "red", "yellow" },
                { "blue", "red", "yellow", "yellow", "blue" },
                { "red", "red", "blue" }
        };
        return new ColoredGraph(list, colors);
    }

    /**
     * Creates a colored graph. There is no valid colored path from start = 0 to t =
     * 5.
     */
    public static ColoredGraph noValidPath() {
        int[][] list = {
                { 1, 3, 4 },
                { 0, 2, 4, 5 },
                { 1, 5 },
                { 0, 4 },
                { 0, 1, 3, 5 },
                { 1, 2, 4 }
        };
        String[][] colors = {
                { "red", "red", "yellow" },
                { "red", "blue", "yellow", "blue" },
                { "blue", "red" },
                { "red", "blue" },
                { "yellow", "yellow", "blue", "red" },
                { "blue", "red", "red" }
        };
        return new ColoredGraph(list, colors);
    }

    public static void main(String[] args) {

        ColoredGraph oneValidPath = GraphDriver.oneValidPath();
        ColoredGraph oneValidPath2 = GraphDriver.oneValidPath2();
        ColoredGraph oneValidPath3 = GraphDriver.oneValidPath3();
        ColoredGraph oneValidPath4 = GraphDriver.oneValidPath4();
        ColoredGraph oneValidPath5 = GraphDriver.oneValidPath5();
        ColoredGraph twoValidPaths = GraphDriver.twoValidPaths();
        ColoredGraph twoValidPaths2 = GraphDriver.twoValidPaths2();
        ColoredGraph noValidPath = GraphDriver.noValidPath();

        // Test 1
        System.out.println("---- Test 1 ----");
        System.out.println("Graph Representation: \n" + oneValidPath.toString());
        System.out.println("Actual: " + oneValidPath.coloredMaze(0, 7));
        System.out.println("Expected: 3");
        System.out.println("Actual: " + Arrays.toString(oneValidPath.getSolution(0, 7)));
        System.out.println("Expected: [0, 3, 4, 7]");

        // Test 2
        System.out.println("---- Test 2 ----");
        System.out.println("Graph Representation: \n" + oneValidPath2.toString());
        System.out.println("Actual: " + oneValidPath2.coloredMaze(0, 5));
        System.out.println("Expected: 3");
        System.out.println("Actual: " + Arrays.toString(oneValidPath2.getSolution(0, 5)));
        System.out.println("Expected: [0, 1, 4, 5]");

        // Test 3
        System.out.println("---- Test 3 ----");
        System.out.println("Graph Representation: \n" + oneValidPath3.toString());
        System.out.println("Actual: " + oneValidPath3.coloredMaze(0, 8));
        System.out.println("Expected: 6");
        System.out.println("Actual: " + Arrays.toString(oneValidPath3.getSolution(0, 8)));
        System.out.println("Expected: [0, 1, 4, 3, 6, 7, 8]");

        // Test 4
        System.out.println("---- Test 4 ----");
        System.out.println("Graph Representation: \n" + twoValidPaths.toString());
        System.out.println("Actual: " + twoValidPaths.coloredMaze(0, 7));
        System.out.println("Expected: 3");
        System.out.println("Actual: " + Arrays.toString(twoValidPaths.getSolution(0, 7)));
        System.out.println("Expected: [0, 3, 4, 7]");

        // Test 5
        System.out.println("---- Test 5 ----");
        System.out.println("Graph Representation: \n" + noValidPath.toString());
        System.out.println("Actual: " + noValidPath.coloredMaze(0, 5));
        System.out.println("Expected: null");
        System.out.println("Actual: " + Arrays.toString(noValidPath.getSolution(0, 5)));
        System.out.println("Expected: null");

        // Test 6
        System.out.println("---- Test 6 ----");
        System.out.println("Graph Representation: \n" + oneValidPath4.toString());
        System.out.println("Actual: " + oneValidPath4.coloredMaze(0, 3));
        System.out.println("Expected: 3");
        System.out.println("Actual: " + Arrays.toString(oneValidPath4.getSolution(0, 3)));
        System.out.println("Expected: [0, 2, 1, 3]");

        // Test 7
        System.out.println("---- Test 7 ----");
        System.out.println("Graph Representation: \n" + twoValidPaths2.toString());
        System.out.println("Actual: " + twoValidPaths2.coloredMaze(0, 7));
        System.out.println("Expected: 3");
        System.out.println("Actual: " + Arrays.toString(twoValidPaths2.getSolution(0, 7)));
        System.out.println("Expected: [0, 3, 5, 7]");

        // Test 8
        System.out.println("---- Test 8 ----");
        System.out.println("Graph Representation: \n" + oneValidPath5.toString());
        System.out.println("Actual: " + oneValidPath5.coloredMaze(0, 8));
        System.out.println("Expected: 6");
        System.out.println("Actual: " + Arrays.toString(oneValidPath5.getSolution(0, 8)));
        System.out.println("Expected: [0, 1, 4, 3, 6, 7, 8]");
    }// main

}// class