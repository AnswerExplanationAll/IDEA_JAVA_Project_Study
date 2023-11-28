package day13;

public class Student {
    private String name;
    private char sex;
    private double socre;

    public Student() {

    }

    public Student(String name, char sex, double socre) {
        this.name = name;
        this.sex = sex;
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }


    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }


}
