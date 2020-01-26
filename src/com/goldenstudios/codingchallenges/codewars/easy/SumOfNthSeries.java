package com.goldenstudios.codingchallenges.codewars.easy;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SumOfNthSeries {
    public static void main(String[] args)
    {
        System.out.println(seriesSum(4));
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(9));
        System.out.println(seriesSum(44));

    }

    public static String seriesSum(int n){

        Double sum = 0.0d;
        Double x = 1.0d;
        for(int i=0;i<n; i++){

            sum += (1/x);
            x += 3.0d;

        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(sum);

    }
}
