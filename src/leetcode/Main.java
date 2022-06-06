package leetcode;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long l = 1650868433449L;
        Timestamp ts = new Timestamp(l);
        System.out.println(ts.toLocalDateTime());
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
