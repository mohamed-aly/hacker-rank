package io.hackerrank.java;

import sun.security.provider.MD5;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()>=6 && s.length() <= 20 && s.matches("^[a-zA-Z0-9]+$")){
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter
                    .printHexBinary(digest).toLowerCase();
            System.out.println(myHash);
        }
    }
}
