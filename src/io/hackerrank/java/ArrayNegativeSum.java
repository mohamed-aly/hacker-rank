package io.hackerrank.java;

import java.util.Scanner;

public class ArrayNegativeSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = j; j < n; j++) {
                sum += array[k];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
