package day16;

public class Outer {
    public static String school_name;
    private int age;

    //静态内部类
    public static class Inner {
        private static int a;
        private String name;

        public static void test2() {
//            System.out.println(age);   会报错
            System.out.println(school_name);
        }

        public void test() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
