package io.hackerrank.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Misc {


    public static void main(String[] args) {

        stonesSequence();
    }

    public static void stonesSequence() {
        Scanner scanner = new Scanner(System.in);
        String stones = scanner.nextLine();
        String instructions = scanner.nextLine();

        int lisPosition = 1;
        for(char instruction : instructions.toCharArray()){
            if(instruction == stones.charAt(lisPosition-1)){
                lisPosition++;
            }
        }

        System.out.println(lisPosition);
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
