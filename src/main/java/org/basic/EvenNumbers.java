package org.basic;

/**
 * 例五
 * 打印 100 以内的所有偶数
 */
public class EvenNumbers {

    public static void main(String[] args) {

        // 遍历 100 以内的自然数 ( 0 ～ 99 )
        for (int n = 0; n < 100; n++) {
            // 判断当前的 n，如果对 2 取模为 0，则判断为偶数
            if (n % 2 == 0) {
                // 打印偶数 n
                System.out.println(n);
            }
        }

    }

}
