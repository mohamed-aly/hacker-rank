package loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Start Number");
        int current = scanner.nextInt(), next = current > 0 ? current + (current - 1) : 1;

        System.out.println("Insert end Number");
        int end = scanner.nextInt();

        if(current > end || current < 0){
            throw new IllegalArgumentException();
        }

        int limit = end - current;

        for(int i = 0; i < limit; i++){
            System.out.print(current + " ");
            int sum = current + next;
            current = next;
            next = sum;
        }

    }
}
