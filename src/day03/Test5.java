package day03;

public class Test5 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
        int[] arr = new int[]{11, 22, 33};

        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
