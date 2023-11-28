package day03;

public class Test1 {
    public static void main(String[] args) {

//        静态初始化数组

//        数据类型[] 数组名 =  new 数据类型[]{元素1,元素2,元素3,元素4,...};
        int[] ages = new int[]{12, 24, 36};
        double[] scores = new double[]{89.0, 54.0, 23.0};

//        简化写法
        int[] ages1 = {12, 24, 36};
        double[] scores1 = {89.0, 54.0, 23.0};

//        数据类型[] 数组名 = 数据类型 数组名 []
        int ages2[] = {12, 24, 36};
        double socres[] = {33, 12.0};
        System.out.println(ages1[1]);


    }
}
