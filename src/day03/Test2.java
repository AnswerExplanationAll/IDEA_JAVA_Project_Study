package day03;

public class Test2 {
    public static void main(String[] args) {
        int[] money = {26, 36, 46, 6, 100};
        int sum = 0;
        // 数组名.fori;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("求和的结果为" + sum);
    }
}