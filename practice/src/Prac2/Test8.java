package Prac2;


public class Test8 {

    public static void main(String[] args) {
        System.out.println(getMax(12, 34, 232));
    }


    public static int getMax(int a, int b, int c) {
        int[] data = {a, b, c};
        int maxValue = a;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }
        }
        return maxValue;
    }
}
