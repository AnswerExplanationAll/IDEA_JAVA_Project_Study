package day04;

public class Test7 {
    public static void main(String[] args) {
        test();
        test(10);
        test(15, 16);
        test(14, 12.0);
        test(14.0, 11);
    }

    public static void test() {
        System.out.println("这是方法test没参数传递");
    }

    public static void test(int a) {

        System.out.println("这是方法重载1:" + a);
    }

    public static void test(int a, int b) {
        System.out.println("这是方法重载2:" + (a + b));
    }

    public static void test(int a, double b) {
        System.out.println("这是方法重载3:" + (a + b));
    }

    public static void test(double a, int b) {
        System.out.println("这是方法重载4:" + (a + b));
    }
}
