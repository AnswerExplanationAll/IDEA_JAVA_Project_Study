package day20;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //day12-1.2 API-Runtime
//        test1();
        //day12-1.2 API-Runtime
//        test2();
        //2.1 Date日期类
//        test3();
        test4();
    }

    /**
     * day12-1.2 API-Runtime
     */
    public static void test1() {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory() / 1024.0 + "KB");  //1024 = 1k
        System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB");  //1024*1024 = 1MB
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");
    }

    /**
     * 1.3 API-BigDecimal讲解
     */
    public static void test2() {
        //目标：掌握BigDecimal的使用，解决小数运算失真问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);  // 0.30000000000000004
        System.out.println("---------------------------");

        //1.把他们编译成字符串封装成BigDecimal对象来运算
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //推荐用以下方式：把小数转化成字符串得到BigDecimal对象来使用。
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        // 这是加法~~
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        //这是减法~~
        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);
        //这是乘法~~
        BigDecimal c3 = a1.multiply(b1);
        System.out.println(c3);
        //这是除法~~
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c4);

        //除法的一个小小的问题
        BigDecimal i = new BigDecimal("0.1");
        BigDecimal j = new BigDecimal("0.3");
//        BigDecimal k = i.divide(j);   //这个结果是除不尽的，而BigDecimal是精度位，所以会报错
        //因此我们采用给小数点的方式告诉它保留多少位
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        //最后把BigDecimal转化为double类型的数据
        double kd = k.doubleValue();
        System.out.println(kd);

    }

    /**
     * 2.1 Date日期类
     */
    public static void test3() {
        // 目标拿到Date日期类的使用
        //1. 创建一个Date对象，代表系统当前时间信息的
        Date d = new Date();
        System.out.println(d);

        //2.拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        //3.把时间毫秒值转化成日期对象，2s之后的时间是多少
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);
        //4. 直接把日期对象的时间通过setTime方法进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }

    /**
     * 2.2 SimpleDateFormat
     */
    public static void test4() {
        //目标：掌握SimpleDateFormat的使用
        //1. 准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        //2.格式化日期对象，时间，毫秒值
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM年dd日 HH:mm:ss EEE a");
        String str = simpleDateFormat.format(d);
        System.out.println(str);
    }

    public static void test5() {

    }

    public static void test6() {

    }

}
