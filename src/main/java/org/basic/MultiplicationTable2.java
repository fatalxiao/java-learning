package org.basic;

/**
 * 例八
 * 输出完成的乘法口诀表
 * 打印结果：
 * 1 x 1 = 1	2 x 2 = 4	3 x 3 = 9	4 x 4 = 16	5 x 5 = 25	6 x 6 = 36	7 x 7 = 49	8 x 8 = 64	9 x 9 = 81
 * 1 x 2 = 2	2 x 3 = 6	3 x 4 = 12	4 x 5 = 20	5 x 6 = 30	6 x 7 = 42	7 x 8 = 56	8 x 9 = 72
 * 1 x 3 = 3	2 x 4 = 8	3 x 5 = 15	4 x 6 = 24	5 x 7 = 35	6 x 8 = 48	7 x 9 = 63
 * 1 x 4 = 4	2 x 5 = 10	3 x 6 = 18	4 x 7 = 28	5 x 8 = 40	6 x 9 = 54
 * 1 x 5 = 5	2 x 6 = 12	3 x 7 = 21	4 x 8 = 32	5 x 9 = 45
 * 1 x 6 = 6	2 x 7 = 14	3 x 8 = 24	4 x 9 = 36
 * 1 x 7 = 7	2 x 8 = 16	3 x 9 = 27
 * 1 x 8 = 8	2 x 9 = 18
 * 1 x 9 = 9
 */
public class MultiplicationTable2 {

    public static void main(String[] args) {

        // 遍历行索引 i ( 0 ~ 8 )
        for (int i = 0; i < 9; i++) {
            // 遍历列索引 j ( 0 ~ 8 )
            for (int j = 0; j < 9; j++) {
                // 计算被乘数
                int a = j + 1;
                // 计算乘数
                int b = j + i + 1;
                // 只打印乘数小于等于9的部分
                if (b <= 9) {
                    // 打印乘法算式
                    System.out.printf("%d x %d = %d\t", a, b, a * b);
                }
            }
            // 换行
            System.out.println();
        }

    }

}
