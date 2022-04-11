package io.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1)+\\b";

        Scanner scanner = new Scanner(System.in);
        int numberOfSentences = Integer.parseInt(scanner.nextLine());


        while (numberOfSentences-- > 0){
            System.out.println(scanner.nextLine().replaceAll(regex, "$1"));
        }
    }
}
