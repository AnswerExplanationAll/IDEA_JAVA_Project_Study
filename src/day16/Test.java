package day16;

public class Test {
    public static void main(String[] args) {

        /**
         *  这是一个匿名内部类
         *  把这个匿名内部类编译成一个子类，然后会立即创建一个对象出来
         */
        new Animal() {
            @Override
            public void cry() {

            }
        };

        /**
         * 所以上面的代码相当于Animal的一个子类对象
         * 因此 我们可以将它赋值给Animal 作为一个对象来接受
         */
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("猫喵喵喵的叫~~");
            }
        };
        a.cry();
    }
}

abstract class Animal {
    public abstract void cry();
}
