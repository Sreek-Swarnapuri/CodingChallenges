package com.goldenstudios.codingchallenges.codewars.easy;

public class DivSeven {

    // Points: 7kyu
    // Problem location: https://www.codewars.com/kata/55e6f5e58f7817808e00002e/train/java

    public static long[] seven(long m) {

        long[] ret = new long[]{0,0};
        int iterations = 0;

        if(m<100)
            return new long[]{m,0};

        while(true) {
            iterations++;
            m = (m/10 - (2*(m%10)));

            if(m < 100) {
                ret[0] = m;
                ret[1] = iterations;
                return ret;
            }
        }
    }

    public static void main(String[] args){

        printIn(1603);
        printIn(371);
        printIn(483);
        printIn(477557101);
        printIn(372);

    }

    static void printIn(long num){
        long[] op = DivSeven.seven(num);
        System.out.println(op[0] + " " + op[1]);
    }

}
