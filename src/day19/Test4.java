package day19;

import java.util.StringJoiner;

public class Test4 {
    public static void main(String[] args) {
        //目标掌握StringJoiner的使用
        StringJoiner s = new StringJoiner(","); //间隔符
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s); //java1,java2,java3

        System.out.println(getArr(new int[]{11, 22, 33})); //[11,22,33]
    }

    public static String getArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(arr[i] + "");
        }
        return stringJoiner.toString();
    }
}
