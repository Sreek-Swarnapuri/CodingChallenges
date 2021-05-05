package com.goldenstudios.codingchallenges.geeks4geeks.math.medium;

public class ASimpleFraction {

    public static String fractionToDecimal(int numerator, int denominator) {
        String returnVal = String.valueOf((double) numerator / denominator);
        return returnVal.substring(returnVal.indexOf(".")).length() > 2
                ? returnVal.substring(0, returnVal.indexOf(".")) + ".(" + returnVal.substring(returnVal.indexOf(".") + 1, returnVal.indexOf(".") + 2) + ")"
                : returnVal;
    }

    public static void main(String[] args) {
        //System.out.println(fractionToDecimal(1, 3));
        //System.out.println(fractionToDecimal(5, 2));
        System.out.println(fractionToDecimal(523, 34));
    }
}