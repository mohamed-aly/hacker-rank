package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        Arrays.sort(array, Comparator.comparing((int[] arr) -> arr[0]).thenComparing(arr -> arr[1]));
        for(int[] sub : array){
            System.out.println(Arrays.toString(sub));
        }
    }
}
