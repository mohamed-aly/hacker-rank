package io.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        if(n.length() <= 100){
            BigInteger number = new BigInteger(n);
            if(number.isProbablePrime(1)){
                System.out.println("prime");
            }else {
                System.out.println("not prime");
            }
        }

        bufferedReader.close();
    }
}
