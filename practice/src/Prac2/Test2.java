package Prac2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("day 1");
                break;
            case 2:
                System.out.println("day 2");
                break;
            default:
                System.out.println("not found");
        }
    }
}
