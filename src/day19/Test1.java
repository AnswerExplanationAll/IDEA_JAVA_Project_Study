package day19;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //目标掌握包装类的使用

//        Integer a1 = new Integer(12);  过时了

        //基本数据类型包装成 对象
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        // 自动装箱机制。 可以自动把基本数据类型转化为对象
        Integer a3 = 12;

        // 自动拆箱 可以自动把包装类型的对象转化为对应的基本数据类型
        int a4 = a3;

        // 泛型和集合不支持基本数据类型，只能支持引用数据类型
//        ArrayList<int> list = new ArrayList<int>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);  //自动装箱
        list.add(13);   //自动装箱

        int rs = list.get(1); //自动拆箱
        System.out.println("----------------------------");

        // 1. 把基本数据类型转化为字符串
        Integer a = 23;
        String str1 = Integer.toString(a);
        System.out.println(str1 + 1); //231

        String str2 = a.toString();  //23
        System.out.println(str2 + 1);   //231

        String str3 = "" + a; //23
        System.out.println(str3 + 1); //231

        //2.把字符串类型的数值转化为对应的基本类型
//        String str_age = "29";
//        int age1 = Integer.parseInt(str_age);  //29
//        System.out.println(age1+1); //30
//
//        String str1_score = "99.5";
//        double score = Double.parseDouble(str1_score); //99.5
//        System.out.println(score+0.5);  //100

        //以上两种情况可以用另一种更优秀的方法来进行转化
        String str_age = "29";
        int age1 = Integer.valueOf(str_age);  //29
        System.out.println(age1 + 1); //30

        String str1_score = "99.5";
        double score = Double.valueOf(str1_score); //99.5
        System.out.println(score + 0.5);  //100


    }

}
