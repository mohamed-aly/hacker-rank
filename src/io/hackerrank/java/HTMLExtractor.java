package io.hackerrank.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<(.*)>([^<]*)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (testCases-- > 0) {
            String line = in.nextLine();
            Matcher m = pattern.matcher(line);
            boolean matchFound = false;

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }

            if(!matchFound){
                System.out.println("None");
            }

        }

    }
}
