public class Prac {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        char c = 'b';
        System.out.println(b + c);
        int maxValue = Math.max(a, b);
        System.out.printf("max value is %s\n", maxValue);
        // 字符串可以与任意类型拼接
        System.out.println("fu"+a);
        // & |  or && || 短路效果
    }
}

