package loops;

import java.util.Scanner;

public class Question4 {
    /*
    Write a program to find the factorial value of any number entered through the keyboard.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert Positive Number");
        int number = s.nextInt();
        if (number > 0) {
            System.out.println(factorial(number));
        }
    }

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
