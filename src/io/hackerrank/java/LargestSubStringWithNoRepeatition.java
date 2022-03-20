package io.hackerrank.java;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithNoRepeatition {

    //abcdeee
    public static void main(String[] args) {
        System.out.println(longestUniqueCharSet("abcabcdeccc"));
    }

    public static String longestUniqueCharSet(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;

        for(int start = 0, end = 0; end <input.length(); end++){
            char currentChar = input.charAt(end);

            if(visited.containsKey(currentChar)){
                start = visited.get(currentChar) + 1;
            }

            if(endIndex - startIndex < end - start){
                startIndex = start;
                endIndex = end;
            }

            visited.put(currentChar, end);
        }

        return input.substring(startIndex, endIndex + 1);
    }
}
