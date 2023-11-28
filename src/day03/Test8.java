package day03;

public class Test8 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

//        定义一个临时变量 作为交换
        int temp = 0;
//        设计两个变量，一个在前，一个在后
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.println("反转或的结果为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
