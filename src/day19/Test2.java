package day19;

public class Test2 {
    public static void main(String[] args) {
        // 目标：搞清楚StringBuilder的用法和作用
//        StringBuilder s = new StringBuilder(); //  s  ""
        StringBuilder s = new StringBuilder("answer question");  // s answer question

        //1. 拼接内容
        s.append(12);
        s.append(" all");
        s.append(" true");

        //支持链式编程
        s.append(666).append("Hello world").append(7777);

        System.out.println(s);

        //2. 反转操作
        s.reverse();
        System.out.println(s);

        //3.返回字符串的长度
        System.out.println(s.length());

        //4. 把StringBuilder对象转化成String类型
        String str = s.toString();
        System.out.println(str);

        //目标掌握StringBuilder的好处
        //需求，拼接100万次abc
        //先用String测试性能  很慢
        /*String str1 = "";
        for(int i =1;i<=100000;i++){
            str1 +="abc";
        }
        System.out.println(str1);*/
        // 使用StringBuilder演示

        StringBuilder str2 = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            str2.append("abc");
        }
        System.out.println(str2);
    }
}
