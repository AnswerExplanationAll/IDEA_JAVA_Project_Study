package day04;

public class Test4 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30};
        change(arr);
        System.out.println("main内：" + arr[1]);
    }

    public static void change(int[] arrs) {
        System.out.println("方法内1:" + arrs[1]);
        arrs[1] = 22;
        System.out.println("方法内2:" + arrs[1]);
    }
}
