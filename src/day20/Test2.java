package day20;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        /**
         * 4.1 自定义排序规则
         */
        Student[] students = new Student[4];
        students[0] = new Student("小狐狸", 169.5, 23);
        students[1] = new Student("小青椒", 169.5, 19);
        students[2] = new Student("小马书", 169.5, 25);
        students[3] = new Student("小欢欢", 169.5, 17);
        // public static void sort(类型[] arr): 对数组进行排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

/**
 * 4.1 自定义排序规则
 */
// 这里自定义排序规则以后 给类加上Comparable接口 并指定它要比较规则的类型 然后重写它里面compareTo方法
class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    public Student() {

    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    /**
     * 重写Comparable接口的compareTo方法
     *
     * @param o the object to be compared.
     * @return 比较规则
     */
    @Override
    public int compareTo(Student o) {
//        这里有两点需要注意
//        this表示你要比较前的对象 o 表示比较的下一个对象
//        约定1：左边的对象  大于  右边的对象  请您返回正整数
//        约定2：左边的对象  小于  右边的对象  请您放回负整数
//          约定3： 左边的对象  等于  右边的对象  请您返回0
//            这里我们根据约定  先比较年龄age
        return this.age - o.age;   //升序
//        return o.age - this.age; //降序
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}