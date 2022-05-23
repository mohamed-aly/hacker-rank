package io.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneDimensionArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(Arrays.toString(a));

        bufferedReader.close();
    }

}
