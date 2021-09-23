package io.hackerrank.java;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class FindDay {
    public static void main(String[] args) {
        System.out.println(findDay(9, 23, 2021));
    }

    public static String findDay(int month, int day, int year) {
        if(year>2000 && year < 3000){
            Calendar c = Calendar.getInstance(TimeZone.getDefault());
            c.set(year, month-1, day);
            Date date = c.getTime();
            String dayWeekText = new SimpleDateFormat("EEEE").format(date);
            return dayWeekText.toUpperCase();
        }
        return null;
    }
}
