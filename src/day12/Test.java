package day12;

import day11.Student;

interface Dirver {
    void dirver();

}

interface Ring {
    void sing();

}

public class Test {
    public static void main(String[] args) {

//        //目标掌握抽象类的好处：更好的支持多态性
//        Animal animal = new Cat();
//        animal.setName("叮当猫");
//        animal.showAnimal();
//
//        Animal animal1 = new Dog();
//        animal1.setName("拉布拉多");
//        animal1.showAnimal();
        //目标：认识接口
        System.out.println(A.SCHOOL_NAME);

        Dirver dir = new Y();
        dir.dirver();
    }
}

class Y implements Dirver {

    @Override
    public void dirver() {

    }
}

class X extends Y implements Dirver, Ring {

    @Override
    public void dirver() {

    }

    @Override
    public void sing() {

    }
}
