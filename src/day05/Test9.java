package day05;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int[] numbers = userSelectNumbers();
        printArray(numbers);
        int[] luckNumber = createLuckyNumber();
        printArray(luckNumber);
        judge(numbers, luckNumber);
    }

    public static void printArray(int[] number) {
        System.out.print("[");
        for (int i = 0; i < number.length; i++) {
            System.out.print(i == number.length - 1 ? number[i] : number[i] + ",");
        }
        System.out.println("]");
    }

    public static int[] userSelectNumbers() {
        int[] number = new int[7];
        //抽前六个红球号码
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < number.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码:(1-33之间选择，不能重复)");
                int num = in.nextInt();
                if (num >= 1 && num <= 33) {
                    if (existsNumber(number, num)) {
                        System.out.println("您输入的号码重复，请重新输入");
                    } else {
                        number[i] = num;
                        break;
                    }
                } else {
                    System.out.println("您输入的号码不在范围内，请确认");
                }
            }
        }
        //抽第七个蓝色球号码
        while (true) {
            System.out.println("请输入最后一个蓝球号码（1-16）");
            int sum = in.nextInt();
            if (sum >= 1 && sum <= 16) {
                number[6] = sum;
                break;
            } else {
                System.out.println("您输入的号码不在范围内，请确认");
            }
        }
        return number;
    }

    /**
     * 判断号码是否存在
     *
     * @param number
     * @param num
     * @return
     */
    public static boolean existsNumber(int[] number, int num) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0) {
                break;
            }
            if (num == number[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 生成幸运号码
     *
     * @return
     */
    public static int[] createLuckyNumber() {
        int[] number = new int[7];

        Random ran = new Random();
        /*随机生成1-33之间的号码，不重复！*/
        for (int i = 0; i < number.length - 1; i++) {
            while (true) {
                int num = ran.nextInt(33) + 1;
                if (!existsNumber(number, num)) {
                    number[i] = num;
                    break;
                }
            }
        }
        number[6] = ran.nextInt(16) + 1;
        return number;
    }

    /**
     * 判断中奖情况
     *
     * @param userNumbers
     * @param luckyNumber
     */
    public static void judge(int[] userNumbers, int[] luckyNumber) {

        //中红球、中蓝色球数量
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckyNumber.length; j++) {
                if (userNumbers[i] == luckyNumber[j]) {
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝色球是否命中
        blueCount = userNumbers[6] == luckyNumber[6] ? 1 : 0;
        System.out.println("您命中红球的数量是" + redCount);
        System.out.println("您命中蓝球的数量是" + blueCount);
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你中了10000万元，可以开始享受人生了~~");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中了500万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜你中奖200元");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("恭喜你中了5元");
        } else {
            System.out.println("感谢你对福利事业做出的巨大贡献~~");
        }
    }
}
