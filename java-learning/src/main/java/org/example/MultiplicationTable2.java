package org.example;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int a = j;
                int b = j + i - 1;
                if (b <= 9) {
                    System.out.printf("%d x %d = %d\t", a, b, a * b);
                }
            }
            System.out.println();
        }

    }

}