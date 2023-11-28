package day05;

public class Test7 {
    public static void main(String[] args) {
        //完成查找素数
        System.out.println("当前素数的个数是:" + search(101, 200));
    }

    public static int search(int start, int end) {
        //计数
        int count = 0;

        //为外部循环指定标签
        for (int i = start; i <= end; i++) {
            if (check(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static boolean check(int data) {
        for (int i = 2; i < data / 2; i++) {
            if (data % i == 0) {
                return false;
            }
        }
        return true;
    }
}
