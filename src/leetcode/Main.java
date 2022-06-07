package leetcode;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.parse("2022-06-06T09:06:00.000Z", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")).plusHours(4);

        System.out.println(3%7);

    }

    public static String timeConversion(String s) {
        // Write your code here
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        String output = null;
        try {
            date = df.parse(s);
            output = outputformat.format(date);
        } catch (Exception ex) {

        }

        return output;

    }
}
