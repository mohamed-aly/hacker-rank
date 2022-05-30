package leetcode;

public class PalindromReplace {
    public static void main(String[] args) {
        String s1 = "bab??a";
        System.out.println(solution(s1));
    }

    public static String solution(String S) {
        StringBuilder builder = new StringBuilder(S);
        for (int i = 0; i < S.length() / 2; i++) {
            int j = S.length() - 1 - i;
            if (S.charAt(i) == '?' && S.charAt(j) == '?') {
                builder.setCharAt(i, 'a');
                builder.setCharAt(j, 'a');
            } else if (S.charAt(i) == '?' && S.charAt(j) != '?') {
                builder.setCharAt(i, S.charAt(j));
            } else if (S.charAt(i) != '?' && S.charAt(j) == '?') {
                builder.setCharAt(j, S.charAt(i));
            } else {
                return "No";
            }
        }

        return builder.toString();
    }


}
