package loops;

import java.util.Scanner;

public class Question5 {
    /*
    Two numbers are entered through the keyboard.
     Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert Number:");
        int number = s.nextInt();
        System.out.println("insert Power:");
        int power = s.nextInt();
        int sum = 1;

        for (int i = 0; i < power; i++) {
            sum *= number;
        }

        System.out.println(sum);
    }
}
