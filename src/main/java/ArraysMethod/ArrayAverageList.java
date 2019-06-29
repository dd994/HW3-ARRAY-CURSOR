package main.java.ArraysMethod;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayAverageList {

    public static double getAverage(int[] arr, int numAfterDot) {
        double avSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (numAfterDot == 0) {
            avSum = Math.round((double) sum / arr.length);
        } else if (numAfterDot > 0) {
            double preAveSum = (double) sum / arr.length;
            avSum = new BigDecimal(preAveSum).setScale(numAfterDot, RoundingMode.UP).doubleValue();
        } else {
            System.out.println("Enter more than zero");
        }
        return avSum;
    }
}
