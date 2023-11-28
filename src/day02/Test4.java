package day02;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

//        随机产生1-100的数
        Random ran = new Random();
        int LuckyNumber = ran.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            //提示用户猜测
            System.out.println("请输入你的猜测数字：");
            int gussNumber = sc.nextInt();
//            判断用户猜测的数字
            if (gussNumber > LuckyNumber) {
                System.out.println("你猜测的数字过大");
            } else if (gussNumber < LuckyNumber) {
                System.out.println("你猜测的数字过小");
            } else {
                System.out.println("恭喜你，猜对啦，可以买单了");
                break;
            }
        }
    }
}
