package leetcode;

public class ThousandSeparator {
    //2 333 211 355
    public String thousandSeparator(int n) {
        StringBuilder builder = new StringBuilder();
        String s = String.valueOf(n);
        int modulus = s.length() % 3;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i == modulus + (count * 3)) {
                if (i != 0) {
                    builder.append('.');
                }
                count++;
            }

            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
