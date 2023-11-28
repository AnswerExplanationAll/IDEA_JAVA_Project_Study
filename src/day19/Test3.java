package day19;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        System.out.println(getArr(arr));
    }

    public static String getArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
