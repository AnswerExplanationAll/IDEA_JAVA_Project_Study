package day07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类，负责上架和浏览功能的实现
 */
public class Foodoperator {

    // 1. 定义一个ArrayList集合对象，负责存储菜品对象信息
    private final ArrayList<Food> foodList = new ArrayList<>();

    // 2. 开发功能，上架菜品功能
    public void addFood() {
        // 3. 创建一个菜品对象，封装菜品信息
        Food f = new Food();

        //4. 录入菜品信息
        Scanner in = new Scanner(System.in);
        System.out.println("请您输入菜品名称:");
        String name = in.next();
        f.setName(name);

        System.out.println("请您输入菜品价格");
        double price = in.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入该菜品的描述");
        String desc = in.next();
        f.setDesc(desc);

        // 5. 把菜品对象存入到集合中
        foodList.add(f);
        System.out.println("上架成功!");

    }

    public void showAllFoods() {
        if (foodList.size() == 0) {
            System.out.println("什么菜品都么有，需要上架哟！");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("-----------------");
        }
    }

    /**
     * 负责展示操作界面
     */
    public void start() {
        while (true) {
            System.out.println("请选择功能:");
            System.out.println("1. 上架菜品");
            System.out.println("2. 展示菜品");
            System.out.println("3. 退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择您的操作:");
            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("欢迎下次光临！");
                    return;  //干掉方法！
                default:
                    System.out.println("您输入的命令不存在");

            }
        }
    }

}
