package io.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if(first.length() <= 200 && second.length() <=200){
            BigInteger a = new BigInteger(first);
            BigInteger b = new BigInteger(second);

            if(a.compareTo(BigInteger.ZERO) >= 0  && b.compareTo(BigInteger.ZERO) >= 0){
                System.out.println(a.add(b));
                System.out.println(a.multiply(b));
            }
        }
    }
}
