package Prac2;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        /*
        小李用自己的钱买了十只股票，
        年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
        请使用数组相关知识编程，
        帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
        赚钱的股票一共有：4只
        赔钱的股票一共有：6只
         */
        String[] percents = {"10.4%", "-3%", "-6.2%", "1.2%", "-6.1%", "-19%", "-3.8%", "0.9%", "-4.5%", "5.5%" };
        int earnCount = 0;
        int lossCount = 0;
        System.out.println(Arrays.toString(percents));
        for (String percent : percents
        ) {
//            if (percentToFloat(percent) > 0) {
//                earnCount++;
//            } else {
//                lossCount++;
//            }
            if (!percent.contains("-")) {
                earnCount++;
            } else {
                lossCount++;

            }
        }
        System.out.println("earn: " + earnCount + ",\nloss:" + lossCount);
    }

    public static float percentToFloat(String percent) {
        try {
            return Float.parseFloat(percent.split("%")[0]) / 100;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
