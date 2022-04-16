package io.hackerrank.java;

public class ArrayNegativeSum {
    public static void main(String[] args) {
        int[] array = {1, -2, 4, -5, 1};
        int counter = 0;
        for (int subarrayLength = 1; subarrayLength < array.length; subarrayLength++) {
            int sum = 0;
            for (int i = 0; i < array.length - subarrayLength; i++) {
                sum += array[i];
                if (sum < 0) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
