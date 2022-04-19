package loops;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert the number:");
        int number = s.nextInt();
        int reverse = 0;
        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println(reverse);
    }
}
