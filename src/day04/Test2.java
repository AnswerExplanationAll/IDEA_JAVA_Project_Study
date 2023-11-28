package day04;

public class Test2 {
    public static void main(String[] args) {
        printHelloWord();
        Print(5);
    }

    /**
     * 无参数的方法 无返回值
     */
    public static void printHelloWord() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Hello World");
        }
    }

    /**
     * 有参数 无返回值
     */
    public static void Print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello world");
        }
    }
}
