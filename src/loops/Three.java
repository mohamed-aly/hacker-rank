package loops;

import java.util.Scanner;

public class Three {
    /*
    Write a program that prompts the user to input a positive integer.
    It should then print the multiplication table of that number.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert Positive Number");
        int number = s.nextInt();
        if(number > 0){
            for(int i = 1; i<13; i++){
                System.out.println(number + " × " + i + "= " + number * i);
            }
        }
    }
}
