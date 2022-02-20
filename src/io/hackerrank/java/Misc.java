package io.hackerrank.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Misc {


    public static void main(String[] args) {

        System.out.println(leastNumber(2, 5, 2));
    }

    public static int leastNumber(int a, int b, int c) {
        int leastNumber;

        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }

    }


}
