package day05;

public class Test4 {
    public static void main(String[] args) {
        //完成加密程序的开发
        System.out.println("加密后的结果为" + encrypt(8346));
    }

    /**
     * 数字加密
     *
     * @param number
     * @return
     */
    public static String encrypt(int number) {
        int[] numbers = split(number);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //对数组进行反转，交给一个方法来执行
        reverse(numbers);

        //把这些加密的数字拼接起来作为最后加密的结果
        String codeNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            codeNumber += numbers[i];
        }
        return codeNumber;
    }

    /**
     * 反转数组
     *
     * @param numbers
     */
    private static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            //定义临时变量，做交换媒介
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }
    }

    /**
     * 切割数字
     *
     * @param number
     * @return
     */
    private static int[] split(int number) {
        int[] numbers = new int[4];
        int k = 1;
        for (int i = 1; i < numbers.length; i++) {
            k *= 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number / k % 10;
            k /= 10;
        }
        return numbers;
    }
}
