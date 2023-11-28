package day10;

public class D extends C {
    String name = "子类名称";

    public void showName() {
        String name = "局部名称";
        System.out.println(name); //局部名称
        System.out.println(this.name); //子类名称
        System.out.println(super.name); //父类名称

    }
}
