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

        //case sensitive
        a = a.toUpperCase();
        b = b.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(b.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
