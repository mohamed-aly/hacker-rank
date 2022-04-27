package loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        int max, current = 0, next = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you want to display?");
        max = scanner.nextInt();
        System.out.println("Printing Fibonacci Series till " + max + " elements");

        for(int i = 0; i < max; i++){
            System.out.print(current + " ");

          int sum = current + next;
          current = next;
          next = sum;
        }
    }
}
