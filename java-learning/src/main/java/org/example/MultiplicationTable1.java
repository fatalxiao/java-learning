package org.example;

public class MultiplicationTable1 {

    public static void main(String[] args) {

        for (int b = 1; b <= 9; b++) {
            for (int a = 1; a <= 9; a++) {
                if (b >= a) {
                    System.out.printf("%d x %d = %d\t", a, b, a * b);
                }
            }
            System.out.println();
        }

    }

}