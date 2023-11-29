package day20;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 4.2 自定义排序规则二
         */
        Student1[] students = new Student1[4];
        students[0] = new Student1("小狐狸", 169.5, 23);
        students[1] = new Student1("小青椒", 180, 19);
        students[2] = new Student1("小马书", 159.5, 25);
        students[3] = new Student1("小欢欢", 172.5, 17);


        //2. public static <T> void sort(T[]arr,Comparator<? super T> c)
        //参数1：需要排序的数组
        //参数2：Comparator比较器对象(用来指定比较对象的规则)
//        Arrays.sort(students, new Comparator<Student1>() {
//            @Override
//            public int compare(Student1 o1, Student1 o2) {
//                // 指定比较规则了： 左边对象o1，右边对象o2
////                约定1: 左边对象 大于 右边对象  请您返回正整数
////                约定2：左边对象 小于右边对象 请您返回负整数
////                约定3：左边对象等于右边对象 请您返回0
////                如果我们比较升高的话
////                return Double.compare(o1.getHeight(), o2.getHeight());  //升序
//                return Double.compare(o2.getHeight(),o1.getHeight());  //降序
//
//            }
//        });
//        // 使用Lambda表达式1
//        Arrays.sort(students, (o1, o2) -> {
//            // 指定比较规则了： 左边对象o1，右边对象o2
////                约定1: 左边对象 大于 右边对象  请您返回正整数
////                约定2：左边对象 小于右边对象 请您返回负整数
////                约定3：左边对象等于右边对象 请您返回0
////                如果我们比较升高的话
////                return Double.compare(o1.getHeight(), o2.getHeight());  //升序
//            return Double.compare(o2.getHeight(), o1.getHeight());  //降序
//        });
        System.out.println(Arrays.toString(students));
        // 使用Lambda表达式2
        Arrays.sort(students, (o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()));
        System.out.println(Arrays.toString(students));
    }
}

