package day06;

public class StudentOperation {
    private Student student;

    public StudentOperation(Student student) {
        this.student = student;
    }

    public void PrintStudent() {
        if (student.getGrade() >= 60) {
            System.out.println("学生成绩及格");
        } else {
            System.out.println("学生成绩不及格");
        }
    }
}
