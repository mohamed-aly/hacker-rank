package io.hackerrank.java;

public class LargestAndSmallestSubString {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for(int i = 0; i <= s.length()-k && s.matches("^[a-zA-Z]+$"); i++){
            String subString = s.substring(i, i+k);

            if(smallest.isEmpty() || subString.compareTo(smallest) < 0){
                smallest = subString;
            }

            if(subString.compareTo(largest) > 0){
                largest = subString;
            }
        }

        return smallest + "\n" + largest;
    }

}
