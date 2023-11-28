package day09;

public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privateMethod() {
        System.out.println("private");
    }

    void method() {
        System.out.println("method");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    public void publicMethod() {
        System.out.println("publicMethod");
    }


}
