package day20;

import java.util.Arrays;
import java.util.Comparator;

public class Test6 {
    public static void main(String[] args) {
        String[] arr = {"abc", "hdug", "adut", "Ahudh", "sdhku"};
        Arrays.sort(arr); //默认按照字符串的编号进行升序编号
        System.out.println(Arrays.toString(arr));

        // 要求忽略大小写进行排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //指定比较规则  o1 = “abc” o2="Ahudh"
                return o1.compareToIgnoreCase(o2);
            }
        });

        // 简化 Lambda 表达式
        Arrays.sort(arr, (o1, o2) -> o1.compareToIgnoreCase(o2));  //o1作为方法的主调 ,其后所有的参数都是作为实例方法入参的。此时可以使用特定类型的方法引用
        // 特定方法的引用  直接省略  意思和前面两种写法一样。
        Arrays.sort(arr, String::compareToIgnoreCase);
    }
}
