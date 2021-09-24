package io.hackerrank.java;

import java.util.Scanner;

public class StringI {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        if(A.matches("^[a-z]+$") && B.matches("^[a-z]+$")){
            System.out.println(A.length()+B.length());
            System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
            System.out.println(capitalize(A) + " " + capitalize(B));
        }

    }

    private static String capitalize(String s){
        String s1 = s.substring(0, 1).toUpperCase();
         return s1 + s.substring(1);
    }
}
