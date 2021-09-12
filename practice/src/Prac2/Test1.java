package Prac2;

public class Test1 {
    public static void main(String[] args) {
        float price = 7988f;
        float sellPrice = 1500f;
        float m1 = price - sellPrice;
        float m2 = (float) (price * 0.8);
        if (m1 > m2) {
            System.out.println("抵押:" + Math.min(m1, m2));
        } else {
            System.out.println("出售:" + Math.min(m1, m2));
        }
    }
}
