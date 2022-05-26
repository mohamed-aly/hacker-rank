package leetcode;

public class PalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(getPalindromesCount("aaa"));
    }
    public static int getPalindromesCount(String s){
        int length = s.length();
        int count = 0;

        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(check(s, i, j)){
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean check(String s, int i, int j){
        while (i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
