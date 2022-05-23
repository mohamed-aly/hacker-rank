package io.hackerrank.java;

// Java program to count islands in boolean 2D matrix

import java.util.*;
import java.lang.*;
import java.io.*;

class Islands {

    private int[][] array;
    private boolean visited[][];
    private int rows;
    private int cols;

    // These arrays are used to get row and column numbers
    // of 8 neighbors of a given cell
    static final int[] rowNbr = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
    static final int[] colNbr = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

    public Islands(int[][] array) {
        this.array = array;
        this.rows = array.length;
        this.cols = array[0].length;

        // Make a bool array to mark visited cells.
        // Initially all cells are unvisited
        this.visited = new boolean[rows][cols];
    }

    // A function to check if a given cell (row, col) can
    // be included in DFS
    boolean isSafe(int row, int col) {
        // row number is in range, column number is in range
        // and value is 1 and not yet visited
        return (row >= 0) && (row < rows) && (col >= 0) && (col < cols) && (array[row][col] == 1 && !visited[row][col]);
    }

    // A utility function to do DFS for a 2D boolean matrix.
    // It only considers the 8 neighbors as adjacent vertices
    void DFS(int row, int col) {

        // Mark this cell as visited
        visited[row][col] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k)
            if (isSafe(row + rowNbr[k], col + colNbr[k]))
                DFS(row + rowNbr[k], col + colNbr[k]);
    }

    // The main function that returns count of islands in a given
    // boolean 2D matrix
    int countIslands() {

        // Initialize count as 0 and traverse through the all cells
        // of given matrix
        int count = 0;
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                if (array[i][j] == 1 && !visited[i][j]) // If a cell with
                { // value 1 is not
                    // visited yet, then new island found, Visit all
                    // cells in this island and increment island count
                    DFS(i, j);
                    ++count;
                }

        return count;
    }

    // Driver method
    public static void main(String[] args) throws java.lang.Exception {
        int M[][] = new int[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        Islands I = new Islands(M);
        System.out.println("Number of islands is: " + I.countIslands());
    }
}

