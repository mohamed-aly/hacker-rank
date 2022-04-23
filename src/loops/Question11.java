package loops;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the numbers (t to terminate)");

        int number;

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        while (true) {
            try {
                number = scanner.nextInt();
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }

            } catch (Exception e) {
                break;
            }
        }

        System.out.println("Positives count: " + positiveCount + "\n" +
                "Negatives Count: " + negativeCount +"\n" +
                "Zeros: " + zeroCount);
    }
}

