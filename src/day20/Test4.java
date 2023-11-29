package day20;

interface Swimming {
    void swim();
}

public class Test4 {
    public static void main(String[] args) {
        //1.匿名内部类的基本写法
//        Animal a = new Animal(){
//            public void run(){
//                System.out.println("狗快的贼快~~");
//            }
//        };
//        a.run();
        // 2. 这里的Lambda表达式为什么会报错呢
//        Animal a = ()->{
//            System.out.println("狗跑的贼快~~");
//        };
//        a.run();
        //3. 上面的Lambda表达式报错的原因是因为：Lambda表达式有一定的使用前提。----  使用Lambda表达式必须是简化函数式的接口
        // 什么式简化函数式接口呢？ 就是有且仅有一个抽象方法的接口  才能用Lambda表达式

        //4. 我们使用Swimming来说明
//        Swimming swimming = new Swimming() {
//            public void swim() {
//                System.out.println("学生在游泳~~~");
//            }
//        };
//        swimming.swim();

        //5.上面的Swimming可以简化成
        Swimming swimming = () -> {
            System.out.println("学生在游泳~~~~");
        };
        swimming.swim();
        // Lambda写法2
        Swimming swimming1 = () -> System.out.println("学生在游泳");
        swimming1.swim();

        //以上就是Lambda表达式的基本写法和用法
    }
}

abstract class Animal {
    abstract void run();
}
