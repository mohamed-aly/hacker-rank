package io.hackerrank.java;

import java.util.Arrays;

public class Decompress {
    public static void main(String[] args) {
        System.out.println(decompress("d4f5c14"));
    }

    private static String decompress(String compressed){
//        String[] chars = compressed.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] chars = compressed.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < chars.length; i+=2){
            for(int j = 0; j < Integer.parseInt(chars[i+1]); j++){
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
