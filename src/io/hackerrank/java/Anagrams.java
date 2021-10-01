package io.hackerrank.java;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("madas", "sadam"));

    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()
                || a.length() + b.length() <= 2
                || a.length() + b.length() >= 100
                || !(a + b).matches("^[a-zA-Z]+$")) return false;

        char[] firstArray = a.toLowerCase().toCharArray();
        char[] secondArray = b.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }
}
