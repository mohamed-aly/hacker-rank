package loops;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Insert Numbers: (t to terminate)");

        while (true) {
            try {
                number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } catch (Exception ex) {
                break;
            }
        }

        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

    }
}
