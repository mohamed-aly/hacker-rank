package io.hackerrank.java;

import java.util.Scanner;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();

        if (s.length() >= 1 || s.length() <= 4 * Math.pow(10, 5) && s.matches("[A-Za-z\\s!,?._'@]+")) {
            String[] tokens = s.split("[!,\\s?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }else {
            System.out.println(0);
        }

    }


}
