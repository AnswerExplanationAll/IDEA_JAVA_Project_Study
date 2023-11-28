package day07;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //1.创建一个ArrayList的集合对象
        ArrayList list = new ArrayList();
        list.add("回答");
        list.add(666);
        list.add(98.5);
        list.add("java");
        System.out.println(list);


//      从jdk1.7开始
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("李四");
        list1.add("张三");
        System.out.println(list1);
    }
}
