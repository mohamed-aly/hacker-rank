package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {6, 2, 5, 3, 4, 10, 12, 11};
        quickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
