package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingPositive {
    public static void main(String[] args) {
        int[] array = {9, 3, 2};
        System.out.println(findFirstMissingPositiveInArray(array));
    }

    private static int findFirstMissingPositiveInArray(int[] Array){
        int length = Array.length;

        for (int index = 0; index < length; index++) {

            while (Array[index] != index + 1) {
                if (Array[index] <= 0 || Array[index] >= length)
                    break;

                if(Array[index]==Array[Array[index]-1])
                    break;

                //swap until the correct position
                int temp = Array[index];
                Array[index] = Array[temp - 1];
                Array[temp - 1] = temp;
            }
        }

        for (int i = 0; i < length; i++){
            if (Array[i] != i + 1){
                return i + 1;
            }
        }

        return length + 1;
    }
}
