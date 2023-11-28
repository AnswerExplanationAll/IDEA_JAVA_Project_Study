package day13;

import java.util.ArrayList;

public class ClassManager {
    private final ArrayList<Student> students = new ArrayList<>();
    private final StudentOperator studentOperator = new StudentOperator1();

    public ClassManager() {
        students.add(new Student("迪丽热巴", '女', 99));
        students.add(new Student("古力娜扎", '女', 100));
        students.add(new Student("马尔扎哈", '男', 80));
        students.add(new Student("卡尔扎巴", '男', 60));
    }

    public void printInfo() {
        studentOperator.printAllInfo(students);
    }

    public void printScore() {
        studentOperator.printAverageScore(students);
    }
}
