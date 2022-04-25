package loops;

public class Question13 {

    /*
    Write a program to print out all Armstrong numbers between 1 and 500.
    If sum of cubes of each digit of the number is equal to the number itself,
    then the number is called an Armstrong number.
    For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
     */

    public static void main(String[] args) {
        int digi1, digi2, digi3;

        int temp;

        for (int number = 1; number <= 500; number++) {
            temp = number;
            digi1 = temp % 10;
            temp = temp / 10;

            digi2 = temp % 10;
            temp = temp / 10;

            digi3 = temp % 10;

            if((digi1 * digi1 * digi1) + (digi2 * digi2 * digi2) + (digi3 * digi3 * digi3) == number){
                System.out.println(number);
            }
        }
    }
}
