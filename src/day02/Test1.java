package day02;

public class Test1 {
    public static void main(String[] args) {
        //目标：需要if三种形式执行力流程

        //形式1
        double t = 38.9;
        if (t > 37) {
            System.out.println("这个人温度异常，赶紧带走");
        }
        //形式2
        double money = 19;
        if (money >= 90) {
            System.out.println("发红包成功了");
        } else {
            System.out.println("余额不足");
        }
        //形式3
        int score = 78;
        if (score >= 0 && score < 60) {
            System.out.println("你的级别为D");
        } else if (score >= 60 && score < 90) {
            System.out.println("你的级别为C");
        } else if (score >= 90 && score < 95) {
            System.out.println("你的级别为B");
        } else if (score >= 95 && score <= 100) {
            System.out.println("你的级别为A");
        } else {
            System.out.println("你输入的东西有问题");
        }
    }
}
