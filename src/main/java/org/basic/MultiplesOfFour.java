package org.basic;

/**
 * 例四
 * 打印以 4 开头的乘法口诀表
 */
public class MultiplesOfFour {

    public static void main(String[] args) {

        // 遍历 4 ～ 9
        for (int n = 4; n <= 9; n++) {
            // 打印 4 x n 和结果
            System.out.printf("4 x %d = %d\n", n, 4 * n);
        }

    }

}
