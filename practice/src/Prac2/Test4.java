package Prac2;

public class Test4 {
    public static void main(String[] args) {
        /*
            现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印。
         */
        double[] ds = {12.9, 53.54, 75.0, 99.1, 3.14};
        double minValue = ds[0];
        for (int i = 1; i < ds.length; i++) {
            if (ds[i] < minValue) {
                minValue = ds[i];
            }
        }
        System.out.println("the min values is : " + minValue);

    }
}
