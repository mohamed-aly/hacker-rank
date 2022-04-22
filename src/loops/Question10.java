package loops;

import java.util.Scanner;

public class Question10 {
    /*
    Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop
    should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("insert two numbers");
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            System.out.println(first + second);

            System.out.println("Continue? y/n");
            choice = scanner.next();
        }while (choice.toLowerCase().charAt(0) == 'y');

    }
}
