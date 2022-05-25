package algorithms;

public class Print {
    public static void main(String[] args) {
//        printStars(6, '#');
        printDiagonal(5);
//        printSpacesDiagonal(5);
//    printStairsDown(6, '1');
    }

    private static void printStars(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void printDiagonal(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < (count * 2) - 1; j++) {
                if (j < count -1 - i || j > count - 1 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print(Math.abs(count-j-1)+1);
                }

            }
            System.out.println();
        }
    }

    private static void printSpacesDiagonal(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= count * 2; j++) {
                if(j < count - i || j > count + i){
                    System.out.print(symbol);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printStairsUp(int count, char symbol){
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count; j++){
                if (j < count - 1 - i) {
                    System.out.print(" ");
                }else {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }


    private static void printStairsDown(int count, char symbol){
        for(int i = 0; i < count; i++){

            for(int j = 0; j < count; j++){
                if(j <= i){
                    System.out.print(symbol);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
