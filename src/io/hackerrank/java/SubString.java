package io.hackerrank.java;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if (start >= 0 && end > start && end <= S.length() && S.matches("^[a-zA-Z]+$")) {
            System.out.println(S.substring(start, end));
        }
    }
}
