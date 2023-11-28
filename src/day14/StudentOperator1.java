package day14;

import java.util.ArrayList;

public class StudentOperator1 implements StudentOperator {

    /**
     * 方式1:输出全部信息
     */
    @Override
    public void printShowMessage(ArrayList<Student> students) {
        System.out.println("方式1-------班级学生信息------------------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别:" + s.getSex() + "，分数：" + s.getScore());
        }
    }

    /**
     * 方式1：输出平均分
     */
    @Override
    public void printShowAveage(ArrayList<Student> students) {
        System.out.println("方式1：-------平均成绩--------------");
        double allScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("平均分为:" + (allScore / students.size()));
        System.out.println("---------------------------------");
    }
}
