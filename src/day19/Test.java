package day19;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 掌握Object类提供的常用方法


//        Student s1 = new Student("赵敏",23);
////        System.out.println(s1.toString()); toString方法
//        System.out.println(s1);  //在Student里面重写toString方法返回具体的内容
//
//        Student s2 = new Student("赵敏",23);
////        System.out.println(s2.equals(s1));  //返回false  比较两个对象的地址是否一致
//        System.out.println(s2.equals(s1));  //返回true   在Student里面重写equals方法比较字符串的内容
//
//        System.out.println(s2 == s1);

        String s1 = null;
        String s2 = "itheima";

//        System.out.println(s1.equals(s1.equals(s2)));

        System.out.println(Objects.equals(s1, s2));  //更安全，更好！

        System.out.println(Objects.isNull(s1));  //true
        System.out.println(Objects.isNull(s2));  //false

        System.out.println(Objects.nonNull(s1)); //false
        System.out.println(Objects.nonNull(s2)); // true

    }


}
