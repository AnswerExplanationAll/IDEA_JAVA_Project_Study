package day05;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        // 目标完成验证码
        System.out.println(createCode(5));
    }

    public static String createCode(int n) {

        //定义一个随机数
        Random ran = new Random();

        //用于记住产生的每一位字符
        String code = "";

        //定义一个for循环控制产生多少位随机字符

        for (int i = 0; i <= n; i++) {

            //思路：随机一个0 1 2 之间的数字出来，0代表随机一个数字，1代表随机一个大写字母，2代表随机一个小写字母
            int type = ran.nextInt(3);
            switch (type) {
                case 0:
                    code += ran.nextInt(10);
                    break;
                case 1:
                    //随机产生一个大写字符 A 65  Z 65+25    (0-25)+65
                    char ch1 = (char) (ran.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    //随机产生一个小写字符 a 97  Z 97+25    (0-25)+97
                    char ch2 = (char) (ran.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
