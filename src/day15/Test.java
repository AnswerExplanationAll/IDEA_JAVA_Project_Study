package day15;

interface C {
    void testC();

}

interface D {
    void testD();
}

/**
 * 接口是可以多继承的
 */
interface E extends C, D {

}

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.test1();
        A.test3();
    }
}

class X implements E {

    @Override
    public void testC() {

    }

    @Override
    public void testD() {

    }
}