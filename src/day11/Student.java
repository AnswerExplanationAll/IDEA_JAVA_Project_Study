package day11;

public abstract class Student {
    private String name;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象方法，必须使用abstract修饰，只有方法签名，一定不能有方法体
    public abstract void run();
}
