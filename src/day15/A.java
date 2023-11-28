package day15;

public interface A {
    /**
     * 3.静态方法，必须使用static修饰，默认会被public修饰。
     * 可以通过接口.方法的形式访问
     */
    static void test3() {
        System.out.println("===静态方法===");

    }

    /**
     * 1.默认方法。必须使用default修饰，默认会被public修饰
     * 是一种实例方法，对象的方法，必须使用实现类的对象来访问。
     */
    default void test1() {
        System.out.println("====默认方法=====");
        test2();
        test3();
    }

    /**
     * 2.私有方法,必须使用private修饰，(JDK9开始支持)
     * 实例方法,对象的方法.只能通过接口内部的其他实例方法访问
     */
    private void test2() {
        System.out.println("===私有方法===");
        test1();
        test3();
    }
}
