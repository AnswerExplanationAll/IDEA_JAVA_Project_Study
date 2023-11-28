package day03;

public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};

        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);

        arr2 = null;

        System.out.println(arr2);

        System.out.println(arr2[0]);
    }
}
