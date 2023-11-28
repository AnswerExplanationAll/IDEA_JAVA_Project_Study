package day18;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // 目标认识泛型
        ArrayList<String> list = new ArrayList<String>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        String rs = list.get(2);
        System.out.println(rs);

        //2.泛型不支持基本数据类型，只能支持对象类型（应用数据类型）
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(15.0);
    }

}