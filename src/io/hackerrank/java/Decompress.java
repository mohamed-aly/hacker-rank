package io.hackerrank.java;

import java.util.Arrays;

public class Decompress {
    public static void main(String[] args) {
        System.out.println(decompress("d4edf5c14e"));
    }

    private static String decompress(String compressed) {
        String[] chars = compressed.split("(?<=\\D)|(?<=\\D)(?=\\d+)|(?<=\\d)(?=\\D)");
        System.out.println(Arrays.toString(chars));
        StringBuilder result = new StringBuilder();

       int counter = 0;

       while (counter < chars.length){
           try{
               String letter = chars[counter];
               int reps =  Integer.parseInt(chars[counter + 1]);
               for(int i = 0; i < reps; i++){
                   result.append(letter);
               }
               counter += 2;
           }catch (Exception ex){
               result.append(chars[counter++]);
           }
       }


        return result.toString();
    }
}
