package io.hackerrank.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(validateUserName(scanner.nextLine()));
        }
    }

    private static String validateUserName(String username) {

        if (username.matches("[^[a-zA-z_]+[0-9]*]{8,30}")) return "Valid";

        return "Invalid";
    }
}
