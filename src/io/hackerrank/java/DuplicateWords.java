package io.hackerrank.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numberOfSentences = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();

        while (numberOfSentences-- > 0){
            list.add(scanner.nextLine());
        }

        for(String word : list){
            Matcher matcher = pattern.matcher(word);

            while (matcher.find()){
                word = word.replaceAll(matcher.group(0), matcher.group(1));
            }

            System.out.println(word);
        }
    }
}
