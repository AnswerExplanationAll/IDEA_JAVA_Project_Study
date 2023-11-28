package day13;

import java.util.ArrayList;

public class StudentOperator1 implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("--------全部学生信息如下-----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名:" + s.getName() + "性别:" + s.getSex() + "成绩:" + s.getSocre());
        }
        System.out.println("----------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double aScore = 0;
        System.out.println("--------全部学生的平均分----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            aScore += s.getSocre();
        }
        System.out.println("平均分" + (aScore) / students.size());
    }
}
