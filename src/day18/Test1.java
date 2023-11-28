package day18;

import day12.Cat;

public class Test1 {
    public static void main(String[] args) {
        //目标：掌握泛型类的定义和使用
//        MyArrayList<String> list = new MyArrayList<>();
//        list.add("java1");
//        list.add("java2");
//        String ele = list.get(1);
//        System.out.println(ele);
//
//        MyClass2<String,String> c2 = new MyClass2<>();
//        c2.put("abc","abcd");
//        Myclass3<Dog> c3 = new Myclass3<>();

        // 目标：掌握泛型接口的定义和使用
        // 场景：系统需要处理学生和老师的数据，需要提供两个功能，保存对象数据，根据名称查询数据
//        String rs = test("array");
//        System.out.println(rs);
//        Cat c = new Cat();
//        test(c);


    }

    public static <T> T test(T t) {
        return t;
    }

}
