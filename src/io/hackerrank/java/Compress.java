package io.hackerrank.java;

public class Compress {
    public static void main(String[] args) {
        System.out.println(compress("aaabbbcccd"));
    }

    private static String compress(String source) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i<source.length(); i++){
            int count = 1;

            while(i + 1 < source.length() && source.charAt(i) == source.charAt(i+1)){
                count++;
                i++;
            }

            builder.append(source.charAt(i));

            if(count > 1){
                builder.append(count);
            }
        }

        return builder.toString();
    }
}
