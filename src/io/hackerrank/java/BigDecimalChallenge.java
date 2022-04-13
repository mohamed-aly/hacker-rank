package io.hackerrank.java;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalChallenge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        sc.close();

        Comparator<String> c = Comparator.comparing(
                p -> {
                    if(p != null){
                        return new BigDecimal(p);
                    }else {
                        return BigDecimal.ZERO;
                    }
                }, Comparator.reverseOrder());

        Arrays.sort(s, c);

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }




    }
}
