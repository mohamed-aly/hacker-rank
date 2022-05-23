package io.hackerrank.java;

// Java program to count islands in boolean 2D matrix

class Islands {

    private int[][] matrix;
    private int rows;
    private int cols;

    private boolean[][] visited;

    private static final int[] rowsNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] colsNbr = {-1, 0, 1, -1, 1, -1, 0, 1};

    public Islands(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;

        this.visited = new boolean[rows][cols];
    }

    private boolean isSafe(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols
                && matrix[row][col] == 1 && !visited[row][col];
    }

    private void DFS(int row, int col) {
        this.visited[row][col] = true;

        for (int k = 0; k < 8; k++) {
            if (isSafe(row + rowsNbr[k], col + colsNbr[k])) {
                DFS(row + rowsNbr[k], col + colsNbr[k]);
            }
        }

    }

    public int countIslands() {
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    DFS(i, j);
                    counter++;
                }
            }
        }

        return counter;
    }

    // Driver method
    public static void main(String[] args) {
        int M[][] = new int[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        Islands I = new Islands(M);
        System.out.println("Number of islands is: " + I.countIslands());
    }
}

