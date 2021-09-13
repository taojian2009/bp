package Prac2;

public class Test7 {
    public static void main(String[] args) {
        int result = add(12, 23);
        System.out.println(result);

        float res = add(12.32f, 45.34f);
        System.out.println(res);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

}
