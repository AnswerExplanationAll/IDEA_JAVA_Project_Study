package day04;

public class Test1 {
    public static void main(String[] args) {
        int rs = sum(10, 20);
        System.out.println(rs);

        int bs = sum(34, 44);
        System.out.println(bs);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
