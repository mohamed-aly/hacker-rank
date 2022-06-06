package leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("dddddddddddddddddddddddddddddddddd"));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 1, start = 0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;

            while (low >= 0 && s.charAt(low) == s.charAt(i)){
                low--;
            }

            while (high < n && s.charAt(high) == s.charAt(i)){
                high++;
            }

            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }

            int length = high - low - 1;
            if(length > maxLength){
                maxLength = length;
                start = low + 1;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
