package io.hackerrank.java;

public class GenericPrinter {
    public static void main(String[] args) {

    }
}

class Printer{
    public <T> void printArray(T[] array){
        for(T o : array){
            System.out.println(o);
        }

    }
}
