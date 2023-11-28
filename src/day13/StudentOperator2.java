package day13;

import java.util.ArrayList;

public class StudentOperator2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("-----------班级学生信息如下--------------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("男生人数是:" + count1 + ",女生人数是:" + count2);
        System.out.println("班级总人数是:" + students.size());
        System.out.println("-------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double max = students.get(0).getSocre();
        double min = students.get(0).getSocre();
        double allScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSocre() > max) max = s.getSocre();
            if (s.getSocre() < min) min = s.getSocre();
            allScore += s.getSocre();
        }
        System.out.println("最高分:" + max);
        System.out.println("最低分:" + min);
        System.out.println("平均分为:" + (allScore - max - min) / ((students.size() - 2)));
    }
}
