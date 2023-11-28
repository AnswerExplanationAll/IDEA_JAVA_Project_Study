package day04;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }

    /**
     * 求和
     *
     * @param n
     * @return sum
     */
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
