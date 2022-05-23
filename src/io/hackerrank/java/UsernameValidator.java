package io.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }


        for(String word : list){
            System.out.println(validateUserName(word));
        }
    }

    private static String validateUserName(String username) {

        if (username.matches("^[a-zA-Z][\\w]{7,29}$")) return "Valid";

        return "Invalid";
    }
}
