package day05;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {9, 666, 155, 520, 9999};
        start(arr);
    }

    public static void start(int[] arrs) {

        Scanner in = new Scanner(System.in);
        //写一个随机数进行
        Random ran = new Random();
        for (int i = 0; i < arrs.length; i++) {

            System.out.println("输入任意内容进行抽奖:");
            in.next();  //等待用户按回车继续
            while (true) {
                int index = ran.nextInt(5);  //随机生成 0 -4
                if (arrs[index] != 0) {
                    System.out.println("恭喜你，抽中了红包" + arrs[index]);
                    arrs[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束...");
    }
}
