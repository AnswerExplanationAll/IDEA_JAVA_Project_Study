package day05;

public class Test1 {
    public static void main(String[] args) {
        double price = Cacular(100, 11, "头等舱");
        System.out.println("优惠价为:" + price);
    }

    public static double Cacular(double price, int month, String type) {

        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.6;
                    break;
            }
        } else {
            //淡季
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
