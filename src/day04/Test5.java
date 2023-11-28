package day04;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printArray(arr);
        int[] arr1 = {};
        printArray(arr1);
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
