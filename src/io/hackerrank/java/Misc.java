package io.hackerrank.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Misc {



    public static void main(String[] args) {

        System.out.println(leastNumber(1,2,5,0));
    }

    public static int leastNumber(int... numbers){
        int leastNumber = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < leastNumber){
                leastNumber = numbers[i];
            }
        }

        return leastNumber;
    }


}
