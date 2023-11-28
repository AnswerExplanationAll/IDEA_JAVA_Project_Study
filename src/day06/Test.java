package day06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[1] = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨", "3.5万人想看");
        movies[2] = new Movie(3, "月球陨落", 42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
        movies[3] = new Movie(4, "一点到家", 35, 8.7, "徐宏宇", "刘昊然", "10.8万人想看");

        MovieOperator movieOperator = new MovieOperator(movies);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===电影信息系统====");
            System.out.println("1.查询全部电影");
            System.out.println("2.根据id查询电影显示详细信息");
            System.out.println("请输入您的选择:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    movieOperator.printAllMovies();
                    break;
                case 2:
                    //根据Id查询某个电影信息
                    System.out.println("请输入查询电影的id：");
                    int id = sc.nextInt();
                    movieOperator.searchMovies(id);
                    break;
                default:
                    System.out.println("您输入的命令有问题~~");
            }
        }

    }
}
