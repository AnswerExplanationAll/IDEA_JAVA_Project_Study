package day11;


public class Test1 {
    public static void main(String[] args) {
        /*// 认识多态、对象多态、行为多态

        // 1. 对象多态  满足子类对象赋给父类对象
        People1 p1 = new Teacher1();
        People1 p2 = new Student1();

        // 2. 行为多态
        p1.run();  //编译看左边，运行看右边: 就是编译的时候看People1对象中有没有run方法（没有会报错），而执行的时候执行右边的Teacher1里面的run方法
        p2.run();   //编译看左边，运行看右边 就是编译的时候看People1对象中有没有run方法（没有会报错），而执行的时候执行右边的Student1里面的run方法

        //这里需要注意，对于变量来说，它没有多态性。所以如果用p1，p2去调用变量的话，那么它只能是People1父类里面的成员变量*/

        // 1.多态的好处
        // 好处1：可以实现解耦合：右边的对象可以随时更换，后续业务随之改变
        People1 p1 = new Student1();
        p1.run();

        // 好处2：可以使用父类类型的变量作为形参，可以接收一切子类对象
        Student1 student1 = new Student1();
        Teacher1 teacher1 = new Teacher1();
        go(student1);
        go(teacher1);
        //这样做的可以实现，teacher1和student1对象可以同时进入go方法里面去
    }

    /**
     * 好处2：
     *
     * @param
     */
    public static void go(People1 people1) {
        //使用instanceof进行判断
        if (people1 instanceof Student1) {
            Student1 student3 = (Student1) people1;
            student3.test();
        } else {
            Teacher1 teacher11 = (Teacher1) people1;
            teacher11.tech();
        }
    }
}
