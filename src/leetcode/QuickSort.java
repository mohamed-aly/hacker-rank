package leetcode;

public class QuickSort {
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    private void quickSort(int[] array, int low, int high){
        if(low >= high) return;

        int pivot = partition(array, low, high);
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);
    }

   private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low;

        for(int j = low; j < high; j++){
            if(array[j] < pivot){
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, high);
        return i;
   }
}
