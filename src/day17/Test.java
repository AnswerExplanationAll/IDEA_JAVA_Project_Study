package day17;

public class Test {
    public static void main(String[] args) {
        provideInfo(Constant.GIRL);
    }

    public static void provideInfo(Constant sex) {
        //方式一中的传入
//        switch (sex) {
//            case 0:
//                System.out.println("展示一些内容给男生看");
//                break;
//            case 1:
//                System.out.println("展示一些内容给女生看");
//                break;
//        }
        //方式二中的传入
        switch (sex) {
            case BOY:
                System.out.println("展示一些内容给男生看");
                break;
            case GIRL:
                System.out.println("展示一些内容给女生看");
                break;
        }
    }
}
