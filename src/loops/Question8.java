package loops;

import java.util.Scanner;

public class Question8 {
    /*
    Write a program that prompts the user to input a positive integer.
    It should then output a message indicating whether the number is a prime number.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        boolean flag = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Number is prime" : "Number is not prime");
    }
}
