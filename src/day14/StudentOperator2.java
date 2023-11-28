package day14;

import java.util.ArrayList;

public class StudentOperator2 implements StudentOperator {
    @Override
    public void printShowMessage(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
            System.out.println("姓名" + s.getName() + "性别:" + s.getSex() + "分数：" + s.getScore());
        }
        System.out.println("男生人数:" + count1);
        System.out.println("女生人数:" + count2);
        System.out.println("总人数:" + students.size());
    }

    @Override
    public void printShowAveage(ArrayList<Student> students) {
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        double allScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
            if (s.getScore() > max) max = s.getScore();
            if (s.getScore() < min) min = s.getScore();
        }
        System.out.println("最高分:" + max);
        System.out.println("最低分:" + min);
        System.out.println("平均分:" + (allScore - min - max) / (students.size() - 2));

    }
}
