package day03;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            //提示用户录入5名员工的工号
            System.out.println("请您输入当前录入员工的工号：");
            int code = sc.nextInt();
            arr[i] = code;
        }
        //打乱数组中的元素顺序
        //定义一个临时变量 来作为交换
        int temp = 0;
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            //每遍历一次，都随机一个数组索引范围的值，然后让当前遍历数组的数据与该索引处的值进行交换
            int index = ran.nextInt(arr.length);  // 0 - 4
            //临时变量进行交换
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
