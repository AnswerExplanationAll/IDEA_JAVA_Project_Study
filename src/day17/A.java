package day17;

public enum A {
    // 常量，每个常量都是记住枚举类的一个对象的。
    X, Y, Z;

    private String name;

    A() {

    }

    A(String name) {

    }

    public String getName() {
        return name;
    }
}
