package leetcode;

public class HeightReconstruction {

    public void sort(int[][] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[][] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(array, low, high);
        sort(array, low, pivot - 1);
        sort(array, pivot + 1, high);
    }

    private int partition(int[][] array, int low, int high) {
        int[] pivot = array[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (array[j][0] < pivot[0] || (array[j][0] == pivot[0] && array[j][1] < pivot[1])) {
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, high);
        return i;
    }

    private int coupleSum(int[] array) {
        return array[0] + array[1];
    }

    private void swap(int[][] array, int i, int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
