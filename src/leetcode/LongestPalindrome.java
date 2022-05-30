package leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("asmassa"));
    }

    public static String longestPalindrome(String s) {
       int length = s.length();
       int startIndex = 0;
       int maxLength = 0;
       int syllableLength;
       for(int i = 0; i < length; i++){
           for(int j = i; j < length; j++){
               syllableLength = j- i + 1;
               if(check(s, i, j) && syllableLength > maxLength){
                   startIndex = i;
                   maxLength = syllableLength;
               }
           }
       }

       return s.substring(startIndex, startIndex + maxLength);
    }

    private static boolean check(String s, int start, int end){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;

    }
}
