package day12;

public class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println(getName() + "喵喵的叫~~~");
    }
}
