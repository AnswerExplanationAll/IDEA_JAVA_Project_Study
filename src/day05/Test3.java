package day05;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("最终选手分数为:" + getScores(6));
    }

    public static double getScores(int n) {
        int[] arr = new int[n];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数:");
            int score = in.nextInt();
            arr[i] = score;
        }
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //求总和分数
            sum += arr[i];

            //求最大值
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return 1.0 * (sum - max - min) / (n - 2);
    }
}
