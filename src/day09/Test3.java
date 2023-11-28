package day09;

public class Test3 {
    public static void main(String[] args) {

        Student s1 = Student.getInstance();  //第一次拿对象
        Student s2 = Student.getInstance();
        System.out.println(s1 == s2);
//      认识和掌握继承的特点
        B b = new B();
        b.print1();
        b.i = 2;
        b.print3();

        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setSkill("java");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        teacher.printInfo();
    }
}
