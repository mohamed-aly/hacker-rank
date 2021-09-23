package io.hackerrank.java;

import java.util.Scanner;

public class LoopII {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t && t <= 500; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if (a + b >= 0 && a + b <= 100 && n >= 1 && n <= 15) {
                for (int x = 0; x < n; x++) {
                    System.out.print(a + sequenceCalculator(x, b) + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }

    private static int sequenceCalculator(int iteration, int b) {
        if (iteration == 0) return b;

        return ((int) Math.pow(2, iteration) * b) + sequenceCalculator(--iteration, b);
    }
}
