package loops;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the n Numbers");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("sum = " + sum);
    }
}
