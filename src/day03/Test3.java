package day03;

public class Test3 {
    public static void main(String[] args) {
        int[] ages = new int[3];  //初始元素值为0

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 12;
        ages[1] = 24;
        ages[2] = 36;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("--------------------");
        char[] chars = new char[3];  //初始元素值为0
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println((int) chars[0]);
        System.out.println((int) chars[1]);
        System.out.println((int) chars[2]);
        System.out.println("--------------------");
        double[] scores = new double[3];  //初始元素值为0.0
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("--------------------");
        boolean[] flags = new boolean[100];  //初始元素值为false
        System.out.println(flags[0]);
        System.out.println(flags[99]);
        System.out.println("--------------------");
        String[] names = new String[100];  //初始元素值为null
        System.out.println(names[0]);
        System.out.println(names[99]);
    }
}
