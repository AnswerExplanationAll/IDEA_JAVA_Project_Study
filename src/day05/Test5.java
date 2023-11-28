package day05;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = Copy(arr);
        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    /**
     * 拷贝数组
     *
     * @param arr
     * @return
     */
    public static int[] Copy(int[] arr) {

        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        return arr2;
    }
}
