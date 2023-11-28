package day02;

public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 0.1;
        double b1 = 0.2;
        double c = b + b1;
        System.out.println(c);
//        输出结果是0.30000000000000004这是java的一个精度问题

        switch (a) {
            case 10:
                System.out.println("这是a的值" + a);
                break;
            case 20:
                System.out.println("星期2");
                break;
            case 30:
                System.out.println("这是30");
                break;
        }
        String x = "456";
        switch (x) {
            case "123":
                System.out.println("进入了123中");
                break;
            case "456":
                System.out.println("这是456");
                break;
        }
    }
}
