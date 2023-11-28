package day03;

public class Test7 {
    public static void main(String[] args) {

        int[] arr = {15, 9000, 15000, 20000, 9500, -5};

//        定一个变量记录最大值
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为" + max);
    }
}
