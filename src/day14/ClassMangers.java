package day14;


import java.util.ArrayList;

public class ClassMangers {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperator2();

    public ClassMangers() {
        students.add(new Student("迪丽热巴", '女', 99));
        students.add(new Student("古力娜扎", '女', 100));
        students.add(new Student("马尔扎哈", '男', 80));
        students.add(new Student("卡尔扎巴", '男', 60));
    }

    public void showAllMessage() {
        studentOperator.printShowMessage(students);
    }

    public void showAllAverage() {
        studentOperator.printShowAveage(students);
    }
}
