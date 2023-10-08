package org.example;

public class MultiplicationTable1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j) {
                    System.out.printf("%d x %d = %d\t", j, i, j * i);
                }
            }
            System.out.println();
        }

    }

}