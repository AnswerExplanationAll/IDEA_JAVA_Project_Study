package day09;

public class Student {

    //2.定义一个类变量记住类的对象
    private static Student a;

    //1.把类的构造器设置为私有
    private Student() {

    }

    //3.定义一个类方法，这个方法保证第一次调用时才创建一个对象
    public static Student getInstance() {
        if (a == null) {
            System.out.println("第一次创建对象");
            a = new Student();
        }
        return a;
    }

}
