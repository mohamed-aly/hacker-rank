package io.hackerrank.java;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithNoRepeatition {

    //abcdeee
    public static void main(String[] args) {
        System.out.println(longestUniqueCharSet("abcabcdccc"));
    }

    public static String longestUniqueCharSet(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for(int start = 0, end = 0; end<input.length(); end ++){
            char currentChar = input.charAt(end);
            if(visited.containsKey(currentChar)){
                start = visited.get(currentChar) + 1;
            }

            if(output.length() < end -start + 1){
                output = input.substring(start, end + 1);
            }

            visited.put(currentChar, end);
        }

        return output;
    }
}
