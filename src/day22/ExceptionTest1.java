package day22;

public class ExceptionTest1 {
    public static void main(String[] args) {
        // 需求：保存一个合法类
        try {
            saveAge(233);
            System.out.println("底层执行成功");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了BUG");
        }


        try {
            savgAge1(25);
            System.out.println("底层执行成功！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("底层出现了BUG");
        }

    }

    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println("年龄成功被保存~" + age);
        } else {
            //用一个异常类对象封装这个问题
            // throw 抛出去这个异常
            throw new AgeIllegalRunTimeException("/age is Illegal,your age is " + age);
        }
    }

    public static void savgAge1(int age) throws AgeIllegalException {
        if (age > 0 && age < 150) {
            System.out.println("年龄成功被保存~" + age);
        } else {
            //用一个异常类对象封装这个问题
            // throw 抛出去这个异常对象
            // throws 用在方法上 抛出方法内部的异常
            throw new AgeIllegalException("/age is Illegal,your age is " + age);
        }
    }
}
