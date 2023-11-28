package day09;

public class B extends A {
    private int k;

    @Override
    public void print1() {
        System.out.println("6666");
    }

    @Override
    public void print2() {
        System.out.println("66666666");
    }

    public void print3() {
        System.out.println(i);
        print1();
    }
}
