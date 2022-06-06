package io.hackerrank.java;

import java.util.LinkedList;
import java.util.List;

public class Palindromes {
    //marikiki
    public List<String> getPalindromes(String word) {
        List<String> list = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int nextIndexOfChar = word.indexOf(character, i + 1);
            while (nextIndexOfChar > 0) {
                if (isPalindrome(word, i, nextIndexOfChar)) {
                    list.add(word.substring(i, nextIndexOfChar+1));
                    nextIndexOfChar = word.indexOf(character, nextIndexOfChar + 1);
                }
            }
        }

        return list;
    }

    public boolean isPalindrome(String word, int i, int j) {
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
