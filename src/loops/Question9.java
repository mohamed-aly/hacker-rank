package loops;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor, remainder, hcf = 0;

        System.out.println("Insert first Number: ");
        dividend = scanner.nextInt();

        System.out.println("Insert Second Number: ");
        divisor = scanner.nextInt();

        do{
            remainder = dividend % divisor;
            if(remainder == 0){
                hcf = divisor;
            }else {
                dividend = divisor;
                divisor = remainder;
            }
        }while (remainder != 0);

        System.out.println("HCF is " + hcf);
    }
}
