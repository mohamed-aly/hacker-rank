package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        HeightReconstruction algorithm = new HeightReconstruction();
        algorithm.sort(array);
        for(int[] sub : array){
            System.out.println(Arrays.toString(sub));
        }
    }
}
