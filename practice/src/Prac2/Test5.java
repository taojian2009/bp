package Prac2;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(ran.nextInt(10));
        }

    }
}

