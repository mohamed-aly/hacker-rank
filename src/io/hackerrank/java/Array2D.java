package io.hackerrank.java;

public class Array2D {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] array3 = {9, 10, 11, 12};
        int[] array4 = {13, 14, 15, 16};

        int[][] twoDArray = {array1, array2, array3, array4};

        System.out.println(largestHourGlass(twoDArray));
    }

    private static int largestHourGlass(int[][] twoDArray) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < twoDArray.length - 2; i++) {
            for (int j = 0; j < twoDArray[i].length - 2; j++) {
                int sum = twoDArray[i][j] + twoDArray[i][j + 1] + twoDArray[i][j + 2]
                        + twoDArray[i + 1][j + 1]
                        + twoDArray[i + 2][j] + twoDArray[i + 2][j + 1] + twoDArray[i + 2][j + 2];

                if(sum > largest){
                    largest = sum;
                }
            }
        }

        return largest;
    }
}
