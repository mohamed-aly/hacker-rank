package io.hackerrank.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (A.matches("^[a-z]+$") && A.length() <= 50){
            boolean result = true;
            for(int i = 0; i < A.length()/2 ; i++){
                if(A.charAt(i) != A.charAt(A.length()-1-i)){
                    result = false;
                    break;
                }
            }

            System.out.println(result ? "Yes" : "No");
        }

    }
}
