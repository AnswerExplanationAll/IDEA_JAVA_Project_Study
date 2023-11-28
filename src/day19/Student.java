package day19;

import java.util.Objects;

//Cloneable是一个标记接口 ， 规则
public class Student implements Cloneable {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //去调用父类object中的clone方法
        return super.clone();
    }

    /**
     * 重写equals方法，比较两个对象的内容，一样就返回true
     * 比较者 this
     * 被比较者 o
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        //1.比较两个对象的地址是否一样，一样直接true
        if (this == o) return true;
        //2. 判断o是null直接返回false，或者比较他们两者的类型不一样直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        //3. o 不是null，且o一定是Student学生类型的对象的话，开始比较内容了。
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
}
