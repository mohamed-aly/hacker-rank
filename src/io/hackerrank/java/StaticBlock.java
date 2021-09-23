package io.hackerrank.java;

import java.util.Scanner;

public class StaticBlock {
    private static boolean flag;
    private static int B;
    private static int H;


    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else if (B + H <= 200) {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
