package day14;

import java.util.ArrayList;

public interface StudentOperator {

    /**
     * 输出学生全部信息
     */
    void printShowMessage(ArrayList<Student> students);

    /**
     * 输出学生的平均分
     */
    void printShowAveage(ArrayList<Student> students);
}
