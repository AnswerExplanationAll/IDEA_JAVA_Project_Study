package day12;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void showAnimal() {
        System.out.println("今天的天气不错");
        cry();
        System.out.println(getName() + ",这些动物们都很活跃");
    }

    public abstract void cry();

}
