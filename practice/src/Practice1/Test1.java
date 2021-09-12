/*
1、请编写程序，将某位学员的个人信息输出到屏幕上。信息包括姓名（字符串常量）、性别（字符常量）、年龄（整型常量）、身高（单位米，小数常量）、婚否（布尔常量）。输出格式如下：

张三
男
18
1.78
false
 */
package Practice1;
import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的姓名: ");
        String name = sc.next();
        System.out.print("请输入您的性别: ");
        String sex = sc.next();
        System.out.print("请输入您的年龄: ");
        int age = sc.nextInt();
        System.out.print("请输入您的身高: ");
        float height = sc.nextFloat();
        System.out.print("是否结婚: ");
        boolean isMarried = sc.nextBoolean();
        System.out.printf("姓名:%s\n性别: %s\n年龄:%s\n身高：%s\n是否结婚:%s\n", name, sex, age, height, isMarried);
    }
}
