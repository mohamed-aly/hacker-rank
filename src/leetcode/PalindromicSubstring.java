package leetcode;

public class PalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(getPalindromesCount("abc"));
    }

    private static int getPalindromesCount(String s) {
        int count = s.length();
        for(int i =0; i < s.length(); i++){
            count += getPalindromesCount(s, i);
        }
        return count;
    }

    private static int getPalindromesCount(String s, int center) {
        int count = 0;
        count += getPalindromesCount(s, center, center + 1);
        count += getPalindromesCount(s, center-1, center +1);
        return count;
    }

    private static int getPalindromesCount(String s, int start, int end) {
        int count = 0;
        while (start>= 0 && end < s.length()){
            if(s.charAt(start--) != s.charAt(end++)){
                break;
            }
            count++;
        }

        return count;
    }


}
