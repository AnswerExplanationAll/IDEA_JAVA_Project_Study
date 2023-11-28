package day03;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数:");
            double score = sc.nextDouble();
            scores[i] = score;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("选手的最终分数为：" + sum / scores.length);
    }
}
