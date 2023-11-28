package day02;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //掌握使用Random生成随机数

//        创建一个random对象
        Random ran = new Random();
//        调用Random提供的方法
        int data = ran.nextInt(10); //0 - 9

        System.out.println(data);

//        生成1 - 10 之间的随机数
        int s = ran.nextInt(10) + 1;
        System.out.println(s);
    }
}
