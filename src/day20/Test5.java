package day20;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) {
        Student1[] students = new Student1[4];
        students[0] = new Student1("小狐狸", 169.5, 23);
        students[1] = new Student1("小青椒", 180, 19);
        students[2] = new Student1("小马书", 159.5, 25);
        students[3] = new Student1("小欢欢", 172.5, 17);
        Arrays.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
//        // 方式2
        Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
//        //方式3  静态方法引用
        Arrays.sort(students, Test5::compareByData);   //参数二是   类名::静态方法名
        System.out.println(Arrays.toString(students));


        //方式4  实例方法引用
        // 创建对象
        Test5 st1 = new Test5();
        Arrays.sort(students, st1::compareTotalBydata);
//        System.out.println(Arrays.toString(students));
    }

    /**
     * 静态方法的引用   用于Lambda表达式的简写
     *
     * @param o1
     * @param o2
     * @return
     */
    public static int compareByData(Student1 o1, Student1 o2) {
        return Double.compare(o2.getHeight(), o1.getHeight());
    }

    public int compareTotalBydata(Student1 o1, Student1 o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
