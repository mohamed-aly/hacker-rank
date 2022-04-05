package io.hackerrank.java;

import java.util.LinkedList;
import java.util.List;

public class Palindromes {
    //marikiki
    public List<String> getPalindromes(String word){
        List<String> list = new LinkedList<>();

        for(int i = 0; i < word.length(); i++){
            char character = word.charAt(i);
            int nextIndexOfChar = word.indexOf(character, i+1);
            while (nextIndexOfChar > 0){
                String temp = word.substring(i, nextIndexOfChar+1);
                if(isPalindrome(temp)){
                    list.add(temp);
                    nextIndexOfChar = word.indexOf(character, nextIndexOfChar+1);
                }
            }
        }

        return list;
    }

    public boolean isPalindrome(String word){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
