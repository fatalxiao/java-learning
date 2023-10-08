package org.example;

/**
 * 例六
 * 打印 100 以内的所有奇数
 */
public class OddNumbers {

    public static void main(String[] args) {

        // 遍历 100 以内的自然数 ( 0 ～ 99 )
        for (int n = 0; n < 100; n++) {
            //  判断当前的 n，如果对 2 取模为 1，则判断为奇数
            if (n % 2 == 1) {
                // 打印奇数 n
                System.out.println(n);
            }
        }

    }

}
